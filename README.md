## Problema
Imagina que estás desarrollando una aplicación para analizar datos numéricos y necesitas calcular la suma de todos los números impares dentro de un rango específico. Este programa automatiza la verificación y suma de estos números.

### Enunciado del Problema
Desarrolla un programa en Java que sume todos los números impares dentro de un rango dado. El programa debe verificar que los parámetros de entrada sean válidos y retornar -1 si no lo son.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
    - Utiliza el método `main` para probar diferentes rangos y verificar el correcto funcionamiento del programa.

2. **Definición del Método `esImpar`**:
    - Verifica si un número es impar. Un número es impar si es mayor que 0 y no divisible por 2.

3. **Definición del Método `sumarImpares`**:
    - Verifica si los parámetros de entrada son válidos (es decir, `inicio` y `fin` son no negativos y `inicio` es menor o igual a `fin`). Si no son válidos, retorna -1.
    - Inicializa una variable `sumaDeImpares` a 0.
    - Usa un bucle `for` para iterar desde `inicio` hasta `fin`.
    - Dentro del bucle, verifica si el número es impar usando el método `esImpar` y, si es así, lo suma a `sumaDeImpares`.
    - Retorna la suma de los números impares encontrados en el rango.

### Solución propuesta

1. **Método `main`**:
    - Prueba el método `sumarImpares` con varios rangos para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `esImpar`**:
    - **Verificación de Imparidad**:
      ```java
      return numero > 0 && numero % 2 != 0;
      ```
      El método retorna `true` si el número es mayor que 0 y no divisible por 2, indicando que es impar.

3. **Método `sumarImpares`**:
    - **Verificación de Parámetros de Entrada**:
      ```java
      if (inicio < 0 || fin < 0 || inicio > fin) {
          return -1;
      }
      ```
      Verifica que `inicio` y `fin` sean no negativos y que `inicio` sea menor o igual a `fin`. Si no es así, retorna -1.

    - **Inicialización y Bucle `for`**:
      ```java
      int sumaDeImpares = 0;
      for (int i = inicio; i <= fin; i++) {
          if (esImpar(i)) {
              sumaDeImpares += i;
          }
      }
      ```
      Inicializa `sumaDeImpares` a 0. Usa un bucle `for` para iterar desde `inicio` hasta `fin`. Dentro del bucle, verifica si el número es impar y, si es así, lo suma a `sumaDeImpares`.

    - **Retorno de la Suma**:
      ```java
      return sumaDeImpares;
      ```
      Retorna la suma de los números impares encontrados en el rango.

Este código es eficiente y claro, asegurando que se sumen correctamente los números impares dentro del rango especificado y manejando adecuadamente las entradas no válidas.