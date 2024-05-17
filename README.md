### Descomposición de Números con `%` y `/` en Java

La descomposición de números en sus dígitos componentes se puede lograr utilizando los operadores de módulo (`%`) y división (`/`). Estos operadores son fundamentales para entender cómo manipular y analizar los números en sus partes individuales. A continuación, se explica detalladamente cómo funcionan estos operadores y cómo se pueden utilizar para descomponer números.

### Operador de Módulo (`%`)

El operador de módulo (`%`) se utiliza para obtener el residuo de una división entre dos números. En el contexto de la descomposición de números, el operador de módulo es útil para obtener el último dígito de un número.

**Ejemplo**:
```java
int numero = 12345;
int ultimoDigito = numero % 10; // ultimoDigito será 5
```
En este ejemplo, `12345 % 10` devuelve `5`, que es el último dígito del número `12345`.

### Operador de División (`/`)

El operador de división (`/`) se utiliza para dividir dos números y devolver el cociente entero de la división. En el contexto de la descomposición de números, el operador de división es útil para eliminar el último dígito de un número.

**Ejemplo**:
```java
int numero = 12345;
numero = numero / 10; // numero será 1234
```
En este ejemplo, `12345 / 10` devuelve `1234`, que es el resultado de eliminar el último dígito del número `12345`.

### Combinación de `%` y `/` para Descomponer Números

Para descomponer un número en sus dígitos individuales, se puede utilizar una combinación de los operadores `%` y `/`. La idea es iterar a través del número, obteniendo el último dígito con `%` y eliminándolo con `/`.

**Ejemplo Completo**:
```java
public class DescomposicionDeNumeros {

    public static void main(String[] args) {
        int numero = 12345;
        descomponerNumero(numero);
    }

    public static void descomponerNumero(int numero) {
        while (numero > 0) {
            int digito = numero % 10; // Obtiene el último dígito
            System.out.println("Dígito: " + digito);
            numero = numero / 10; // Elimina el último dígito
        }
    }
}
```

#### Explicación del Ejemplo

1. **Inicialización**: El número `12345` es el número a descomponer.
2. **Bucle `while`**: El bucle continúa mientras `numero` sea mayor que 0.
3. **Obtener el Último Dígito**:
   ```java
   int digito = numero % 10;
   ```
   Aquí, `digito` obtiene el valor del último dígito de `numero`.
4. **Imprimir el Dígito**:
   ```java
   System.out.println("Dígito: " + digito);
   ```
   El dígito obtenido se imprime en la consola.
5. **Eliminar el Último Dígito**:
   ```java
   numero = numero / 10;
   ```
   Aquí, `numero` se actualiza eliminando su último dígito.

### Ejemplo Aplicado: Suma de Dígitos

A continuación, se muestra un ejemplo práctico de cómo usar `%` y `/` para sumar los dígitos de un número.

```java
public class SumaDeDigitos {

    public static void main(String[] args) {
        int numero = 12345;
        int suma = sumarDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es " + suma);
    }

    public static int sumarDigitos(int numero) {
        int sumaDeDigitos = 0;
        while (numero > 0) {
            int digito = numero % 10; // Obtiene el último dígito
            sumaDeDigitos += digito; // Suma el dígito al total
            numero = numero / 10; // Elimina el último dígito
        }
        return sumaDeDigitos;
    }
}
```

#### Explicación del Ejemplo

1. **Método `main`**:
    - Se inicializa `numero` con `12345`.
    - Se llama al método `sumarDigitos` y se imprime el resultado.

2. **Método `sumarDigitos`**:
    - **Inicialización**:
      ```java
      int sumaDeDigitos = 0;
      ```
      Se inicializa `sumaDeDigitos` a 0 para almacenar la suma de los dígitos.
    - **Bucle `while`**:
      ```java
      while (numero > 0) {
          int digito = numero % 10; // Obtiene el último dígito
          sumaDeDigitos += digito; // Suma el dígito al total
          numero = numero / 10; // Elimina el último dígito
      }
      ```
      Este bucle itera mientras `numero` sea mayor que 0, obteniendo y sumando el último dígito en cada iteración.
    - **Retorno de la Suma**:
      ```java
      return sumaDeDigitos;
      ```
      Finalmente, el método retorna la suma de los dígitos calculada.

### Buenas Prácticas y Recomendaciones

1. **Validación de Entrada**: Asegúrate de validar las entradas para evitar errores o resultados inesperados. Por ejemplo, maneja los casos donde el número es negativo.
2. **Comentarios Claros**: Usa comentarios claros para explicar el propósito de cada paso, especialmente si otros desarrolladores trabajarán con tu código.
3. **Manejo de Casos Especiales**: Considera y maneja casos especiales, como números muy grandes o casos límite.

### Conclusión

El uso combinado de los operadores `%` y `/` es una técnica poderosa y eficiente para descomponer números en sus dígitos componentes en Java. Entender y aplicar estos operadores correctamente permite realizar análisis y manipulaciones precisas sobre los números, lo que es fundamental en muchas aplicaciones de software.

## Problema
Imagina que estás desarrollando una aplicación que necesita analizar números y realizar operaciones matemáticas básicas sobre ellos. Este programa podría ser útil en una calculadora, un software de contabilidad o cualquier aplicación que necesite manipular y analizar los componentes individuales de los números.

### Enunciado del Problema
Desarrolla un programa en Java que calcule la suma de los dígitos de un número entero positivo. Si el número es negativo, el programa debe retornar -1.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
    - Utiliza el método `main` para probar el método `sumarDigitos` con varios números.

2. **Definición del Método `sumarDigitos`**:
    - Verifica si el número es negativo. Si es así, retorna -1.
    - Inicializa una variable `sumaDeDigitos` a 0.
    - Usa un bucle `while` para iterar mientras el número sea mayor que 0.
    - Dentro del bucle, suma el último dígito del número a `sumaDeDigitos` y luego remueve el último dígito del número.
    - Retorna la suma de los dígitos.

### Solución propuesta

1. **Método `main`**:
    - Prueba el método `sumarDigitos` con varios números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `sumarDigitos`**:
    - **Verificación de Número Negativo**:
      ```java
      if (numero < 0) {
          return -1;
      }
      ```
      El método verifica si el número es negativo. Si es así, retorna -1.

    - **Inicialización y Bucle `while`**:
      ```java
      int sumaDeDigitos = 0;
      while (numero > 0) {
          sumaDeDigitos += numero % 10;
          numero /= 10;
      }
      ```
      Inicializa `sumaDeDigitos` a 0. Usa un bucle `while` para iterar mientras el número sea mayor que 0. Dentro del bucle, suma el último dígito del número a `sumaDeDigitos` y luego remueve el último dígito del número.

    - **Retorno de la Suma**:
      ```java
      return sumaDeDigitos;
      ```
      Retorna la suma de los dígitos calculada.

Este código es eficiente y claro, asegurando que se calculen correctamente las sumas de los dígitos de números enteros positivos y manejando adecuadamente las entradas negativas.