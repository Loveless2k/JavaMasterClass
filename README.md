# Problema
Imagina que estás administrando las finanzas de un proyecto y necesitas asegurarte de que las sumas de diferentes partidas coincidan con el total declarado.
Por ejemplo, quieres verificar que los gastos en dos categorías distintas sumen exactamente al total de gastos reportados.

### Enunciado del Problema
Desarrolla un programa que determine si la suma de dos números enteros es igual a un tercer número.
Este tipo de verificación puede ser útil en sistemas de contabilidad o en aplicaciones que requieran balancear transacciones o ajustar sumas.

### Paso a Paso para Resolver el Problema

1. **Implementa un método que acepte tres parámetros enteros:**
    - Los primeros dos parámetros representan las cantidades que necesitas sumar.
    - El tercer parámetro es el total contra el cual se comparará la suma de los dos primeros.

2. **Realiza la suma de los dos primeros parámetros.**
    - Suma los valores de los dos primeros parámetros.

3. **Compara el resultado de la suma con el tercer parámetro.**
    - Usa un operador de igualdad (`==`) para verificar si la suma de los dos primeros números es igual al valor del tercer número.

4. **Retorna el resultado de la comparación.**
    - El método retorna `true` si los números son iguales, de lo contrario, retorna `false`.

## Solución propuesta
De aquí en más, - spoilers - discutiremos la solución propuesta.
El programa `ComprobadorSumaIgual` en Java está diseñado para determinar si la suma de dos números enteros es igual a un tercer número.
Este es un problema común en varias aplicaciones, especialmente en sistemas de contabilidad y financiamiento, donde es esencial verificar la precisión de las sumas y balances.

### Descripción Detallada

**1. Método `main`:**
- El método `main` es el punto de entrada del programa y se utiliza para probar el método `tieneSumaIgual` con diferentes conjuntos de números.
- Se hacen llamadas al método `tieneSumaIgual` con tres diferentes conjuntos de argumentos para ilustrar cómo funciona el método en varias condiciones:
    - `tieneSumaIgual(1, 1, 1)`: Verifica si 1 + 1 es igual a 1. Debería retornar `false` porque 1 + 1 es 2.
    - `tieneSumaIgual(1, 1, 2)`: Verifica si 1 + 1 es igual a 2. Debería retornar `true` porque 1 + 1 es 2.
    - `tieneSumaIgual(1, -1, 0)`: Verifica si 1 + (-1) es igual a 0. Debería retornar `true` porque 1 - 1 es 0.

**2. Método `tieneSumaIgual`:**
- Este método acepta tres parámetros enteros: `numero1`, `numero2` y `numero3`.
- Realiza una operación matemática simple, sumando `numero1` y `numero2`.
- Luego, utiliza el operador de igualdad (`==`) para comparar el resultado de la suma con `numero3`.
- Retorna `true` si los valores son iguales, indicando que la suma de los dos primeros números es igual al tercer número; de lo contrario, retorna `false`.

### Utilidad del Programa
Este programa es particularmente útil en aplicaciones que necesitan validar la corrección de las operaciones matemáticas, como en la contabilidad o la gestión financiera.
Por ejemplo, podría utilizarse para asegurarse de que las entradas en un libro de contabilidad suman el total esperado o para verificar que las transacciones se han registrado correctamente.

### Ejemplo Práctico
En la vida real, podría usarse en un sistema automatizado para verificar que los pagos realizados y recibidos en una transacción comercial
coincidan exactamente con el total facturado, ayudando a prevenir errores o fraudes.

En resumen, `ComprobadorSumaIgual` es un programa simple pero efectivo que juega un papel crucial en sistemas donde la precisión en cálculos numéricos es vital.
