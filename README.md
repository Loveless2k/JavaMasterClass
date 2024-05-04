# Problema
Imagina que estás desarrollando un software de contabilidad donde necesitas categorizar automáticamente las transacciones como ingresos (positivos), gastos (negativos) o ajustes nulos (cero).
Este programa podría ser el núcleo de un módulo que realiza esa clasificación inicial basada en los valores de las transacciones.

## Enunciado del Problema

**Problema:** Desarrolla un programa que determine si un número dado es positivo, negativo o cero.

## Explicación del Problema

El programa debe evaluar un número entero proporcionado y clasificarlo como "positivo" si es mayor que cero,
"negativo" si es menor que cero, o "cero" si es igual a cero.
Esta funcionalidad es útil en múltiples contextos donde la naturaleza de un número (positivo, negativo, o neutral) puede determinar diferentes flujos de control o resultados en un software.

## Paso a Paso para la Resolución del Problema

1. **Definir el Método Principal (`main`):** Configura el método `main` para probar el método de verificación con varios números.
2. **Crear el Método de Verificación (`verificarNumero`):**
    - Define un método que acepte un número entero como parámetro.
    - Utiliza estructuras condicionales (`if`, `else if`, `else`) para evaluar si el número es positivo, negativo o cero.
    - Imprime el resultado correspondiente basado en la evaluación.
3. **Prueba el Método:** En el método `main`, invoca el método `verificarNumero` con diferentes valores para verificar su correcto funcionamiento.

## Solución propuesta
A partir de aquí, - spilers - discutiremos sobre la solución propuesta a este problema.
El código en cuestión, que he nombrado como `VerificarNumero`, es un programa simple en Java diseñado para clasificar un número entero como positivo, negativo o cero.
Aquí te explico en detalle cada componente del código y cómo funciona:

### Descripción de los Componentes

1. **Clase `VerificarNumero`:**
    - Es la clase principal que contiene todos los métodos del programa.

2. **Método `main`:**
    - Este es el punto de entrada del programa, donde comienza la ejecución del código.
    - En el método `main`, el método `verificarNumero` se invoca tres veces con diferentes argumentos (5, -5, 0). Estas invocaciones son pruebas para verificar la funcionalidad del método con un número positivo, un número negativo y el número cero, respectivamente.

3. **Método `verificarNumero`:**
    - Este método es estático, lo que significa que pertenece a la clase y no a una instancia específica de la clase. Puede ser llamado directamente desde el método `main` sin necesidad de crear un objeto de la clase.
    - Acepta un parámetro entero `numero`, que es el número que se evaluará.
    - Contiene una estructura condicional `if-else` que determina si el número es mayor que cero, menor que cero o igual a cero:
        - **Si `numero > 0`:** el método imprime "positivo".
        - **Si `numero < 0`:** el método imprime "negativo".
        - **Si `numero == 0`:** el método imprime "cero".

### Funcionamiento del Programa

Cuando ejecutas el programa:
- Se llama al método `main`.
- El método `main` a su vez llama al método `verificarNumero` tres veces con los valores 5, -5 y 0.
- Para cada llamada, el método `verificarNumero` evalúa el número proporcionado usando la estructura condicional y imprime el resultado correspondiente.

Este programa es un ejemplo efectivo de cómo utilizar métodos y estructuras de control condicional para realizar tareas simples de clasificación en programación.
Además, demuestra la importancia de la modularidad y la reutilización del código, ya que el método `verificarNumero` puede ser llamado múltiples veces con diferentes argumentos sin necesidad de duplicar código.
