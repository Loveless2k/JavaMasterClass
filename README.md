# Condicionales
Los condicionales en Java son estructuras que permiten tomar decisiones en el flujo de un programa basándose en si una o más condiciones se evalúan como verdaderas (`true`) o falsas (`false`). 
Los principales condicionales en Java son `if`, `else if`, `else`, y la declaración `switch`.

### Condicional `if`
El condicional `if` es el más básico y se utiliza para ejecutar un bloque de código solo si una condición especificada es `true`.

**Ejemplo simple de `if`:**
```java
if (condición) {
    // Bloque de código que se ejecuta si la condición es verdadera
}
```

**Ejemplo con `if` en Java:**
```java
int numero = 10;
if (numero > 0) {
    System.out.println("El número es positivo.");
}
```

### `else if` y `else`
Si la condición `if` es falsa, puedes usar `else if` para probar otra condición y `else` para ejecutar un bloque de código si ninguna de las condiciones anteriores fue verdadera.

**Ejemplo de `if`, `else if`, `else`:**
```java
int temperatura = 25;
if (temperatura > 30) {
    System.out.println("Hace calor.");
} else if (temperatura < 10) {
    System.out.println("Hace frío.");
} else {
    System.out.println("La temperatura es agradable.");
}
```

### Condicional `switch`
El `switch` es otra estructura condicional que selecciona para ejecución un bloque de código de entre muchas alternativas basándose en el valor de una variable.
Por ahora solo te mostraré un ejemplo de un `switch` funcional, pero profundizaremos en él más adelante.

**Ejemplo de `switch`:**
```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    // ... y así sucesivamente para los demás días de la semana
    default:
        System.out.println("Ese no es un día válido.");
}
```
Existe otra versión de `switch`, pero también la abordaremos más adelante.
El uso de condicionales es fundamental para cualquier lógica de programación que requiera ejecución de código bajo ciertas condiciones. La elección entre `if` y `switch` a menudo depende de la naturaleza y cantidad de las condiciones a evaluar.

# Problema
Imagina que estás jugando un videojuego donde ganas puntos al completar niveles. Al final del juego, quieres calcular tu puntuación total, que incluye tu puntuación inicial más puntos adicionales por cada nivel completado y las bonificaciones obtenidas.

### Enunciado del Problema
Calcula la puntuación final en un juego al completar un nivel. La puntuación inicial es de 10,000 puntos y se añaden puntos adicionales basados en el número de niveles completados y una bonificación.

### Paso a Paso para Resolver el Problema

1. **Inicializa variables para representar si el juego terminó, la puntuación inicial, los niveles completados y la bonificación**.
2. **Verifica si el juego ha terminado con una condición `if`**.
3. **Si el juego terminó, calcula la puntuación final sumando la puntuación inicial más el producto de los niveles completados y la bonificación**.
4. **Imprime la puntuación final**.

## Solución propuesta
El código de `DesafioCondicional` es un programa en Java que realiza un cálculo condicional para determinar la puntuación final de un juego. 
A continuación, se detallan las partes del código:

1. **Declaración de Variables:**
   - `juegoTerminado`: Es una variable booleana que indica si el juego ha concluido. Si es `true`, se procederá a calcular la puntuación final.
   - `puntuacion`: Representa la puntuación inicial del jugador, establecida en `10000`.
   - `nivelCompletado`: Indica la cantidad de niveles que el jugador ha completado, en este caso `8`.
   - `bonificacion`: Es una cantidad de puntos adicional que el jugador recibe por cada nivel completado, aquí `200`.

2. **Estructura Condicional `if`:**
   - Evalúa si `juegoTerminado` es `true`. Solo si esta condición es verdadera, se ejecutará el bloque de código dentro del `if`.
   
3. **Cálculo de la Puntuación Final:**
   - Dentro del `if`, se declara `puntuacionFinal`, que inicialmente es igual a `puntuacion`.
   - Luego, se añade a `puntuacionFinal` el producto de `nivelCompletado` multiplicado por `bonificacion`. Esto se traduce en un aumento de la puntuación basado en el rendimiento del jugador.

4. **Impresión de la Puntuación Final:**
   - Utiliza `System.out.println` para imprimir en la consola la puntuación final obtenida después de completar los niveles y sumar las bonificaciones correspondientes.

**Ejemplo de Ejecución:**
Suponiendo que el jugador ha terminado el juego (`juegoTerminado` es `true`), el cálculo sería el siguiente:

- Puntuación inicial: 10000
- Puntos adicionales por niveles completados: 8 niveles * 200 puntos/nivel = 1600 puntos
- Puntuación final: 10000 + 1600 = 11600

Por lo tanto, el programa imprimiría:

```
La puntuación final es = 11600
```

Este programa simula un cálculo que podría encontrarse en un videojuego, donde al finalizar el juego se otorgan puntos adicionales al jugador en función de los niveles completados y las bonificaciones adquiridas durante el juego.
