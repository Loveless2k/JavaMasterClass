# La clase `Math`
La clase `Math` en Java proporciona métodos estáticos para realizar operaciones matemáticas fundamentales. Algunos de los métodos más utilizados son:

### 1. `Math.abs()`
Devuelve el valor absoluto de un número dado. El valor absoluto es siempre positivo o cero.

**Ejemplo:**
```java
int negativo = -10;
System.out.println(Math.abs(negativo)); // Imprime "10"
```

### 2. `Math.ceil()`
Redondea el número decimal hacia arriba al número entero más cercano.

**Ejemplo:**
```java
double decimal = 9.2;
System.out.println(Math.ceil(decimal)); // Imprime "10.0"
```

### 3. `Math.floor()`
Redondea el número decimal hacia abajo al número entero más cercano.

**Ejemplo:**
```java
double decimal = 9.8;
System.out.println(Math.floor(decimal)); // Imprime "9.0"
```

### 4. `Math.round()`
Redondea un número decimal al entero más cercano. Si es un número con decimal .5, se redondea al entero siguiente.

**Ejemplo:**
```java
double decimal = 9.5;
System.out.println(Math.round(decimal)); // Imprime "10"
```

### 5. `Math.min()`
Devuelve el menor de dos números.

**Ejemplo:**
```java
int a = 10;
int b = 20;
System.out.println(Math.min(a, b)); // Imprime "10"
```

### 6. `Math.max()`
Devuelve el mayor de dos números.

**Ejemplo:**
```java
int a = 10;
int b = 20;
System.out.println(Math.max(a, b)); // Imprime "20"
```

### 7. `Math.pow()`
Calcula el valor de un número elevado a la potencia de otro número.

**Ejemplo:**
```java
double base = 2;
double exponente = 3;
System.out.println(Math.pow(base, exponente)); // Imprime "8.0"
```

### 8. `Math.sqrt()`
Calcula la raíz cuadrada de un número.

**Ejemplo:**
```java
double numero = 16;
System.out.println(Math.sqrt(numero)); // Imprime "4.0"
```

### 9. `Math.random()`
Genera un número pseudoaleatorio entre 0.0 y 1.0.

**Ejemplo:**
```java
double aleatorio = Math.random();
System.out.println(aleatorio); // Imprime un número entre 0.0 y 1.0
```

### 10. `Math.sin()`, `Math.cos()`, `Math.tan()`
Calculan el seno, coseno y tangente de un ángulo en radianes, respectivamente.

**Ejemplo:**
```java
double angulo = Math.PI / 2; // 90 grados en radianes
System.out.println(Math.sin(angulo)); // Imprime "1.0"
System.out.println(Math.cos(angulo)); // Imprime "0.0"
System.out.println(Math.tan(angulo)); // Puede imprimir un valor muy grande, ya que tan(90) tiende a infinito
```

Estos métodos de la clase `Math` son fundamentales en cualquier programa que requiere cálculos matemáticos precisos y eficientes.
Son utilizados en una amplia variedad de aplicaciones, desde juegos hasta aplicaciones científicas y financieras.

# Problema
Imagina que estás conduciendo un coche que muestra la velocidad en millas por hora, pero las señales de tráfico están en kilómetros por hora.
Necesitas una forma rápida de convertir entre estas unidades para asegurarte de no exceder los límites de velocidad.

## Enunciado del Problema
Crea un programa que convierta la velocidad de millas por hora a kilómetros por hora, validando entradas negativas como valores no válidos.

## Paso a Paso para Resolver el Problema

1. **Escribe un método que convierta millas por hora a kilómetros por hora.**
   - Verifica que la entrada sea positiva; de lo contrario, devuelve `-1`.
   - Realiza la conversión y redondea al número entero más cercano.

2. **Escribe un método que imprima el resultado de la conversión.**
   - Valida nuevamente la entrada como en el paso anterior.
   - Si es válida, imprime la velocidad original y la velocidad convertida.

## Solución propuesta
De aquí en más - spoilers - discutiremos sobre la solución propuesta a este problema.
El código de `ConvertidorDeVelocidad` es un programa Java diseñado para convertir velocidades de millas por hora a kilómetros por hora y proporcionar una salida formatada de estas conversiones.
El programa maneja también valores inválidos, es decir, velocidades negativas, las cuales no son lógicas en este contexto. Vamos a desglosar el código en sus componentes principales para entender mejor su funcionamiento.

### Descripción de Componentes

1. **Método `main`**:
   - Este es el punto de entrada del programa. Aquí se invoca repetidamente el método `imprimirConversion` con diferentes valores de entrada, algunos de los cuales son válidos y otros inválidos (negativos).

2. **Método `convertirAKilometrosPorHora`**:
   - Este método acepta una velocidad en millas por hora como parámetro y devuelve su equivalente en kilómetros por hora.
   - Primero, verifica si el valor de entrada es menor que cero, en cuyo caso retorna `-1` para indicar un valor inválido.
   - Si el valor es válido, calcula los kilómetros por hora utilizando la fórmula de conversión (1 milla = 1.609 kilómetros) y redondea el resultado al número entero más cercano utilizando `Math.round`.

3. **Método `imprimirConversion`**:
   - Este método también recibe una velocidad en millas por hora.
   - Realiza una verificación para determinar si el valor es válido. Si no lo es (i.e., es negativo), imprime "Valor inválido".
   - Si el valor es válido, llama al método `convertirAKilometrosPorHora` para obtener la conversión a kilómetros por hora y luego imprime ambos valores en un formato legible, mostrando tanto las millas como los kilómetros por hora.

### Funcionamiento en la Práctica

Al ejecutar el programa, se imprimirán los resultados de las conversiones para los valores de prueba dados. Los valores positivos mostrarán su equivalente en kilómetros por hora, mientras que para el valor negativo (-5.6), el programa indicará que es un "Valor inválido".
Este programa es útil en situaciones donde se necesita convertir velocidades entre diferentes unidades de medida, especialmente en contextos como simulaciones, aplicaciones de navegación, o programas educativos donde la conversión entre sistemas métricos y sistemas imperiales es frecuente.
