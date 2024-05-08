# Switch
El **switch** es una estructura de control en Java que permite ejecutar diferentes bloques de código en función del valor de una variable. Es una alternativa más eficiente y legible a múltiples sentencias `if-else` cuando se trata de comparar una misma variable contra múltiples valores.

### Switch Tradicional

El switch tradicional en Java funciona como sigue:

1. **Sintaxis Básica**:
   ```java
   switch (variable) {
       case valor1:
           // Código a ejecutar si variable == valor1
           break;
       case valor2:
           // Código a ejecutar si variable == valor2
           break;
       default:
           // Código a ejecutar si la variable no coincide con ningún caso
   }
   ```
    - **variable**: Es la variable cuyo valor se evalúa.
    - **case**: Representa un valor específico que se compara con la variable.
    - **break**: Termina la ejecución del bloque switch y previene la ejecución de los siguientes bloques case (conocido como "fallthrough").
    - **default**: Opcional. Se ejecuta si ninguno de los casos coincide con el valor de la variable.

2. **Ejemplo**:
   ```java
   int mes = 3;
   switch (mes) {
       case 1:
           System.out.println("Enero");
           break;
       case 2:
           System.out.println("Febrero");
           break;
       case 3:
           System.out.println("Marzo");
           break;
       default:
           System.out.println("Otro mes");
   }
   ```
   En este ejemplo, imprimirá "Marzo" porque el valor de `mes` es 3.

### Switch Mejorado (Switch Expressions)

A partir de Java 12, se introdujo el switch mejorado o "switch expressions", que permite una sintaxis más flexible y funcional:

1. **Sintaxis Básica**:
   ```java
   String resultado = switch (variable) {
       case valor1 -> "Resultado1";
       case valor2 -> "Resultado2";
       default -> "Resultado por defecto";
   };
   ```
    - En lugar de bloques de código separados por `break`, cada caso devuelve directamente un valor.
    - Las flechas (`->`) separan los valores de los casos de sus resultados, eliminando la necesidad de `break`.

También existe una versión híbrida entre switch tradicional y switch expressions, que no incluye las flechas sino que mantiene los dos puntos en los case, pero sigue siendo en esencia un switch mejorado.
2. **Ejemplo**:
   ```java
   int dia = 2;
   String tipoDeDia = switch (dia) {
       case 1, 7: "Fin de semana";
       case 2, 3, 4, 5, 6: "Día laboral";
       default: "Entrada inválida";
   };
   System.out.println(tipoDeDia);
   ```
   Este ejemplo determina si un día es parte del fin de semana o un día laboral. Imprimirá "Día laboral" porque el valor de `dia` es 2.

### Diferencias Clave

- **Sintaxis**: El switch mejorado usa una sintaxis de flecha que simplifica los casos, eliminando la necesidad de `break`.
- **Uso de Expresiones**: El switch mejorado permite el retorno directo de valores, lo que lo hace útil en situaciones donde se necesita asignar un resultado a una variable basado en una condición.
- **Prevención de Fallthrough**: En el switch tradicional, omitir `break` puede causar que múltiples bloques se ejecuten secuencialmente, mientras que el switch mejorado evita esto por diseño.

### Buenas Prácticas y Consejos

- **Legibilidad**: Usa el switch mejorado cuando necesites una operación más expresiva y concisa, especialmente útil para asignar valores a variables basadas en una condición.
- **Prevención de errores**: El switch mejorado ayuda a evitar errores comunes como el fallthrough no intencional.
- **Compatibilidad**: Considera la versión de Java que estás usando, ya que el switch mejorado solo está disponible desde Java 12 en adelante.

## Problema
Supón que estás construyendo un sistema para un negocio que requiere realizar informes trimestrales. Necesitas saber en qué trimestre procesar cada informe basado en un mes dado. Este programa puede tomar el nombre de un mes como entrada y devolver el trimestre correspondiente, lo cual es esencial para organizar y programar los informes adecuadamente.

### Enunciado del Problema
Desarrolla un programa que determine en qué trimestre del año se encuentra un mes dado. El programa debe ser capaz de gestionar cualquier entrada de mes, independientemente de cómo se escriba (mayúsculas o minúsculas) y debe responder adecuadamente si el mes no es válido.
Vamos a añadir, además, un desafío.
Intenta programar tu solución con los 2 tipos de switch disponibles (3 si consideras el híbrido).

### Paso a Paso para Resolver el Problema

1. **Definir Constantes para los Meses:**
    - Define constantes para cada mes del año para evitar errores de tipeo y facilitar cambios en el código.

2. **Implementar Método para Obtener el Trimestre:**
    - Crea un método que utilice una declaración `switch` para determinar el trimestre basándose en el mes proporcionado.
    - Convierte el mes a mayúsculas para manejar diferentes formatos de entrada.
    - Usa bloques `case` para agrupar los meses en trimestres.
    - Retorna el trimestre correspondiente o un mensaje de error si el mes es inválido.

## Solución propuesta
El código presentado en la clase `CalculadorDeTrimestre` de Java ilustra diferentes formas de implementar el `switch` para determinar a qué trimestre del año pertenece un mes dado. El código muestra tres variantes: un `switch` tradicional, un `switch` híbrido (mezcla entre tradicional y de expresión), y un `switch` de expresión mejorado. Cada uno de estos métodos maneja el mismo conjunto de lógica de negocio, pero de manera ligeramente diferente en términos de sintaxis y estructura.

### Método `obtenerTrimestreSwitchTradicional`

Este método utiliza un `switch` tradicional, donde cada caso (`case`) concluye con un `break` para evitar el fallthrough. Esto es, sin el `break`, el programa seguiría ejecutando los casos subsiguientes hasta encontrar un `break` o hasta el final del `switch`.

```java
public static String obtenerTrimestreSwitchTradicional(String mes) {
    String trimestre = "";
    switch (mes.toUpperCase()) {
        case ENE, FEB, MAR:
            trimestre = "1er trimestre";
            break;
        case ABR, MAY, JUN:
            trimestre = "2do trimestre";
            break;
        case JUL, AGO, SEP:
            trimestre = "3do trimestre";
            break;
        case OCT, NOV, DIC:
            trimestre = "4do trimestre";
            break;
        default:
            trimestre = "Mes inválido";
    }
    return trimestre;
}
```

### Método `obtenerTrimestreSwitchHibrido`

Este método es un híbrido entre el `switch` tradicional y el `switch` de expresión, usando la estructura del `switch` tradicional pero con retornos directos en cada caso en lugar de usar una variable temporal y `break`. Esta forma aún evita el fallthrough al retornar directamente desde cada caso.

```java
public static String obtenerTrimestreSwitchHibrido(String mes) {
    switch (mes.toUpperCase()) {
        case ENE, FEB, MAR:
            return "1er trimestre";
        case ABR, MAY, JUN:
            return "2do trimestre";
        case JUL, AGO, SEP:
            return "3er trimestre";
        case OCT, NOV, DIC:
            return "4to trimestre";
        default:
            return "Mes inválido";
    }
}
```

### Método `obtenerTrimestreMejorado`

Este método emplea la forma completa de las `switch expressions` introducidas en Java 14, donde cada caso directamente retorna un valor usando `->`. Esta forma es más concisa y clara, eliminando la necesidad de `break` y simplificando la sintaxis general del `switch`.

```java
public static String obtenerTrimestreMejorado(String mes) {
    return switch (mes.toUpperCase()) {
        case ENE, FEB, MAR -> "1er trimestre";
        case ABR, MAY, JUN -> "2do trimestre";
        case JUL, AGO, SEP -> "3er trimestre";
        case OCT, NOV, DIC -> "4to trimestre";
        default -> "Mes inválido";
    };
}
```

### Método `agregaSaltoLinea`

Este método simple añade un salto de línea en la consola para separar las salidas de cada prueba del `switch`, mejorando la legibilidad de los resultados.

```java
public static void agregaSaltoLinea() {
    System.out.println("\n");
}
```

### Conclusión

El código demuestra cómo las diferentes formas de `switch` pueden ser utilizadas en Java para implementar la misma lógica de forma más o menos verbosa o elegante. La elección entre estas formas puede depender del estilo de codificación preferido, la claridad, o la versión de Java que se esté utilizando. El `switch` de expresión ofrece la mayor claridad y concisión, especialmente útil en situaciones donde múltiples valores retornan un resultado único de manera directa.