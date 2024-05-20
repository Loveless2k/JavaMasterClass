## Algoritmo de Euclides

El Algoritmo de Euclides es un método eficiente para calcular el Máximo Común Divisor (MCD) de dos números enteros. El MCD de dos números es el mayor número que divide a ambos sin dejar residuo. Este algoritmo ha sido conocido desde hace más de dos mil años y es uno de los algoritmos más antiguos en matemáticas.

### Cómo Funciona el Algoritmo de Euclides

El algoritmo se basa en el siguiente principio: el MCD de dos números `a` y `b` (donde `a > b`) es el mismo que el MCD de `b` y `a % b`. Esto se puede expresar de la siguiente manera:

- Si `b = 0`, entonces el MCD de `a` y `b` es `a`.
- Si `b ≠ 0`, entonces el MCD de `a` y `b` es el mismo que el MCD de `b` y `a % b`.

### Pseudocódigo del Algoritmo de Euclides

El pseudocódigo para el algoritmo de Euclides es el siguiente:

```
function gcd(a, b)
    while b ≠ 0
        temp := b
        b := a % b
        a := temp
    return a
```

### Ejemplo del Algoritmo de Euclides

Consideremos dos números, 48 y 18. Queremos encontrar su MCD utilizando el algoritmo de Euclides:

1. `a = 48`, `b = 18`
2. `48 % 18 = 12` (entonces, `a = 18`, `b = 12`)
3. `18 % 12 = 6` (entonces, `a = 12`, `b = 6`)
4. `12 % 6 = 0` (entonces, `a = 6`, `b = 0`)
5. Como `b = 0`, el MCD es `a = 6`.

Por lo tanto, el MCD de 48 y 18 es 6.

### Implementación en Java

Aquí hay una implementación del algoritmo de Euclides en Java:

```java
public class AlgoritmoEuclides {

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int resultado = calcularMCD(a, b);
        System.out.println("El MCD de " + a + " y " + b + " es: " + resultado);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

### Explicación del Código

1. **Método `main`**:
   - Inicializa dos números `a` y `b`.
   - Llama al método `calcularMCD` con estos números.
   - Imprime el resultado.

2. **Método `calcularMCD`**:
   - Mientras `b` no sea 0:
      - Guarda el valor de `b` en una variable temporal `temp`.
      - Asigna a `b` el valor de `a % b`.
      - Asigna a `a` el valor de `temp`.
   - Cuando `b` es 0, retorna `a`, que es el MCD.

### Recomendaciones y Buenas Prácticas

1. **Comprender el Principio Básico**: Asegúrate de entender bien la relación recursiva `MCD(a, b) = MCD(b, a % b)`.
2. **Validación de Entradas**: Asegúrate de que los números sean positivos antes de aplicar el algoritmo, ya que el MCD solo está bien definido para números enteros no negativos.
3. **Optimización con Recursión**: Si prefieres una solución recursiva (si desconoces la recursión, no te preocupes, ya lo veremos más adelante), puedes implementar el algoritmo de Euclides de manera recursiva:

```java
public class AlgoritmoEuclidesRecursivo {

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int resultado = calcularMCD(a, b);
        System.out.println("El MCD de " + a + " y " + b + " es: " + resultado);
    }

    public static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }
}
```

4. **Evitar Números Negativos**: Aunque el algoritmo funciona con números negativos, generalmente se aplica a valores absolutos para evitar confusiones.
5. **Documentación**: Documenta tu código adecuadamente para que otros desarrolladores puedan entender fácilmente el propósito y funcionamiento del algoritmo.

### Conclusión

El algoritmo de Euclides es una herramienta poderosa y eficiente para encontrar el MCD de dos números. Su simplicidad y efectividad lo hacen un método fundamental en matemáticas y ciencias de la computación. Comprender este algoritmo proporciona una base sólida para abordar problemas más complejos en el análisis numérico y la teoría de números.

## Problema
Imagina que estás desarrollando una aplicación que necesita calcular el MCD de dos números, por ejemplo, en un software de contabilidad para simplificar fracciones o en un sistema educativo para enseñar conceptos matemáticos. El algoritmo de Euclides es eficiente y se puede aplicar en muchas situaciones donde se necesita simplificar o analizar números.

### Enunciado del Problema
Desarrolla un programa en Java que calcule el Máximo Común Divisor (MCD) de dos números enteros utilizando el algoritmo de Euclides. Si alguno de los números es menor que 10, el programa debe retornar -1.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
   - Utiliza el método `main` para probar el método `obtenerMaximoComunDivisor` con varios pares de números.

2. **Definición del Método `obtenerMaximoComunDivisor`**:
   - Verifica si alguno de los números es menor que 10. Si es así, retorna -1.
   - Utiliza un bucle `while` para aplicar el algoritmo de Euclides:
      - Si `primero` es mayor que `segundo`, reduce `primero` restando `segundo` de él.
      - Si `segundo` es mayor que `primero`, reduce `segundo` restando `primero` de él.
   - Cuando `primero` y `segundo` sean iguales, el bucle termina y se retorna el valor de `primero` (o `segundo`), que es el MCD.

### Solución propuesta

1. **Método `main`**:
   - Prueba el método `obtenerMaximoComunDivisor` con varios pares de números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `obtenerMaximoComunDivisor`**:
   - **Verificación de Números Válidos**:
     ```java
     if (primero < 10 || segundo < 10) {
         return -1;
     }
     ```
     Verifica si alguno de los números es menor que 10. Si es así, retorna -1.

   - **Aplicación del Algoritmo de Euclides**:
     ```java
     while (primero != segundo) {
         if (primero > segundo) {
             primero -= segundo;
         } else {
             segundo -= primero;
         }
     }
     return primero;
     ```
     Utiliza un bucle `while` para aplicar el algoritmo de Euclides. Si `primero` es mayor que `segundo`, reduce `primero` restando `segundo` de él. Si `segundo` es mayor que `primero`, reduce `segundo` restando `primero` de él. Cuando `primero` y `segundo` sean iguales, el bucle termina y se retorna el valor de `primero` (o `segundo`), que es el MCD.

### Conclusión

Este código es eficiente y claro, asegurando que se calcule correctamente el MCD de dos números enteros utilizando el algoritmo de Euclides y manejando adecuadamente las entradas inválidas. La estructura del programa facilita su comprensión y mantenimiento.