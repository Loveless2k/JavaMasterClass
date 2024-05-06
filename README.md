# Problema
Un año bisiesto es aquel que tiene 366 días en lugar de los 365 días típicos de un año no bisiesto.
Esta característica es esencial para mantener nuestro calendario en alineación con la órbita de la Tierra alrededor del Sol.
Imagina que estás desarrollando un software para un calendario o una aplicación que necesita calcular plazos precisos;
saber si un año es bisiesto sería crucial para la precisión del cálculo de fechas.

### Enunciado del Problema
Desarrolla un programa que determine si un año dado es bisiesto o no.
El programa debe validar que el año esté en el rango de 1 a 9999, y aplicar las reglas para determinar si es bisiesto.

### Paso a Paso para Resolver el Problema

1. **Validar el Año:**
    - Comprueba si el año está dentro del rango permitido (1 a 9999). Si no es así, retorna `false`.

2. **Aplicar las Reglas para Años Bisiestos:**
    - Un año es bisiesto si se cumple alguna de las siguientes condiciones:
        - Es divisible por 4 pero no por 100.
        - Es divisible por 400.
    - Usa operadores lógicos para verificar estas condiciones y retorna `true` si se cumple alguna de ellas.

3. **Retorna `false` si Ninguna Condición se Cumple:**
    - Si ninguna de las condiciones para ser un año bisiesto se cumple, entonces el método deberá retornar `false`.

## Solución propuesta
A continuación, - spoilers -, discutiremos sobre la solución propuesta a este problema.
El programa `CalculadoraAnhoBisiesto` en Java está diseñado para determinar si un año dado es bisiesto, siguiendo las reglas establecidas para los años bisiestos.
Este tipo de cálculo es fundamental en aplicaciones que requieren manejo preciso de fechas, como calendarios, planificación de eventos o sistemas de contabilidad.

### Descripción de Componentes

**1. Método `main`:**
- Es el punto de entrada del programa. En este método, se llama al método `esAnhoBisiesto` con cuatro valores diferentes para ilustrar y probar la funcionalidad
  del programa en diferentes escenarios:
    - `-1600`: un año negativo para probar la validación de rango.
    - `1600`: un año que es bisiesto bajo las reglas establecidas.
    - `2017`: un año común que no es bisiesto.
    - `2000`: un año que es bisiesto por ser divisible por 400.

**2. Método `esAnhoBisiesto`:**
- **Parámetros:** Recibe un entero `anho` que representa el año que se va a evaluar.
- **Validación de Rango:** Primero verifica si el año está dentro del rango válido (1 a 9999). Si el año está fuera de este rango, el método retorna `false` directamente,
  indicando que el año no es válido para la evaluación.
- **Cálculo de Año Bisiesto:** Utiliza las reglas para determinar si un año es bisiesto:
    - **Divisibilidad por 4 y no por 100:** Si un año es divisible por 4 pero no por 100, es un año bisiesto.
    - **Divisibilidad por 400:** Además, cualquier año que sea divisible por 400 es un año bisiesto.
      Esto es necesario para mantener nuestro calendario en sincronización con la órbita de la Tierra alrededor del sol.
- **Expresión Lógica:** El método utiliza operadores lógicos para evaluar las condiciones mencionadas.
  Si alguna de las condiciones se cumple (`anho % 4 == 0 && anho % 100 != 0` o `anho % 400 == 0`), el método retorna `true`, indicando que el año es bisiesto.

### Funcionalidad del Programa
Este programa proporciona una funcionalidad crucial para cualquier sistema que dependa del cálculo preciso de fechas,
ayudando a determinar si un año específico tiene 366 días en lugar de los 365 días estándar.
Esto es esencial para la correcta planificación de fechas futuras, especialmente en aplicaciones que manejan eventos anuales,
programaciones o cálculos financieros que dependen del número exacto de días en un año.

El uso de este programa asegura que las aplicaciones que dependen de fechas manejen correctamente los años bisiestos,
evitando errores comunes en la planificación y programación que podrían surgir de omitir el día adicional en febrero durante los años bisiestos.
