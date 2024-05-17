## Problema
Imagina que estás desarrollando una aplicación que necesita verificar si un número es un palíndromo, por ejemplo, en un sistema de control de calidad de números de serie o en una aplicación educativa que enseña conceptos matemáticos. Este programa ayuda a automatizar la verificación de palíndromos de manera eficiente.

### Enunciado del Problema
Desarrolla un programa en Java que verifique si un número entero es un palíndromo. Un número palíndromo es aquel que se lee igual de izquierda a derecha que de derecha a izquierda. El programa debe manejar números negativos apropiadamente.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
   - Utiliza el método `main` para probar el método `esPalindromo` con varios números.

2. **Definición del Método `esPalindromo`**:
   - Verifica si el número es negativo. Si es así, retorna `false` directamente.
   - Guarda el valor original del número para comparación posterior.
   - Inicializa una variable `numeroInvertido` a 0 para almacenar el número invertido.
   - Usa un bucle `while` para invertir el número:
      - Obtén el último dígito del número usando el operador `%`.
      - Añade el último dígito a `numeroInvertido` multiplicándolo por 10 y sumando el dígito.
      - Elimina el último dígito del número usando el operador `/`.
   - Compara el número original con el número invertido y retorna `true` si son iguales, de lo contrario, retorna `false`.

### Solución propuesta

1. **Método `main`**:
   - Prueba el método `esPalindromo` con varios números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `esPalindromo`**:
   - **Verificación de Número Negativo**:
     ```java
     if (numero < 0) {
         return false;
     }
     ```
     Verifica si el número es negativo. Si es así, retorna `false` directamente.

   - **Inicialización de Variables**:
     ```java
     int numeroOriginal = numero;
     int numeroInvertido = 0;
     ```
     Guarda el valor original del número en `numeroOriginal` y inicializa `numeroInvertido` a 0.

   - **Bucle `while` para Invertir el Número**:
     ```java
     while (numero > 0) {
         int ultimoDigito = numero % 10;
         numeroInvertido = numeroInvertido * 10 + ultimoDigito;
         numero /= 10;
     }
     ```
     Usa un bucle `while` para invertir el número. En cada iteración, obtiene el último dígito, lo añade a `numeroInvertido` y elimina el último dígito del número original.

   - **Comparación del Número Original con el Número Invertido**:
     ```java
     return numeroOriginal == numeroInvertido;
     ```
     Compara el número original con el número invertido. Si son iguales, el número es un palíndromo y retorna `true`; de lo contrario, retorna `false`.

### Conclusión

Este código es eficiente y claro, asegurando que se verifiquen correctamente los números palíndromos, incluyendo la adecuada gestión de números negativos. La estructura del programa facilita su comprensión y mantenimiento.