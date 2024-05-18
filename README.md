## Problema
Imagina que estás desarrollando una aplicación que necesita analizar números y realizar operaciones matemáticas básicas sobre ellos. Este programa podría ser útil en una calculadora, un software de contabilidad o cualquier aplicación que necesite manipular y analizar los componentes individuales de los números, especialmente los dígitos pares.

### Enunciado del Problema
Desarrolla un programa en Java que calcule la suma de los dígitos pares de un número entero positivo. Si el número es negativo, el programa debe retornar -1.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
    - Utiliza el método `main` para probar el método `obtenerSumaDigitosPares` con varios números.

2. **Definición del Método `obtenerSumaDigitosPares`**:
    - Verifica si el número es negativo. Si es así, retorna -1.
    - Inicializa una variable `sumaDigitosPares` a 0 para almacenar la suma de los dígitos pares.
    - Usa un bucle `while` para iterar mientras el número sea mayor que 0:
        - Obtén el último dígito del número usando el operador `%`.
        - Verifica si el dígito es par usando el método `esPar`.
        - Si el dígito es par, agrégalo a `sumaDigitosPares`.
        - Elimina el último dígito del número usando el operador `/`.
    - Retorna la suma de los dígitos pares.

3. **Definición del Método `esPar`**:
    - Verifica si un número es par devolviendo `true` si el residuo de `numero` dividido por 2 es 0.

### Solución propuesta

1. **Método `main`**:
    - Prueba el método `obtenerSumaDigitosPares` con varios números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `obtenerSumaDigitosPares`**:
    - **Verificación de Número Negativo**:
      ```java
      if (numero < 0) {
          return -1;
      }
      ```
      El método verifica si el número es negativo. Si es así, retorna -1.

    - **Inicialización y Bucle `while`**:
      ```java
      int sumaDigitosPares = 0;
      while (numero > 0) {
          int digitoActual = numero % 10;
          if (esPar(digitoActual)) {
              sumaDigitosPares += digitoActual;
          }
          numero /= 10;
      }
      ```
      Inicializa `sumaDigitosPares` a 0. Usa un bucle `while` para iterar mientras el número sea mayor que 0. Dentro del bucle, obtiene el último dígito del número, verifica si el dígito es par y, si es así, lo suma a `sumaDigitosPares`. Luego elimina el último dígito del número.

    - **Retorno de la Suma**:
      ```java
      return sumaDigitosPares;
      ```
      Retorna la suma de los dígitos pares calculada.

3. **Método `esPar`**:
    - **Verificación de Paridad**:
      ```java
      return numero % 2 == 0;
      ```
      Este método verifica si un número es par devolviendo `true` si el residuo de `numero` dividido por 2 es 0.

### Conclusión

Este código es eficiente y claro, asegurando que se calculen correctamente las sumas de los dígitos pares de números enteros positivos y manejando adecuadamente las entradas negativas. La estructura del programa facilita su comprensión y mantenimiento.