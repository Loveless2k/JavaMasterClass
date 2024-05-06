# Problema
Imagina que estás trabajando en un software de contabilidad o en un sistema de medición donde las comparaciones precisas hasta el tercer decimal son críticas.
Por ejemplo, podrías necesitar verificar si dos mediciones de un componente o dos transacciones financieras son iguales hasta el milésimo.

### Enunciado del Problema
Desarrolla un programa que compare dos números decimales y determine si son iguales hasta tres decimales. El programa debe ignorar cualquier decimal más allá del tercero.

### Paso a Paso para Resolver el Problema

1. **Multiplicar cada número por 1000:**
    - Esto convierte los decimales de interés en parte entera del número, desplazando el punto decimal tres posiciones a la derecha.

2. **Convertir los resultados a enteros:**
    - Al convertir a entero, se descartan los decimales adicionales, dejando solo los tres primeros decimales como parte entera.

3. **Comparar los dos valores enteros:**
    - Si los enteros son iguales, entonces los números originales son iguales hasta tres decimales.

4. **Retornar el resultado de la comparación:**
    - El método retorna `true` si los números son iguales hasta tres decimales, y `false` de lo contrario.

## Solución propuesta
Desde aquí en adelante, - spoilers - discutiremos la solución propuesta a este problema.
El programa `ComparadorDecimal` en Java está diseñado para determinar si dos números decimales son iguales hasta tres lugares decimales.
Es una herramienta útil para situaciones donde la precisión en las mediciones o los cálculos financieros es crucial y solo se requiere consistencia hasta el tercer decimal.

### Descripción de Componentes

**1. Método `main`:**
- Funciona como el punto de entrada del programa. Realiza llamadas al método `sonIgualesPorTresDecimales` con diferentes pares de valores para probar su funcionamiento.
- Las pruebas incluyen comparar números con pequeñas diferencias en sus terceros decimales, valores exactamente iguales, y números con signos opuestos para verificar
  la robustez del método.

**2. Método `sonIgualesPorTresDecimales`:**
- **Parámetros:** Recibe dos valores de tipo `double`, `primerValor` y `segundoValor`, que representan los números a comparar.
- **Proceso de Comparación:**
    - **Transformación:** Cada número se multiplica por 1000. Esto esencialmente "mueve" el punto decimal tres posiciones a la derecha,
      convirtiendo lo que eran los tres primeros decimales en la parte entera del número.
    - **Conversión a Entero:** Al convertir los resultados a `int`, se descartan los decimales adicionales más allá del tercer lugar decimal.
    - **Comparación:** Finalmente, compara estos dos valores enteros. Si son iguales, significa que los dos números originales son iguales hasta al menos tres lugares decimales.

### Funcionalidad del Programa
El propósito principal de este programa es facilitar la comparación de dos números decimales con precisión hasta el tercer decimal.
Esta capacidad es especialmente importante en campos como la ciencia y la ingeniería, donde la precisión en las mediciones puede ser crítica, o en finanzas,
donde las diferencias pequeñas pueden ser significativas en escalas grandes.

### Ejemplo Práctico
Por ejemplo, si se están comparando dos mediciones de una sustancia química donde la precisión es crucial solo hasta el tercer decimal,
este programa puede confirmar rápidamente si las mediciones cumplen con los estándares requeridos sin preocuparse por diferencias insignificantes más allá de ese punto.

En resumen, `ComparadorDecimal` es una herramienta efectiva para garantizar que las comparaciones numéricas en aplicaciones sensibles a la precisión se manejen de
manera adecuada y eficiente.
