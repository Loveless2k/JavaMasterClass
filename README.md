# Problema
Imagina que estás creando un sistema de votación electrónica donde necesitas verificar si los resultados de tres máquinas diferentes son consistentes.
Este programa podría utilizarse para determinar rápidamente si los números de votos registrados son idénticos, diferentes o si hay alguna inconsistencia.

### Enunciado del Problema
Desarrolla un programa que determine la relación entre tres números enteros dados: si todos son iguales, si todos son diferentes, o ninguno de los dos casos anteriores.

### Paso a Paso para Resolver el Problema

1. **Validar los Números:**
    - Verifica si alguno de los números proporcionados es negativo. Si alguno lo es, imprime un mensaje de error y finaliza el método.

2. **Comparar los Números:**
    - Usa condiciones para determinar si los tres números son iguales.
    - Verifica si los tres números son diferentes.
    - Si los números no cumplen ninguna de las condiciones anteriores, determina que ni todos son iguales ni todos son diferentes.

3. **Imprimir Resultados:**
    - Imprime un mensaje apropiado basado en las comparaciones anteriores.

## Solución propuesta
El programa `ImpresorDeIgualdad` en Java es una aplicación diseñada para evaluar tres números enteros y determinar su relación entre sí: si son todos iguales, todos diferentes, o ninguno de estos casos.
Este tipo de funcionalidad es útil en situaciones donde se necesita confirmar consistencias o discrepancias entre valores, como en sistemas de control de calidad, verificaciones de integridad de datos, o en ejemplos educativos para ilustrar la lógica condicional.

### Descripción de Componentes

**1. Método `main`:**
- Actúa como el punto de entrada del programa y realiza pruebas del método `imprimirIgualdad` con varios conjuntos de valores. Cada llamada está diseñada para demostrar una de las posibles salidas del método basado en diferentes combinaciones de números.

**2. Método `imprimirIgualdad`:**
- **Parámetros:** Recibe tres enteros (`primerNumero`, `segundoNumero`, `tercerNumero`).
- **Validación de Entrada:** Verifica inicialmente si alguno de los números es negativo. Si encuentra un valor negativo, imprime "Valor inválido" y finaliza la ejecución.
- **Comparación de Igualdad:** Evalúa si los tres números son iguales. Si es así, imprime "Todos los números son iguales".
- **Comparación de Diferencia:** Chequea si los tres números son completamente distintos entre sí. Si ninguno de los números es igual a otro, imprime "Todos los números son diferentes".
- **Condicional Restante:** Si los números no cumplen con las condiciones anteriores, imprime "Ni todos son iguales ni todos son diferentes".

### Funcionalidad del Programa
Este programa simplifica la tarea de comparar tres números y ofrece una respuesta directa sobre su relación.
Es una herramienta práctica para cualquier situación que requiera una rápida validación de igualdad o diferencia entre tres valores, facilitando decisiones basadas en la consistencia de los datos o en su variabilidad.

### Buenas Prácticas y Consideraciones

- **Claridad en los Mensajes de Salida:** Los mensajes de salida están claramente definidos para informar al usuario exactamente qué relación tienen los números.
- **Validación Robusta:** El programa gestiona adecuadamente los valores negativos, previniendo cálculos incorrectos o no deseados.
- **Extensibilidad:** Aunque el programa actual maneja específicamente tres números, la lógica puede extenderse o modificarse fácilmente para manejar más números o diferentes tipos de comparaciones según sea necesario.

En resumen, `ImpresorDeIgualdad` es un ejemplo efectivo de cómo implementar la lógica condicional en programas para realizar comparaciones esenciales y proporcionar respuestas claras basadas en las entradas proporcionadas.
