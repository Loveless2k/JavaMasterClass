# Operaciones básicas en Java
En Java, las operaciones básicas permiten realizar cálculos y manipulaciones de datos a través de diversos tipos de operadores. 
Estos operadores se pueden clasificar en varias categorías, cada una diseñada para un tipo específico de operación. 
A continuación, exploraremos los principales tipos de operadores en Java y proporcionaré ejemplos relevantes para cada uno.

## 1. Operadores Aritméticos
Estos operadores se utilizan para realizar operaciones matemáticas básicas como suma, resta, multiplicación, división y obtención de residuo.

  - `Suma (+)`: Suma dos valores.
  ```java
  
  int suma = 5 + 3; // suma es 8
  ```

  - `Resta (-)`: Resta el segundo valor del primero.
  ```java
  int resta = 5 - 3; // resta es 2
  ```

  - `Multiplicación (*)`: Multiplica dos valores.
  ```java
  int producto = 5 * 3; // producto es 15
  ```

  - `División (/)`: Divide el primer valor por el segundo. Importante tener en cuenta que la división entre enteros no genera decimales.
  ```java
  int division = 5 / 3; // division es 1 en aritmética entera
  double div = 5.0 / 3.0; // div es 1.66667
  ```

  - `Módulo (%)`: Devuelve el residuo de la división entre dos números.
  ```java
  int residuo = 5 % 3; // residuo es 2
  ```

## 2. Operadores de Asignación
Los operadores de asignación se utilizan para asignar valores a variables. El operador básico es `=`, pero hay otros que combinan asignación con operaciones aritméticas.

  - `Asignación (=)`: Asigna el valor de la derecha al operando de la izquierda.
  ```java
  int a = 10;
  ```

  - `Asignación compuesta (+=, -=, *=, /=, %=)`: Realiza una operación aritmética y luego asigna el resultado.
  ```java
  int b = 5;
  b += 3; // b es 8
  b *= 2; // b es 16
  ```

## 3. Operadores de Comparación
Estos operadores comparan dos valores y devuelven un booleano que indica si la comparación es verdadera o falsa.
Recuerda que un booleano es un tipo de dato que solo puede tener dos valores: `true` (verdadero) o `false` (falso). 

  - `Igual a (==)`: Verifica si dos valores son iguales.
  - `No igual a (!=)`: Verifica si dos valores no son iguales.
  - `Mayor que (>)`, `Menor que (<)`, `Mayor o igual que (>=)`, `Menor o igual que (<=)`: Verifica si un valor es mayor, menor, mayor o igual, o menor o igual que otro valor.
    
  ```java
  boolean mayor = 5 > 3; // mayor es true
  boolean menor = 5 < 3; // menor es false
  ```

## 4. Operadores Lógicos
Utilizados principalmente en expresiones booleanas para combinar condiciones.

  - `AND lógico (&&)`: Retorna true si ambos operandos son verdaderos.
  - `OR lógico (||)`: Retorna true si al menos uno de los operandos es verdadero.
  - `NOT (!)`: Invierte el valor de verdad del operando.

  ```java
  boolean resultado = (5 > 3) && (8 > 6); // resultado es true
  boolean contrario = !(5 > 3); // contrario es false
  ```

## 5. Operadores Bit a Bit
Estos operadores trabajan a nivel de los bits individuales de sus operandos.

  - `AND (&)`, `OR (|)`, `XOR (^)`, `Complemento (~)`, `Desplazamiento a la izquierda (<<)`, `Desplazamiento a la derecha (>>)`:

  ```java
  int x = 5; // 0101 en binario
  int y = x << 1; // Desplaza los bits de x una posición a la izquierda, resultado es 10
  ```

No te preocupes si estos operadores no te hacen mucho sentido ahora.
Abordaremos este tipo de operadores más adelante, en el futuro.

## 6. Operador Ternario
Es un operador condicional que toma tres operandos: una condición, un resultado si la condición es verdadera, y un resultado si es falsa.
Su sintaxis es la siguiente: `condición ? expresión1 : expresión2` donde:
  - `Condición`: Es una expresión que resulta en un valor booleano (true o false).
  - `Expresión1`: Esta expresión se evalúa y se devuelve si la condición es true.
  - `Expresión2`: Esta expresión se evalúa y se devuelve si la condición es false.

  ```java
  int edad = 20;
  String mensaje = edad >= 18 ? "Adulto" : "Menor de edad";
  ```

  - La condición es `edad >= 18`.
  - `Expresión1` es "Adulto", que es el valor asignado a mensaje si la condición es true.
  - `Expresión2` es "Menor de edad", que es el valor asignado a mensaje si la condición es false.
  - Por lo tanto, como edad es 20, que es mayor o igual a 18, la condición resulta `true`, y mensaje se establece en "Adulto".

### Los Comentarios
Los comentarios en Java son anotaciones en el código fuente que el compilador ignora, es decir, no tienen efecto en la ejecución del programa.
Su propósito principal es proporcionar información adicional sobre el código, hacerlo más comprensible para los desarrolladores humanos, y facilitar tanto la documentación como el mantenimiento del software. En Java, hay tres tipos principales de comentarios:

#### 1. Comentarios de una sola línea
Utilizan dos barras diagonales (//) y todo el texto que sigue a estas barras en la misma línea es tratado como un comentario. Son útiles para breves anotaciones o para desactivar rápidamente una línea de código durante las pruebas.

Ejemplo:
```java
// Esto es un comentario de una sola línea
int i = 10; // Este comentario sigue a una declaración
```

#### 2. Comentarios de varias líneas o comentarios en bloque
Empiezan con /* y terminan con */. Todo el texto encerrado entre estos dos marcadores se considera un comentario, independientemente de las líneas que ocupe.
Son útiles para descripciones más extensas o para comentar bloques de código durante la depuración o el desarrollo.

Ejemplo:
```java
/* Este es un comentario de varias líneas.
   Se puede utilizar para explicar con más detalle el código que le sigue
   o que está dentro de él. */
int x = 100;
```

#### 3. Comentarios de documento o Javadoc
Comienzan con /** y terminan con */. Estos comentarios son utilizados para generar documentación automática del código en formato HTML usando la herramienta Javadoc de Java.
Los comentarios Javadoc pueden incluir etiquetas que proporcionan información estructurada sobre el código, como parámetros de un método, valor de retorno, excepciones que puede lanzar, etc.

Ejemplo:
```java
/**
 * Calcula la suma de dos enteros.
 * @param a el primer entero.
 * @param b el segundo entero.
 * @return la suma de 'a' y 'b'.
 */
public int sumar(int a, int b) {
    return a + b;
}
```

El comentario que precede a la función convertirLibrasAKilogramos es un ejemplo de cómo utilizar comentarios de documentación en Java.
Estos comentarios están diseñados para ser procesados por la herramienta Javadoc de Java para generar documentación HTML automática del código.
Aquí se explica claramente:

- `Propósito de la función`: Describe qué hace la función —en este caso, convierte libras a kilogramos.
- `Parámetros`: Detalla los parámetros que acepta la función, incluyendo su tipo y significado.
- `Valor de retorno`: Describe lo que devuelve la función, permitiendo a otros desarrolladores entender rápidamente la funcionalidad sin necesidad de leer el código detalladamente.

El uso de este tipo de comentarios es crucial para mantener el código accesible y comprensible, especialmente en entornos donde varios desarrolladores trabajan en el mismo proyecto o cuando se prepara el código para su uso o revisión por otros en el futuro.

# Desafío **libras a kilogramos**
Imagina que estás cocinando una receta que fue diseñada en un país que utiliza el sistema métrico. 
Todos los ingredientes están listados en kilogramos, pero tu balanza solo mide en libras. 
Necesitas convertir las libras a kilogramos para agregar la cantidad correcta de cada ingrediente.

## Enunciado del Problema
Se necesita desarrollar un programa en Java que permita convertir una cantidad dada de libras a kilogramos. 
Este tipo de conversiones es común en muchas aplicaciones relacionadas con la ciencia, la ingeniería o incluso en la vida cotidiana cuando se trata de recetas de cocina o cálculos para envíos internacionales.

## Explicación del Problema
El programa debe tomar un valor de peso en libras y convertirlo a kilogramos utilizando el factor de conversión conocido: 1 libra equivale a aproximadamente 0.45359237 kilogramos.

## Paso a Paso para Resolver el Problema
  1. `Identificar el factor de conversión`: Saber que 1 libra es igual a 0.45359237 kilogramos.
  2. `Leer la cantidad de libras a convertir`: Este puede ser un valor ingresado por el usuario o definido directamente en el código.
  3. `Realizar la conversión matemática`: Multiplicar el número de libras por el factor de conversión para obtener el equivalente en kilogramos.
  4. `Mostrar el resultado`: Presentar el resultado de la conversión al usuario de manera clara.

## Input de Ejemplo:
Cantidad de libras a convertir: 200.

## Output de Ejemplo:
```java
Kilogramos convertidos = 90.718474
```

## Observaciones de la solución planteada
El código de la clase `LibrasAKilogramos` en Java es una aplicación sencilla diseñada para convertir un peso dado en libras a kilogramos. A continuación, se explica cada componente del código y su función:

### Componentes del Código

1. **Constante de Conversión**:
   ```java
   private static final double FACTOR_CONVERSION_LIBRAS_A_KILOGRAMOS = 0.45359237;
   ```
   Esta línea declara una constante (`static final`) llamada `FACTOR_CONVERSION_LIBRAS_A_KILOGRAMOS`. El valor `0.45359237` es el factor estándar utilizado para convertir libras a kilogramos. Al ser una constante, el valor no puede cambiar en ningún momento después de su inicialización, y al ser `static`, es compartido por todas las instancias de la clase.

2. **Método `main`**:
   ```java
   public static void main(String[] args) {
       double libras = 200;
       double kilogramosConvertidos = convertirLibrasAKilogramos(libras);
       System.out.println("Kilogramos convertidos = " + kilogramosConvertidos);
   }
   ```
   Este es el método principal (`main`) de la aplicación, el punto de entrada cuando se ejecuta el programa.
    - **Declaración e Inicialización de Variables**: Define una variable `libras` y la inicializa con `200`, representando el peso en libras que se desea convertir.
    - **Llamada a Función de Conversión**: Invoca el método `convertirLibrasAKilogramos`, pasando el valor de `libras` como argumento, y guarda el resultado retornado en `kilogramosConvertidos`.
    - **Impresión del Resultado**: Imprime el resultado de la conversión en la consola, mostrando el peso en kilogramos.

3. **Método `convertirLibrasAKilogramos`**:
   ```java
   public static double convertirLibrasAKilogramos(double libras) {
       return libras * FACTOR_CONVERSION_LIBRAS_A_KILOGRAMOS;
   }
   ```
   Este método es responsable de realizar la conversión de libras a kilogramos.
    - **Parámetro**: Recibe un valor de tipo `double` que representa el peso en libras.
    - **Proceso de Conversión**: Multiplica el valor en libras por la constante de conversión `FACTOR_CONVERSION_LIBRAS_A_KILOGRAMOS`.
    - **Retorno**: Devuelve el resultado de la multiplicación, que es el peso en kilogramos.

### Comentarios y Documentación
El código también incluye comentarios adecuados que explican el propósito y la funcionalidad de las constantes, métodos y operaciones realizadas. Esto incluye un comentario de documentación (JavaDoc) para el método `convertirLibrasAKilogramos`, que describe lo que hace el método, los parámetros que recibe y lo que retorna. Este tipo de documentación es crucial para mantener el código comprensible y mantenible, especialmente en entornos donde múltiples desarrolladores pueden trabajar en el mismo proyecto.

### Creación de una función adicional
Si bien en este curso aún no hemos cubierto las funciones, en este ejemplo te adelanto su utilidad.
En Java, el término "función" se usa a menudo de manera intercambiable con "método", aunque tradicionalmente en la programación, especialmente en otros lenguajes, pueden tener significados distintos.
En Java, una función es esencialmente un bloque de código que realiza una tarea específica, está encapsulado dentro de una clase y se llama método. Pero sobre esto entraremos en detalle más adelante.

La función convertirLibrasAKilogramos se crea para encapsular la lógica específica de la conversión de libras a kilogramos.
La decisión de separar esta lógica del cuerpo principal del método main tiene varios propósitos y beneficios:

- `Reusabilidad`: Al encapsular la lógica de conversión en su propia función, el código se puede reutilizar fácilmente en otras partes del programa sin necesidad de duplicar código. Si se necesitara realizar la misma operación en otro lugar, simplemente se podría llamar a esta función.
- `Organización`: Mejora la organización del código y lo hace más legible. Al tener la operación de conversión en una función separada, el método main se mantiene limpio y enfocado en la lógica de flujo del programa, como la entrada de datos y la presentación de resultados.
- `Mantenimiento`: Facilita la modificación y el mantenimiento del código, ya que cualquier cambio en el proceso de conversión se realiza en un solo lugar. Esto reduce el riesgo de errores y mejora la consistencia del código.

### Conclusión
Este programa demuestra cómo implementar una simple conversión de unidades en Java, utilizando prácticas de codificación claras y eficientes, incluyendo el uso de constantes para valores que no cambian, métodos bien definidos para tareas específicas y comentarios para mejorar la legibilidad del código. Es un ejemplo excelente de cómo manejar tareas numéricas y conversiones en programación.

