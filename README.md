## Problema
Imagina que estás desarrollando una aplicación para enseñar conceptos matemáticos básicos. Uno de los conceptos es encontrar los factores de un número. Este programa puede ser útil en una aplicación educativa para estudiantes de matemáticas o para cualquier persona que necesite analizar y entender los factores de un número dado.

### Enunciado del Problema
Desarrolla un programa en Java que imprima todos los factores de un número entero positivo. Si el número es menor que 1, el programa debe imprimir "Valor inválido".

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
    - Utiliza el método `main` para probar el método `imprimirFactores` con varios números.

2. **Definición del Método `imprimirFactores`**:
    - Verifica si el número es menor que 1. Si es así, imprime "Valor inválido" y retorna.
    - Usa un bucle `for` para iterar desde 1 hasta el número dado, inclusive.
    - Dentro del bucle, verifica si el número actual es un factor del número dado utilizando el operador `%`.
    - Si el número actual es un factor, imprímelo.

### Solución propuesta

Imprime todos los factores de un número entero positivo, manejando adecuadamente los casos donde el número es menor que 1.

1. **Método `main`**:
    - Prueba el método `imprimirFactores` con varios números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `imprimirFactores`**:
    - **Verificación de Número Válido**:
      ```java
      if (numero < 1) {
          System.out.println("Valor inválido");
          return;
      }
      ```
      Verifica si el número es menor que 1. Si es así, imprime "Valor inválido" y retorna.

    - **Bucle `for` para Encontrar Factores**:
      ```java
      for (int i = 1; i <= numero; i++) {
          if (numero % i == 0) {
              System.out.println(i);
          }
      }
      ```
      Usa un bucle `for` para iterar desde 1 hasta el número dado. Dentro del bucle, verifica si el número actual es un factor del número dado utilizando el operador `%`. Si el número actual es un factor, imprímelo.

### Conclusión

Este código es eficiente y claro, asegurando que se impriman correctamente todos los factores de un número entero positivo y manejando adecuadamente las entradas inválidas. La estructura del programa facilita su comprensión y mantenimiento.