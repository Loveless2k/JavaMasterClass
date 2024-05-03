# Los métodos en Java
Anteriormente dijimos que en Java, un método es un bloque de código que contiene una serie de instrucciones diseñadas para ejecutar una tarea específica. 
Los métodos se utilizan para realizar operaciones repetitivas, para dividir el programa en bloques manejables, y para reutilizar código eficientemente.

## Utilización: 
Un método se define dentro de una clase y puede ser llamado desde otras partes del programa. 
La sintaxis básica para definir un método incluye el `modificador de acceso`, el `tipo de retorno`, el `nombre del método` y `parámetros` (opcionalmente).

### Modificadores de acceso
Ya hemos nombrado los `modificadores de acceso` previamente, pero no profundizamos en ellos.
Los modificadores de acceso en Java son `palabras clave` que se utilizan para establecer la visibilidad de clases, métodos, constructores (ya hablaremos sobre constructores más adelante) y variables miembro dentro de un programa. 
Estos modificadores determinan desde dónde se puede acceder a los elementos de una clase, lo que es fundamental para la `encapsulación` (de la que hablaremos en el futuro) y la seguridad en la programación orientada a objetos. 
Java proporciona cuatro niveles de acceso:

#### 1. **Public**
- **Descripción:** El miembro es accesible desde cualquier otra clase en cualquier paquete.
- **Uso Común:** Se usa cuando se desea que los datos o métodos sean accesibles globalmente. Por ejemplo, métodos `main` o API públicas de una librería.

#### 2. **Protected**
- **Descripción:** El miembro es accesible dentro de su propia clase, por clases dentro del mismo paquete, y por subclases incluso si están en diferentes paquetes.
- **Uso Común:** Es útil cuando quieres permitir que la clase sea extendida y que las subclases manipulen las propiedades o métodos protegidos (pero esto lo abordaremos con más detalle cuando veamos 'herencia' en la programación orientada a objetos).

#### 3. **Default** (Package-Private)
- **Descripción:** Si no se especifica un modificador de acceso, el miembro tiene visibilidad a nivel de paquete, lo que significa que solo es accesible dentro de clases definidas en el mismo paquete.
- **Uso Común:** Ideal para cuando estás trabajando con clases que deben interactuar entre sí dentro de un paquete pero no están destinadas a ser expuestas al uso externo.

#### 4. **Private**
- **Descripción:** El miembro es accesible solo dentro de la clase en la que está declarado.
- **Uso Común:** Se utiliza para ocultar los detalles de implementación de la clase y proteger la integridad de los datos.

#### Ejemplo de Código que Ilustra los Modificadores de Acceso

```java
package com.ejemplo.modificadores;

public class EjemploModificadores {
    public int variablePublica = 1;
    protected int variableProtegida = 2;
    int variablePaquete = 3; // Default package-private
    private int variablePrivada = 4;

    public void metodoPublico() {
        System.out.println("Acceso público");
    }

    protected void metodoProtegido() {
        System.out.println("Acceso protegido");
    }

    void metodoPaquete() { // Default package-private
        System.out.println("Acceso a nivel de paquete");
    }

    private void metodoPrivado() {
        System.out.println("Acceso privado");
    }
}

class OtroClaseEnElMismoPaquete {
    void ejemploAcceso() {
        EjemploModificadores obj = new EjemploModificadores();
        System.out.println(obj.variablePublica);
        System.out.println(obj.variableProtegida);
        System.out.println(obj.variablePaquete);
        // obj.variablePrivada no sería accesible aquí
    }
}
```

#### Buenas Prácticas y Consideraciones
- **Encapsulación:** Usa `private` para ocultar los detalles de implementación y `public` para definir la interfaz de tu clase.
- **Seguridad:** Restringir el acceso a ciertas partes de tus clases puede prevenir que el estado interno sea modificado de maneras inesperadas o incorrectas.
- **Diseño de Software:** Piensa cuidadosamente en la arquitectura de tus aplicaciones y quién necesita acceso a qué partes de tus clases. Usa los modificadores de acceso para imponer estas reglas de diseño.

El uso correcto de los modificadores de acceso es crucial para un buen diseño de software, ayudando a mantener la modularidad y la seguridad del código en aplicaciones Java.

## Cuándo usar métodos: 
Se recomienda emplear métodos cuando se detecta la necesidad de realizar una operación específica en múltiples lugares del código. 
Esto no solo reduce la duplicidad sino que también facilita el mantenimiento del código.

## Ejemplos y Buenas Prácticas:

### Nomenclatura: 
Usa nombres descriptivos para los métodos, por ejemplo, `calcularPosicionPuntuacionAlta` en lugar de `metodo1`.

### Cohesión: 
Cada método debe tener una sola responsabilidad. Evita incluir múltiples funcionalidades en un solo método.

### Modularidad: 
Divide problemas complejos en subproblemas más manejables utilizando métodos.

## Consejos:
  - Mantén los métodos cortos y enfocados.
  - Utiliza comentarios para documentar la lógica del método cuando sea necesario.
  - Considera el uso de valores de retorno y tipos de datos apropiados para expresar claramente el propósito del método.

## Llamada a Métodos en Java
En Java, llamar a un método es invocar una función o procedimiento que se ha definido previamente en una clase. 
La llamada a un método permite ejecutar el código contenido dentro de él desde otra parte del programa, ya sea desde otra instancia del método (ya hablaremos sobre la instanciación más adelante), desde un método diferente, o incluso desde la misma clase o diferentes clases.

## Componentes Clave en la Llamada de Métodos
  - `Nombre del Método`: Es la identificación única del método dentro de una clase (a menos que el método esté sobrecargado, es decir, múltiples métodos con el mismo nombre pero diferentes parámetros, pero ya abordaremos la sobrecarga 
        de métodos, más adelante). La llamada debe especificar este nombre para referirse al método que desea ejecutar.
  - `Parámetros`: Son valores o referencias pasados al método que requiere para realizar su operación. Los parámetros son opcionales; un método puede no necesitar parámetros para funcionar. 
        La definición del método especifica qué tipo de parámetros acepta, y en qué orden. Al llamar al método, los argumentos proporcionados deben coincidir con los parámetros en tipo y orden.
  - `Tipos de Retorno`: El tipo de retorno de un método indica qué tipo de valor devolverá el método después de su ejecución. Si el método no necesita devolver ningún valor, se utiliza la palabra clave `void`.
        Cuando se llama a un método que devuelve un valor, este retorno puede ser almacenado en una variable, utilizado directamente en expresiones, o ignorado, dependiendo de la necesidad del programa.

## Tipos de retorno
En Java, los tipos de retorno de un método indican el tipo de valor que el método devolverá después de su ejecución. 
Este tipo debe ser especificado en la definición del método y puede ser cualquiera de los tipos de datos disponibles en Java, así como clases o interfaces (ya hablaremos sobre interfaces más adelante). 
Aquí detallaré los principales tipos de retorno y algunos ejemplos para ilustrar su uso.

### Tipos de Retorno Básicos en Java

1. **Primitivos:**
   - **Boolean:** Devuelve un valor verdadero o falso.
   - **Char:** Devuelve un único carácter.
   - **Byte, Short, Int, Long:** Devuelven números enteros de diferentes tamaños.
   - **Float, Double:** Devuelven números decimales o flotantes.

2. **Objetos:**
   - **String:** Devuelve una cadena de caracteres.
   - **Arrays:** Devuelve una colección de elementos, ya sean primitivos o objetos.
   - **List, Set, Map:** Devuelve colecciones más complejas disponibles en Java Collections Framework.
   - **Clases personalizadas:** Puede devolver una instancia de cualquier clase definida por el usuario o por bibliotecas de terceros.
  
No te preocupes si estos elementos no te son familiares ahora, los abordaremos en detalle a medida que avance el curso.

3. **Void:**
   - **Void:** Se utiliza cuando el método no necesita devolver ningún valor. Es útil en métodos donde solo se requiere realizar una acción sin la necesidad de informar al llamador de algún resultado.

### Ejemplos de Uso

```java
public class EjemplosDeRetorno {
    // Método que devuelve un entero
    public int obtenerDoble(int numero) {
        return 2 * numero;
    }

    // Método que devuelve un objeto String
    public String saludar(String nombre) {
        return "Hola, " + nombre;
    }

    // Método que devuelve un booleano
    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    // Método que devuelve un objeto List
    public List<String> nombresDeCiudades() {
        return Arrays.asList("Madrid", "Barcelona", "Valencia");
    }

    // Método void que no devuelve nada
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
```

### Consideraciones y Buenas Prácticas sobre el tipo de retorno de un método

- **Consistencia:** Asegúrate de que el tipo de retorno declarado en la definición del método coincida con el tipo de valor retornado por todas las salidas posibles del método.
- **Nullabilidad:** Considera las implicaciones de devolver `null` en un método. Si es posible, evita devolver `null` para reducir el riesgo de `NullPointerException`. Utiliza opciones como `Optional` en Java 8 y posteriores para manejar valores que pueden estar ausentes.
- **Claridad:** Utiliza tipos de retorno que sean intuitivos y claros para los usuarios del método. Por ejemplo, si un método se llama `obtenerCantidad`, es esperado que devuelva un tipo numérico.

El tipo de retorno es una parte fundamental de la definición de un método, ya que determina cómo se puede utilizar el resultado de ese método en el resto del programa. 
Elegir el tipo de retorno adecuado y manejarlo correctamente son esenciales para escribir código robusto y mantenible.

## Ejemplo de Llamada a Método
Supongamos que tenemos una clase `Calculadora` que tiene un método para sumar dos números:

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
```

En este ejemplo:

  - `Nombre del Método`: sumar
  - `Parámetros`: 5 y 3 son pasados al método sumar. Estos deben ser del tipo int según la definición del método.
  - `Tipo de Retorno`: int, que indica que el método sumar devuelve un entero que es capturado en la variable resultado.

### Buenas Prácticas y Consejos a la hora de llamar métodos

- **Consistencia en Tipos**: Asegúrate de que los tipos de datos de los argumentos coincidan con los tipos de los parámetros definidos en el método.
- **Clareza en la Llamada**: Llama a los métodos de manera que sea claro qué está sucediendo; por ejemplo, evita anidar muchas llamadas de métodos en una sola línea si esto hace que el código sea difícil de leer.
- **Manejo de Valores de Retorno**: Siempre considera el tipo de retorno de un método y maneja adecuadamente el valor devuelto, especialmente si puede ser null o algún valor especial que indique una condición de error o un estado específico.

La comprensión de cómo y cuándo llamar a métodos es fundamental para la programación eficiente y la reutilización de código en Java, lo que contribuye a la creación de software mantenible y escalable.

## Ejercicio
Imagina un torneo de videojuegos donde dependiendo de la puntuación alcanzada, los jugadores son clasificados en diferentes categorías para premios y reconocimientos. 
Este sistema ayuda a organizar los premios de manera eficiente y justa.

### Enunciado: 
Escribe un programa que determine la posición de clasificación de un jugador en un juego basado en su puntuación. 
Las posiciones son 1 para puntuaciones 1000 o más, 2 para puntuaciones 500 o más, 3 para puntuaciones 100 o más y 4 para cualquier otra puntuación.

### Paso a Paso para la Resolución del Problema:
  1. Identificar las diferentes categorías de puntuaciones.
  2. Definir un método que acepte la puntuación del jugador como parámetro.
  3. Usar condicionales para determinar la categoría basada en la puntuación.
  4. Devolver la posición del jugador como resultado del método.

## Solución propuesta
De aquí en adelante - spoilers - Vamos a discutir sobre la solución propuesta a este problema.
El código de `DesafioMetodo` en Java es un ejemplo sencillo que demuestra cómo utilizar métodos y condiciones para determinar la posición de un jugador en un juego según su puntuación. 
A continuación, te detallo cada parte del código y su funcionamiento.

### Descripción de Componentes

1. **Clase `DesafioMetodo`:**
   - Esta es la clase principal que contiene todos los métodos y la lógica del programa.

2. **Método `main`:**
   - Este es el punto de entrada del programa. Aquí es donde comienza la ejecución del código.
   - Dentro del método `main`, hay varias llamadas al método `calcularPosicionPuntuacionAlta`, cada una con diferentes valores de puntuación.
   - Las puntuaciones usadas son 1500, 1000, 500, 100 y 25.
   - Cada llamada al método `calcularPosicionPuntuacionAlta` devuelve un entero que representa la posición del jugador, que luego se imprime en la consola.

3. **Método `calcularPosicionPuntuacionAlta`:**
   - Este método está diseñado para determinar la posición de un jugador basada en su puntuación.
   - Acepta un único parámetro entero (`puntuacionJugador`), que es la puntuación del jugador.
   - Utiliza una serie de instrucciones `if-else` para decidir qué posición corresponde a la puntuación dada:
     - Si la puntuación es 1000 o más, devuelve `1`.
     - Si la puntuación es 500 o más pero menos de 1000, devuelve `2`.
     - Si la puntuación es 100 o más pero menos de 500, devuelve `3`.
     - Si ninguna de las condiciones anteriores se cumple (es decir, la puntuación es menor de 100), devuelve `4`.

### Funcionamiento del Programa

Cuando el programa se ejecuta:
- Se invoca al método `main`.
- Dentro del `main`, se realizan llamadas al método `calcularPosicionPuntuacionAlta` con diferentes puntuaciones.
- Para cada puntuación, el método `calcularPosicionPuntuacionAlta` evalúa las condiciones y devuelve la posición correspondiente.
- Las posiciones devueltas se imprimen en la consola, informando al usuario de los resultados para cada puntuación.

Este código es un ejemplo de cómo se pueden utilizar métodos y estructuras condicionales para procesar y responder a diferentes entradas en un programa, manteniendo el código organizado y reutilizable.
