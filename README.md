# Cómo abordar un problema
Abordar un problema de programación de manera efectiva involucra varias etapas clave que pueden ayudar a garantizar que el resultado final sea robusto,
eficiente y fácil de mantener. Aquí detallo un enfoque estructurado y explico la importancia de incluir validaciones en el proceso.

### Etapas para Abordar un Problema de Programación

1. **Comprensión del Problema:**
   - Antes de escribir cualquier código, es crucial entender completamente el problema.
     Esto incluye conocer los requisitos exactos, qué se espera que haga el programa, y bajo qué condiciones operará.

2. **Planificación:**
   - Desarrolla un plan o un algoritmo para cómo abordarás la solución.
     Esto puede incluir la creación de diagramas de flujo, pseudocódigo o simplemente listar los pasos que necesita tu programa para resolver el problema.

3. **División en Componentes:**
   - Divide el problema en componentes o módulos manejables.
     Esto no solo simplifica el desarrollo, sino que también ayuda en la prueba y mantenimiento del software.

4. **Implementación:**
   - Comienza a escribir el código, manteniendo las mejores prácticas de codificación en mente para asegurar que tu código sea limpio y eficiente.

### Importancia de las Validaciones
Las validaciones son esenciales en cualquier programa por varias razones:

- **Robustez:** Las validaciones ayudan a asegurar que el programa pueda manejar datos inesperados o erróneos sin fallar.
  Por ejemplo, verificar si una entrada es negativa cuando solo debería ser positiva.

- **Seguridad:** Previenen ataques maliciosos que podrían explotar vulnerabilidades relacionadas con la entrada de datos, como inyecciones SQL o desbordamientos de buffer.

- **Usabilidad:** Mejoran la experiencia del usuario al proporcionar retroalimentación inmediata sobre problemas con los datos ingresados,
  lo que permite correcciones antes de procesar la información.

- **Integridad de Datos:** Aseguran que solo los datos válidos sean procesados, lo que es crucial en aplicaciones que manejan transacciones financieras,
  registros médicos u otros datos sensibles.

Incluir validaciones desde las primeras etapas del desarrollo es una práctica recomendada que contribuye significativamente a la calidad y la seguridad del software final.
Esta aproximación no solo minimiza los riesgos, sino que también reduce el costo y el esfuerzo necesarios para manejar problemas que podrían haberse evitado más adelante en el ciclo de vida del desarrollo.

# Problema
Supongamos que estás organizando los archivos en tu computadora y quieres entender cuánto espacio ocupan en términos más comprensibles como megabytes y kilobytes restantes,
en lugar de un gran número de kilobytes. Este programa te ayudaría a convertir esos valores rápidamente.

### Enunciado del Problema
Crea un programa que convierta kilobytes en megabytes y kilobytes restantes, e imprima el resultado.
El programa debe manejar valores negativos informando que el valor es inválido.

### Paso a Paso para Resolver el Problema

1. **Implementar un método que reciba kilobytes como entrada.**
   - Verificar si el valor de entrada es negativo y, de ser así, imprimir un mensaje de "Valor inválido" y terminar la ejecución del método.

2. **Calcular los megabytes dividiendo los kilobytes por 1024.**
   - Utilizar la división entera para obtener cuántos megabytes completos hay en los kilobytes dados.

3. **Calcular los kilobytes restantes utilizando el operador de módulo (%).**
   - Este cálculo dará los kilobytes que no completan otro megabyte.

4. **Imprimir el resultado.**
   - Formatear el resultado para mostrar cuántos megabytes y kilobytes restantes se derivan del valor inicial.

## Solución propuesta
De aquí en adelante - spoilers - discutiremos sobre la solución propuesta a este problema.
El programa `ConvertidorMegaBytes` en Java es una aplicación diseñada para convertir una cantidad específica de kilobytes (KB) a megabytes (MB) y kilobytes restantes.
Es útil para comprender cómo el almacenamiento digital es calculado y presentado en unidades más grandes.
Aquí te explico en detalle cómo funciona el programa y qué hace cada parte del código.

### Descripción del Código

**1. Método `main`:**
- Este método es el punto de entrada del programa. Aquí, se llama al método `imprimirMegaBytesYKiloBytes` con diferentes valores de kilobytes como argumentos.
  Los valores son 2500, -1024 y 5000 kilobytes.
  Estas llamadas sirven para probar la funcionalidad del método en diferentes escenarios, incluyendo un valor negativo para probar la validación.

**2. Método `imprimirMegaBytesYKiloBytes`:**
- **Parámetro:** `kiloBytes` es el entero que representa la cantidad de kilobytes que se quiere convertir.
- **Validación:** Primero, el método verifica si el valor de `kiloBytes` es menor que cero. Si es así, imprime "Valor inválido" y termina la ejecución del método usando `return`.
  Esta verificación asegura que no se procesen valores negativos, que no tendrían sentido en el contexto del cálculo de almacenamiento.
- **Cálculo:** Si el valor es válido, el método procede a calcular cuántos megabytes hay en los kilobytes dados usando la división entera de `kiloBytes` por 1024
  (ya que 1 MB = 1024 KB). Además, calcula los kilobytes restantes utilizando el operador módulo para determinar lo que no compone un megabyte completo.
- **Impresión de Resultados:** Finalmente, imprime la conversión de kilobytes a megabytes y los kilobytes restantes en un formato claro y comprensible.

### Utilidad del Programa
Este programa es particularmente útil en contextos donde es necesario manejar unidades de almacenamiento digital, como en la administración de archivos,
sistemas operativos o incluso en el desarrollo de software que implica manipulación de datos a nivel de archivo.
Ayuda a los usuarios o desarrolladores a entender y visualizar el tamaño de los datos de manera más significativa al convertir una gran cantidad de kilobytes a una combinación más comprensible de megabytes y kilobytes restantes.
