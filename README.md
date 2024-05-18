## Problema
Imagina que estás desarrollando una aplicación de análisis de números donde necesitas sumar el primer y el último dígito de un número dado. Este programa puede ser útil en un sistema de validación de datos o en una aplicación educativa para enseñar conceptos matemáticos.

### Enunciado del Problema
Desarrolla un programa en Java que calcule la suma del primer y último dígito de un número entero positivo. Si el número es negativo, el programa debe retornar -1. Si el número tiene un solo dígito, debe duplicar el valor de ese dígito.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
   - Utiliza el método `main` para probar el método `sumarPrimerYUltimoDigito` con varios números.

2. **Definición del Método `sumarPrimerYUltimoDigito`**:
   - Verifica si el número es negativo. Si es así, retorna -1.
   - Si el número tiene un solo dígito (menor que 10), duplica el valor del número y retorna el resultado.
   - Obtiene el último dígito del número usando el operador `%`.
   - Usa un bucle `while` para eliminar los dígitos hasta que solo quede el primer dígito.
   - Suma el primer y último dígito y retorna el resultado.

### Solución propuesta

1. **Método `main`**:
   - Prueba el método `sumarPrimerYUltimoDigito` con varios números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `sumarPrimerYUltimoDigito`**:
   - **Verificación de Número Negativo**:
     ```java
     if (numero < 0) {
         return -1; // Retorna -1 para números negativos
     }
     ```
     Verifica si el número es negativo. Si es así, retorna -1.

   - **Manejo de Números de un Solo Dígito**:
     ```java
     if (numero < 10) {
         return numero * 2; // Si el número tiene un solo dígito, se duplica su valor
     }
     ```
     Si el número es menor que 10, se duplica su valor y se retorna el resultado.

   - **Obtención del Último Dígito**:
     ```java
     int ultimoDigito = numero % 10;
     ```
     Obtiene el último dígito del número usando el operador `%`.

   - **Eliminación de Dígitos hasta el Primer Dígito**:
     ```java
     while (numero >= 10) {
         numero /= 10; // Elimina el último dígito en cada iteración
     }
     int primerDigito = numero; // Ahora, 'numero' contiene el primer dígito
     ```
     Usa un bucle `while` para eliminar los dígitos del número hasta que solo quede el primer dígito.

   - **Suma del Primer y Último Dígito**:
     ```java
     return primerDigito + ultimoDigito;
     ```
     Suma el primer y último dígito y retorna el resultado.

### Conclusión

Este código es eficiente y claro, asegurando que se calculen correctamente las sumas del primer y último dígito de números enteros positivos y manejando adecuadamente las entradas negativas y los números de un solo dígito. La estructura del programa facilita su comprensión y mantenimiento.