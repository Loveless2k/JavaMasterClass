# Problema
Imagina que estás organizando un evento juvenil y necesitas confirmar si al menos uno de los participantes está en la franja de edad adolescente
para cumplir con ciertos requisitos de participación o normativas de seguridad.
Este programa te permitiría verificar rápidamente las edades y tomar decisiones basadas en esta información.

### Enunciado del Problema
Desarrolla un programa que determine si al menos uno de tres individuos está en la etapa adolescente, definida como una edad entre 13 y 19 años inclusive.

### Paso a Paso para Resolver el Problema

1. **Definir un método para verificar si una edad es adolescente:**
    - Crea el método `esAdolescente`, que acepta un entero (edad) y retorna `true` si la edad está entre 13 y 19 años.

2. **Implementar un método que compruebe si alguno de tres números es adolescente:**
    - Desarrolla el método `tieneAdolescente`, que recibe tres edades como parámetros.
    - Utiliza el método `esAdolescente` dentro de `tieneAdolescente` para verificar cada edad.
    - Retorna `true` si al menos uno de los tres números cumple con el criterio de ser adolescente.

3. **Realizar pruebas en el método `main`:**
    - Prueba diferentes combinaciones de edades para asegurarte de que el método `tieneAdolescente` funciona correctamente.

## Solución propuesta
A continuación, - spoilers -, se discutirá sobre la solución propuesta.
El programa `ComprobadorDeAdolescentes` en Java está diseñado para verificar si alguna de las edades proporcionadas cae dentro del rango adolescente,
que se define como cualquier edad entre 13 y 19 años inclusive.
Este tipo de funcionalidad es útil en múltiples contextos, desde la planificación de eventos hasta la implementación de políticas específicas para adolescentes.

### Descripción de Componentes

**1. Método `main`:**
- Sirve como el punto de entrada para el programa. Se utilizan llamadas al método `tieneAdolescente` para verificar varias combinaciones de edades e imprimir los resultados
  en la consola.
  Este método prueba la funcionalidad del programa con diferentes conjuntos de datos para asegurar que responde correctamente bajo varias condiciones.

**2. Método `esAdolescente`:**
- **Parámetro:** Recibe un entero `edad`.
- **Funcionalidad:** Evalúa si la edad dada está dentro del rango de 13 a 19 años.
  Utiliza un simple condicional que comprueba si el valor de `edad` se encuentra entre estos límites, incluyendo ambos extremos.
- **Retorno:** Devuelve `true` si la edad está dentro del rango adolescente, y `false` de lo contrario.

**3. Método `tieneAdolescente`:**
- **Parámetros:** Acepta tres enteros, `edad1`, `edad2`, y `edad3`, que representan las edades que se van a evaluar.
- **Funcionalidad:** Verifica si alguna de las tres edades es adolescente.
  Esto se logra llamando al método `esAdolescente` para cada edad y combinando los resultados con el operador lógico OR (`||`).
  Este operador retorna `true` si al menos uno de los operandos es `true`.
- **Retorno:** Devuelve `true` si alguna de las edades es adolescente, de lo contrario, retorna `false`.

### Funcionalidad del Programa
El programa es útil para determinar rápidamente si un grupo de individuos contiene al menos un adolescente, lo cual puede ser crucial para adherirse a regulaciones específicas,
como las restricciones de edad en eventos, programas educativos, o actividades sociales.
Por ejemplo, si una actividad está diseñada específicamente para adolescentes, el programa puede ayudar a confirmar que los participantes cumplen con los criterios de edad
antes de permitir su inscripción.

### Utilidad Práctica
En resumen, `ComprobadorDeAdolescentes` es una herramienta eficaz que ofrece una solución simple y directa para verificar la presencia de adolescentes en un conjunto de edades.
Este programa mejora la eficiencia de los procesos de verificación y es fácil de integrar en sistemas más amplios que requieran tales comprobaciones de edad.
