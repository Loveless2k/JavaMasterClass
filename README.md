### El Condicional `while` en Java

El bucle `while` es una estructura de control en Java que permite ejecutar un bloque de código repetidamente mientras una condición especificada sea verdadera. Es útil cuando no se conoce de antemano el número exacto de iteraciones que se necesitan.

### Sintaxis del `while`

La sintaxis básica del bucle `while` es:

```java
while (condición) {
    // Código a ejecutar en cada iteración
}
```

#### Componentes del `while`

1. **Condición**: Una expresión booleana que se evalúa antes de cada iteración. Si la condición es `true`, se ejecuta el bloque de código dentro del bucle. Si es `false`, el bucle termina.
2. **Bloque de Código**: El conjunto de instrucciones que se ejecuta repetidamente mientras la condición sea verdadera.

### Ejemplo Básico

Aquí hay un ejemplo básico que utiliza un bucle `while` para imprimir los números del 1 al 5:

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("El valor de contador es: " + contador);
    contador++;
}
```

#### Explicación del Ejemplo

1. **Inicialización**: `int contador = 1;` inicializa la variable `contador` con el valor 1.
2. **Condición**: `contador <= 5;` el bucle continuará ejecutándose mientras `contador` sea menor o igual a 5.
3. **Incremento**: `contador++;` incrementa el valor de `contador` en 1 después de cada iteración.

### Ejemplo Avanzado: Leer Entrada del Usuario

Aquí hay un ejemplo más avanzado que utiliza un bucle `while` para leer entradas del usuario hasta que el usuario ingrese un número negativo:

```java
import java.util.Scanner;

public class LeerEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un número (negativo para salir): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            System.out.println("Ingresaste: " + numero);
            System.out.println("Ingresa otro número (negativo para salir): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa terminado.");
        scanner.close();
    }
}
```

#### Explicación del Ejemplo

1. **Inicialización**: Se declara la variable `numero` y se inicializa con el valor ingresado por el usuario.
2. **Condición**: `numero >= 0;` el bucle continuará ejecutándose mientras `numero` sea mayor o igual a 0.
3. **Leer Entrada**: Dentro del bucle, se lee otra entrada del usuario para actualizar el valor de `numero`.

### Buenas Prácticas y Recomendaciones

1. **Evitar Bucles Infinitos**: Asegúrate de que la condición del `while` eventualmente se convierta en `false`. De lo contrario, el bucle seguirá ejecutándose indefinidamente.

2. **Condiciones Claras y Concretas**: La condición del bucle debe ser clara y fácil de entender. Evita condiciones complejas que puedan ser difíciles de leer y depurar.

3. **Actualizar Variables de Control**: Asegúrate de que las variables de control (como `contador` en el primer ejemplo) se actualicen correctamente dentro del bucle para evitar bucles infinitos.

4. **Uso de `break` y `continue`**: Utiliza `break` para salir del bucle antes de que la condición se vuelva `false`, si es necesario. Usa `continue` para saltar a la siguiente iteración del bucle sin terminar la actual. Usa estas declaraciones con moderación para mantener la claridad del código.

### Ejemplo con `break` y `continue`

```java
int numero = 0;

while (numero < 10) {
    numero++;
    if (numero % 2 == 0) {
        continue; // Salta a la siguiente iteración si el número es par
    }
    if (numero > 7) {
        break; // Termina el bucle si el número es mayor que 7
    }
    System.out.println("Número impar menor o igual a 7: " + numero);
}
```

#### Explicación del Ejemplo

- **`continue`**: Si `numero` es par, la sentencia `continue` hace que el control del bucle salte inmediatamente a la siguiente iteración, omitiendo el resto del bloque de código para esa iteración.
- **`break`**: Si `numero` es mayor que 7, la sentencia `break` termina el bucle inmediatamente, sin evaluar más iteraciones.

### Conclusión

El bucle `while` es una herramienta poderosa y flexible en Java, adecuada para situaciones donde el número de iteraciones no está predefinido. Seguir las buenas prácticas y recomendaciones mencionadas puede ayudar a escribir código más claro, eficiente y mantenible, evitando errores comunes como bucles infinitos.

## Problema
Imagina que estás trabajando en un sistema de análisis numérico donde necesitas identificar y contar números pares dentro de un rango específico y detener el conteo después de encontrar cinco números pares. Este programa automatiza esta tarea y proporciona una forma eficiente de realizar este análisis.

### Enunciado del Problema
Desarrolla un programa en Java que recorra los números entre dos valores dados, identificando y contando los números pares hasta encontrar cinco de ellos. El programa también debe contar y mostrar el número total de números impares encontrados durante la iteración.

### Paso a Paso para Resolver el Problema

1. **Inicialización de Variables**:
   - Declara e inicializa `numeroInicio` y `numeroFin` con los valores del rango.
   - Declara e inicializa `contadorPares` a 0 para contar los números pares encontrados.
   - Declara e inicializa `contadorImpares` a 0 para contar los números impares encontrados.

2. **Bucle `while` para Iterar sobre el Rango**:
   - Usa un bucle `while` para iterar desde `numeroInicio` hasta `numeroFin`.
   - La condición del bucle también verifica si se han encontrado menos de 5 números pares (`contadorPares < 5`).

3. **Verificación de Números Pares**:
   - Dentro del bucle, usa una condición `if` para verificar si el número actual es par utilizando el método `esNumeroPar`.

4. **Actualización de Contadores**:
   - Si el número es par, incrementa `contadorPares` y muestra el número.
   - Si el número no es par, incrementa `contadorImpares`.

5. **Incremento del Número de Inicio**:
   - Incrementa `numeroInicio` en cada iteración para avanzar al siguiente número.

6. **Impresión de Resultados Finales**:
   - Después de que el bucle termina, imprime el número total de números pares e impares encontrados.

### Solución propuesta

1. **Método `main`**:
   - **Declaración de Variables**:
     ```java
     int numeroInicio = 5;
     int numeroFin = 20;
     int contadorPares = 0;
     int contadorImpares = 0;
     ```
     Se declaran e inicializan las variables `numeroInicio`, `numeroFin`, `contadorPares` y `contadorImpares`.

   - **Bucle `while` para Iterar sobre el Rango**:
     ```java
     while (numeroInicio <= numeroFin && contadorPares < 5) {
     ```
     El bucle `while` itera desde `numeroInicio` hasta `numeroFin` y continúa mientras `contadorPares` sea menor que 5.

   - **Verificación de Números Pares**:
     ```java
     if (esNumeroPar(numeroInicio)) {
         System.out.println("Número par encontrado: " + numeroInicio);
         contadorPares++;
     } else {
         contadorImpares++;
     }
     ```
     Dentro del bucle, se verifica si `numeroInicio` es par usando el método `esNumeroPar`. Si es par, se incrementa `contadorPares` y se muestra el número. Si no es par, se incrementa `contadorImpares`.

   - **Incremento del Número de Inicio**:
     ```java
     numeroInicio++;
     ```
     Después de cada iteración, se incrementa `numeroInicio`.

   - **Impresión de Resultados Finales**:
     ```java
     System.out.println("Total de números pares encontrados: " + contadorPares);
     System.out.println("Total de números impares encontrados: " + contadorImpares);
     ```
     Después de que el bucle termina, se imprime el número total de números pares e impares encontrados.

2. **Método `esNumeroPar`**:
   - **Verificación de Paridad**:
     ```java
     return numero % 2 == 0;
     ```
     Este método verifica si un número es par devolviendo `true` si el residuo de `numero` dividido por 2 es 0.

Este código es eficiente y claro, asegurando que se encuentren y cuenten correctamente los números pares e impares dentro del rango especificado y deteniéndose después de encontrar cinco números pares.