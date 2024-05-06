# El uso correcto del tipo de dato `boolean`
El tipo de dato `boolean` en Java es uno de los fundamentos de la programación, utilizado para representar valores verdaderos (`true`) o falsos (`false`).
Los booleanos son esenciales en el control de flujo de un programa, permitiendo decisiones condicionales y bucles controlados por condiciones.
Aquí te explico el uso correcto de `boolean` en Java, junto con ejemplos, sugerencias y buenas prácticas.

### Uso Básico de Booleanos

**Ejemplo Simple:**
```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println("¿Es divertido Java? " + isJavaFun); // Imprime: ¿Es divertido Java? true
System.out.println("¿Es sabroso el pescado? " + isFishTasty); // Imprime: ¿Es sabroso el pescado? false
```

### Uso en Declaraciones Condicionales
Los booleanos son ampliamente utilizados en estructuras de control como `if`, `while`, y `for`.

**Ejemplo con `if`:**
```java
boolean hasLicense = true;
if (hasLicense) {
    System.out.println("Puedes conducir.");
} else {
    System.out.println("Necesitas una licencia para conducir.");
}
```

### Uso en Expresiones Lógicas
Los operadores lógicos como `&&` (AND), `||` (OR) y `!` (NOT) se usan para formar expresiones booleanas complejas.

**Ejemplo de Operadores Lógicos:**
```java
boolean isAdult = true;
boolean hasTicket = true;
if (isAdult && hasTicket) {
    System.out.println("Puedes entrar al cine.");
}
```

### Buenas Prácticas y Sugerencias

1. **Nombres Descriptivos:**
    - Usa nombres de variables booleanas que indiquen claramente su propósito y lo que representan, como `isLoggedIn`, `isAvailable`, `hasCompleted`.

2. **Evita Comparaciones Redundantes:**
    - No es necesario comparar booleanos con `true` o `false` en las condiciones. Por ejemplo, en lugar de `if (isValid == true)`, simplemente usa `if (isValid)`.

**Ejemplo de Evitar Comparaciones Redundantes:**
```java
boolean isEligible = true;
if (isEligible) { // Correcto
    System.out.println("El usuario es elegible.");
}
```

3. **Uso de Constantes Booleanas:**
    - Utiliza `Boolean.TRUE` y `Boolean.FALSE` cuando necesites objetos `Boolean` en lugar de primitivos, como en colecciones que no admiten tipos primitivos.

**Ejemplo con Objetos Boolean:**
```java
Boolean isPremiumMember = Boolean.TRUE;
if (isPremiumMember.equals(Boolean.TRUE)) {
    System.out.println("Acceso a características premium.");
}
```

4. **Inicialización:**
    - Asegúrate de inicializar tus variables booleanas. Si no se inicializan explícitamente, las variables booleanas de instancia tienen un valor predeterminado de `false`,
      pero las variables locales no tienen un valor predeterminado y deben inicializarse antes de su uso.

5. **Legibilidad en Expresiones Complejas:**
    - Cuando combines múltiples operadores lógicos, usa paréntesis para hacer la intención más clara y mejorar la legibilidad.

**Ejemplo de Legibilidad Mejorada:**
```java
boolean hasPassedTest = true;
boolean hasCriminalRecord = false;
if (hasPassedTest && !hasCriminalRecord) {
    System.out.println("El candidato es elegible para el puesto.");
}
```

Estas prácticas y ejemplos te ayudarán a usar correctamente el tipo de dato `boolean` en tus programas Java, maximizando la claridad y eficiencia del código.

## Problema
Imagina que estás durmiendo y tu perro comienza a ladrar.
Necesitas saber si debes levantarte a investigar o si puedes ignorarlo y seguir durmiendo.
El programa decide basándose en la hora del día y si el perro realmente está ladrando.

### Enunciado del Problema
Desarrolla un programa que determine si debes despertarte en la noche debido a que tu perro está ladrando.
El perro ladra en horas que no son adecuadas para el descanso, específicamente antes de las 8 am o después de las 10 pm.

### Paso a Paso para Resolver el Problema

1. **Implementa un método que reciba dos parámetros:**
    - `estaLadrando`: un valor booleano que indica si el perro está ladrando.
    - `horaDelDia`: un entero representando la hora actual (en formato de 24 horas).

2. **Valida la hora del día:**
    - Asegúrate de que el valor de `horaDelDia` sea válido (entre 0 y 23). Si no es así, retorna `false` inmediatamente.

3. **Decide si debes despertarte:**
    - Si el perro está ladrando y la hora actual es antes de las 8 am o después de las 10 pm (`horaDelDia < 8 || horaDelDia > 22`), retorna `true`.
    - En cualquier otro caso, retorna `false`.

## Solución propuesta
A continuación, - spoilers - discutiremos la solución propuesta a este problema.
El programa `PerroLadrando`, implementado en Java, está diseñado para determinar si debemos despertarnos en medio de la noche debido a los ladridos de un perro.
Este tipo de funcionalidad podría ser útil en una aplicación de hogar inteligente, por ejemplo, para alertar a los propietarios de posibles intrusos o
problemas externos que hacen que el perro ladre durante horas inusuales.

### Estructura del Programa
El código del programa se compone de dos métodos principales: `main` y `deberiaDespertarse`.
Aquí está una explicación detallada de cada parte del programa:

### Descripción de Componentes

**1. Método `main`:**
- Este método es el punto de entrada del programa. Realiza pruebas del método `deberiaDespertarse` con diferentes escenarios para verificar su funcionamiento:
    - Un perro ladrando a la 1 am debería causar que nos despertemos.
    - Un perro no ladrando a las 2 am no debería causar que nos despertemos.
    - Un perro ladrando a las 8 am no debería causar que nos despertemos, ya que no es una hora inusual.
    - Una hora inválida (-1) debería resultar en `false` sin importar si el perro está ladrando o no.

**2. Método `deberiaDespertarse`:**
- **Parámetros:**
    - `estaLadrando`: un booleano que indica si el perro está ladrando.
    - `horaDelDia`: un entero que representa la hora actual en formato de 24 horas.
- **Proceso:**
    - Primero verifica si `horaDelDia` es válida. Si no está entre 0 y 23, retorna `false`.
    - Luego, evalúa si el perro está ladrando durante las horas críticas (antes de las 8 am o después de las 10 pm). Si ambas condiciones se cumplen (`estaLadrando` es `true` y `horaDelDia` es menor que 8 o mayor que 22), retorna `true`.
    - En cualquier otro caso, retorna `false`.

### Utilidad del Programa
El programa `PerroLadrando` es útil para determinar si los ladridos de un perro durante horas no convencionales son suficientes para despertar a alguien.
Esto podría aplicarse en sistemas de seguridad doméstica, donde los ladridos nocturnos podrían indicar una actividad inusual o un posible intruso.
Además, el programa ayuda a entender cómo se manejan los controles de flujo en Java mediante el uso de condiciones y validaciones.
