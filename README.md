# Operador Ternario
El operador ternario en Java es una forma compacta de la instrucción if-else que permite asignar valores a variables bajo ciertas condiciones en una sola línea de código. Este operador es útil para simplificar su código cuando necesita realizar asignaciones condicionales simples. La estructura básica del operador ternario es la siguiente:

```
variable = (condición) ? expresión1 : expresión2;
```

### Cómo Funciona

- **Condición**: Es una expresión booleana que se evalúa para determinar cuál de las dos otras expresiones debe ser ejecutada.
- **Expresión1**: Es el valor que la variable tomará si la condición es `true`.
- **Expresión2**: Es el valor que la variable tomará si la condición es `false`.

### Ejemplos de Uso del Operador Ternario

**Ejemplo 1: Asignación Simple**
```java
int edad = 18;
String esMayorDeEdad = (edad >= 18) ? "Sí" : "No";
System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
```
Este código determinará si alguien es mayor de edad basado en la variable `edad`.

**Ejemplo 2: Cálculo Condicional**
```java
int puntaje = 75;
String calificacion = (puntaje >= 90) ? "Excelente" : (puntaje > 50) ? "Aprobado" : "Reprobado";
System.out.println("Calificación: " + calificacion);
```
Este código utiliza un operador ternario anidado para asignar una calificación basada en el puntaje. Si el puntaje es 90 o más, la calificación será "Excelente". Si es más de 50 pero menos de 90, será "Aprobado". De lo contrario, será "Reprobado".

### Buenas Prácticas y Consejos

- **Legibilidad**: Aunque el operador ternario puede hacer que el código sea más conciso, usarlo en exceso o en condiciones muy complejas puede hacer que el código sea difícil de leer. Limita su uso a condiciones simples.

- **Evitar Anidaciones Complejas**: Mientras que es técnicamente posible anidar operadores ternarios (como se muestra en el Ejemplo 2), esto puede hacer que el código sea confuso. Si necesitas múltiples condiciones, considera usar declaraciones `if-else` tradicionales para mejorar la claridad.

- **No usar para Efectos Secundarios**: Evita usar el operador ternario para ejecutar métodos que tienen efectos secundarios (como modificar variables globales). El operador ternario debe usarse principalmente para asignar valores a variables basándose en condiciones.

- **Claridad en la Condición**: Asegúrate de que la condición y las expresiones en el operador ternario sean claras y concisas. Utiliza paréntesis si es necesario para hacer la expresión más comprensible.

### Conclusión

El operador ternario es una herramienta poderosa en Java que, si se utiliza correctamente, puede hacer que el código sea más limpio y fácil de entender. Es ideal para condiciones simples y asignaciones directas, pero debe usarse con moderación y con cuidado para mantener la legibilidad del código.

## Problema
Imagina que estás desarrollando una aplicación para dueños de mascotas que ayuda a determinar si es seguro que sus gatos jueguen afuera basado en la temperatura actual. Durante el verano, los gatos pueden tolerar un calor mayor debido al clima general, mientras que en otros meses, las temperaturas más altas podrían ser peligrosas.

### Enunciado del Problema
Desarrolla un programa que determine si un gato está jugando basado en la temperatura actual y si es o no verano. El gato juega cuando la temperatura está entre 25 y 35 grados Celsius, pero en verano el límite superior se extiende a 45 grados.

### Paso a Paso para Resolver el Problema

1. **Definir la Función de Verificación:**
   - Crear un método `estaJugandoElGato` que acepte un booleano `esVerano` y un entero `temperatura` como parámetros.

2. **Establecer Límites de Temperatura:**
   - Utilizar un operador ternario para definir el límite superior de la temperatura. Si es verano (`esVerano` es verdadero), el límite superior es 45 grados. De lo contrario, es 35 grados.

3. **Evaluar la Condición de Juego:**
   - Comprobar si la temperatura actual está dentro del rango permitido (entre 25 grados y el límite superior calculado). Retornar `true` si está dentro del rango, indicando que el gato está jugando, o `false` si no.

4. **Probar la Función:**
   - En el método `main`, realizar llamadas a `estaJugandoElGato` con diferentes valores para simular distintos escenarios climáticos y verificar la función.

## Solución propuesta
El programa `GatoJugando` en Java es diseñado para determinar si un gato está jugando basado en la temperatura ambiente. La condición para que el gato juegue depende de si es verano o no, dado que las temperaturas aceptables para que un gato juegue al aire libre varían según la estación.

### Descripción de Componentes

**1. Método `main`:**
- Funciona como el punto de entrada del programa, realizando varias llamadas al método `estaJugandoElGato` para demostrar cómo varían las respuestas en diferentes condiciones climáticas y estacionales.

**2. Método `estaJugandoElGato`:**
- **Parámetros:**
   - `esVerano`: un booleano que indica si actualmente es verano o no.
   - `temperatura`: un entero que representa la temperatura ambiente en grados Celsius.
- **Proceso de Decisión:**
   - Utiliza un operador ternario para determinar el límite superior de la temperatura en la que el gato puede jugar de forma segura. Si es verano (`esVerano` es verdadero), el límite superior es 45 grados Celsius; de lo contrario, es 35 grados.
   - Evalúa si la temperatura actual está dentro del rango seguro (entre 25 grados y el límite superior calculado). Retorna `true` si la temperatura está dentro de este rango, indicando que el gato puede jugar afuera; de lo contrario, retorna `false`.

### Funcionalidad del Programa

El programa ofrece una forma rápida y eficiente de determinar si las condiciones ambientales son seguras para que un gato juegue al aire libre, basándose en la temperatura actual y si es o no período de verano. Esta funcionalidad es útil en aplicaciones destinadas a dueños de mascotas que desean garantizar la seguridad y el bienestar de sus gatos.

### Buenas Prácticas y Consideraciones

- **Claro y Conciso**: El uso del operador ternario para definir el límite superior de la temperatura hace que el método sea compacto y fácil de entender.
- **Validación de Entradas**: Aunque el programa actual asume que la entrada de temperatura siempre es un entero válido, en aplicaciones reales sería prudente agregar más validaciones para manejar entradas inesperadas o inválidas.
- **Expansión y Escalabilidad**: El método podría expandirse fácilmente para considerar otros factores que podrían afectar la seguridad del gato para jugar afuera, como las condiciones del viento o la humedad.

### Conclusión

`GatoJugando` demuestra una implementación eficaz de lógica condicional para una aplicación del mundo real, utilizando operadores ternarios para manejar variaciones condicionales de manera sucinta. Este enfoque simplifica la función y facilita futuras modificaciones o expansiones del código.