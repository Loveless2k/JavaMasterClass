## Problema
Imagina que estás desarrollando una aplicación educativa para enseñar conceptos matemáticos. Un número perfecto es un número entero positivo que es igual a la suma de sus divisores propios positivos (excluyendo el propio número). Este programa puede ser útil en una aplicación de enseñanza de matemáticas para mostrar ejemplos de números perfectos.

### Enunciado del Problema

Desarrolla un programa en Java que determine si un número entero positivo es un número perfecto. Un número perfecto es un número entero positivo que es igual a la suma de sus divisores propios positivos. Si el número es menor que 1, el programa debe retornar `false`.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
    - Utiliza el método `main` para probar el método `esNumeroPerfecto` con varios números.

2. **Definición del Método `esNumeroPerfecto`**:
    - Verifica si el número es menor que 1. Si es así, retorna `false`.
    - Inicializa una variable `sumaDivisoresPropiosPositivos` a 0 para almacenar la suma de los divisores propios positivos.
    - Determina el límite de iteración como la mitad del número (`numero / 2`), ya que ningún divisor propio positivo puede ser mayor que la mitad del número.
    - Usa un bucle `for` para iterar desde 1 hasta el límite:
        - Si el número actual (`i`) es un divisor del número dado (`numero % i == 0`), agréguelo a `sumaDivisoresPropiosPositivos`.
    - Compara la suma de los divisores propios positivos con el número original. Si son iguales, retorna `true`; de lo contrario, retorna `false`.

### Solución propuesta

Determina si un número entero positivo es un número perfecto, manejando adecuadamente los casos donde el número es menor que 1.

### Explicación de la solución

1. **Método `main`**:
    - Prueba el método `esNumeroPerfecto` con varios números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `esNumeroPerfecto`**:
    - **Verificación de Número Válido**:
      ```java
      if (numero < 1) {
          return false;
      }
      ```
      Verifica si el número es menor que 1. Si es así, retorna `false`.

    - **Inicialización de Variables y Cálculo del Límite**:
      ```java
      int sumaDivisoresPropiosPositivos = 0;
      int limite = numero / 2;
      ```
      Inicializa `sumaDivisoresPropiosPositivos` a 0 y determina el límite de iteración como la mitad del número.

    - **Bucle `for` para Sumar Divisores Propios Positivos**:
      ```java
      for (int i = 1; i <= limite; i++) {
          if (numero % i == 0) {
              sumaDivisoresPropiosPositivos += i;
          }
      }
      ```
      Usa un bucle `for` para iterar desde 1 hasta el límite. Si `i` es un divisor del número (`numero % i == 0`), agréguelo a `sumaDivisoresPropiosPositivos`.

    - **Comparación y Retorno del Resultado**:
      ```java
      return numero == sumaDivisoresPropiosPositivos;
      ```
      Compara la suma de los divisores propios positivos con el número original. Si son iguales, retorna `true`; de lo contrario, retorna `false`.

### Conclusión

Este código es eficiente y claro, asegurando que se verifique correctamente si un número es perfecto y manejando adecuadamente las entradas inválidas. La estructura del programa facilita su comprensión y mantenimiento.