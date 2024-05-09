# Introducción al curso de Java
Antes de comenzar este curso es necesario pasar brevemente algunos conceptos fundamentales. No vamos a entrar en detalle, y no te preocupes
si no logras comprender cuál es la utilidad de cada concepto porque los iremos abordando en detalle poco a poco a medida que avancemos en el curso.

## ¿Qué es Java?
Java es un lenguaje de programación de alto nivel y orientado a objetos que fue desarrollado por Sun Microsystems (adquirido por Oracle Corporation en 2010). 
Fue creado por James Gosling y su equipo en la década de 1990 con el objetivo de ser un lenguaje de programación simple, portátil y robusto.

Java se caracteriza por las siguientes características:

  - `Portabilidad`: Los programas escritos en Java pueden ejecutarse en diferentes plataformas sin necesidad de realizar modificaciones, gracias a la máquina virtual Java (JVM) que actúa como un intermediario entre el código Java y el sistema operativo subyacente.
  - `Orientado a objetos`: Java es un lenguaje de programación orientado a objetos, lo que significa que se basa en el concepto de `clases` y `objetos`. Esto permite una programación modular, extensible y reutilizable. Ya veremos qué son las clases y los objetos, más adelante.
  - `Seguridad`: Java tiene características de seguridad integradas que ayudan a proteger contra vulnerabilidades como el acceso no autorizado a datos y la ejecución de código malicioso.
  - `Simplicidad`: Java está diseñado para ser fácil de aprender y usar. Tiene una sintaxis clara y legible que facilita la escritura y comprensión del código.
  - `Multiplataforma`: Como mencioné anteriormente, Java es multiplataforma, lo que significa que los programas Java pueden ejecutarse en diferentes sistemas operativos, como Windows, macOS y Linux, siempre que tengan instalada la JVM correspondiente.

Java se utiliza ampliamente en una variedad de aplicaciones, incluyendo desarrollo web (a través de frameworks como Spring y Java EE), desarrollo de aplicaciones de escritorio (con tecnologías como JavaFX y Swing), desarrollo de aplicaciones móviles (con Android) y desarrollo de sistemas embebidos, entre otros. 
Además, Java es uno de los lenguajes más populares en la industria y es ampliamente utilizado por desarrolladores de todo el mundo.

Para un desarrollador de Java principiante, es crucial comprender los conceptos fundamentales del lenguaje, pero los vamos a ir repasando en cada una de las clases.
Por lo pronto asumiré que ya has instalado un JDK, (versión 17, que es la que uso actualmente) y que ya tienes configurado tu IDE de preferencia.
En este curso haré uso del IDE IntelliJ IDEA.

A continuación te mostraré un resumen de las palabras reservadas de Java. 
No es necesario en este minuto que comprendas qué significan o para qué sirven, porque lo vamos a ir descubriendo paso a paso.
Sin embargo es importante que entiendas que dichas palabras tienen un significado especial en el lenguaje Java.

## Palabras clave o palabras reservadas en Java
En Java, las palabras reservadas son palabras que tienen un significado específico y están predefinidas por el lenguaje. 
Estas palabras reservadas no pueden utilizarse como identificadores (nombres de variables, métodos, clases, etc.) en el código Java, ya que son parte de la sintaxis del lenguaje y tienen un propósito definido.

Java tiene un conjunto específico de palabras reservadas, y la cantidad total puede variar dependiendo de la versión del lenguaje. 
Sin embargo, en general, hay alrededor de 50 palabras reservadas en Java. Aquí hay algunas de las palabras reservadas más comunes en Java, agrupadas por su función:

### 1. Declaración de clases, interfaces y enumeraciones:
  - `class`: Define una clase.
  - `interface`: Define una interfaz.
  - `enum`: Define una enumeración.
    
### 2. Modificadores de acceso:
  - `public`: Indica que un miembro es accesible desde cualquier otro lugar.
  - `private`: Indica que un miembro es accesible solo dentro de la misma clase.
  - `protected`: Indica que un miembro es accesible dentro del mismo paquete o por subclases.
  - `static`: Indica que un miembro pertenece a la clase en sí misma, no a una instancia específica.

### 3. Control de flujo:
  - `if`, `else`: Estructuras de control condicionales.
  - `for`, `while`, `do`: Estructuras de control de bucles.
  - `switch`, `case`, `default`: Estructura de control de selección múltiple.

### 4. Gestión de excepciones:
  - `try`, `catch`, `finally`: Bloques de manejo de excepciones.

### 5. Otros:
  - `return`: Devuelve un valor desde un método.
  - `new`: Crea una nueva instancia de una clase.
  - `this`: Hace referencia a la instancia actual de la clase.
  - `super`: Hace referencia a la clase base de la clase actual.
  - `void`: Indica que un método no devuelve ningún valor.

Estos son solo algunos ejemplos de palabras reservadas en Java. Es importante tener en cuenta que estas palabras tienen significados específicos y no pueden ser utilizadas como identificadores en el código Java. 
Utilizar una palabra reservada como identificador resultará en un error de compilación.
Reitero que si algunas de las descripciones no te hizo ningún sentido, no te preocupes, pronto lo tendrá.

# Tipos Primitivos en Java
Java define varios tipos primitivos para representar números, caracteres y valores booleanos. 
Los tipos numéricos incluyen enteros y de punto flotante, cada uno con variantes que ocupan diferentes cantidades de memoria y tienen diferentes rangos de valores.

  - `byte`: 8 bits, rango de -128 a 127.
  - `short`: 16 bits, rango de -32,768 a 32,767.
  - `int`: 32 bits, rango de -2,147,483,648 a 2,147,483,647.
  - `long`: 64 bits, rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
  - `float`: 32 bits, rango de aproximadamente ±1.4E-45 a ±3.4028235E38.
  - `double`: 64 bits, rango de aproximadamente ±4.9E-324 a ±1.7976931348623157E308.
  - `char`: 16 bits, representa caracteres Unicode.
  - `boolean`: representa valores de verdadero o falso.

## Clases contenedoras
Para cada tipo primitivo, existe una clase contenedora en Java:

  - `Byte`
  - `Short`
  - `Integer`
  - `Long`
  - `Float`
  - `Double`
  - `Character`
  - `Boolean`

Antes de explicar realmente en qué consiste una `clase contenedora` es necesario que primero comprendas, aunque solo en esencia, qué son las clases y qué son los métodos, aunque profundizaré en ellos más adelante.

En Java, una clase es un plano, un molde o una plantilla que define la estructura y el comportamiento de objetos del mundo real. En otras palabras, una clase es un modelo que describe cómo deben ser los objetos de un tipo específico.

Los métodos en Java, por otro lado, son bloques de código que encapsulan una serie de instrucciones diseñadas para realizar una tarea específica. Estos métodos son miembros de una clase y se utilizan para definir el comportamiento de los objetos de esa clase. 
Cada método tiene un nombre único y puede aceptar parámetros como entrada, realizar cálculos o manipulaciones en esos parámetros y, opcionalmente, devolver un resultado.

Las `clases contenedoras` contienen métodos útiles para manejar los respectivos tipos primitivos, como convertir a otros tipos, comparar, y obtener valores máximos y mínimos. Por ejemplo, 
`Integer.MAX_VALUE` e `Integer.MIN_VALUE`, entregan los valores máximos y mínimos respectivamente del tipo primitivo `int` a través de la clase contenedora `Integer`.

En realidad, los métodos ahí son `MAX_VALUE` y `MIN_VALUE` e `Integer` es la clase que los contiene. Para invocar métodos de una clase, sea contenedora o no, se utiliza la nomenclatura de punto. Es decir, se llama a la clase correspondiente,
y se utiliza un punto para acceder a sus miembros. 

Es fácil recordar cuáles son las clases contenedoras, porque suelen llamarse de la misma manera que su tipo primitivo correspondiente, salvo que empiezan con la primera letra en mayúsculas.
Esta regla aplica para la mayoría de los tipos primitivos exceptuando a los tipos `char` e `int`, ya que sus clases contenedoras son `Character` e `Integer` respectivamente.

## Variables
Una variable en Java es un espacio de memoria reservado para almacenar un valor temporal durante la ejecución de un programa. 
La declaración de una variable especifica su tipo y nombre, opcionalmente, se puede inicializar en el mismo paso. Por ejemplo:
`int edad = 30;`. Aquí, `edad` es una variable de tipo `int`, inicializada con el valor `30`.
Los tipos disponibles para crear una variable son precisamente los `tipos primitivos` que vimos anteriormente. Aunque más adelante, cuando veamos con mayor profundidad el tema de las clases, descubrirás que los tipos disponibles 
para una variable no se limitan únicamente a los tipos primitivos.

## Valor por defecto para variables de clase
¿Qué ocurre si se declara una variable, pero no se inicializa enseguida?
Java asigna valores por defecto a las variables de clase si no se inicializan explícitamente:

  - `0` para tipos numéricos enteros (byte, short, int, long).
  - `0.0` para tipos de punto flotante (double, float).
  - `false` para boolean.
  - `\u0000` para char (Ya se abordará esta nomenclatura más adelante).

Con esto en mente, entonces, si se declara la variable: `int valorInt;`, aunque no haya sido inicializado, su valor por defecto será `0`. 

## Valor por defecto para variables locales
Cuidado, que la regla anterior solo aplica para las `variables de clase`, o variables globales.
Es decir, variables que son declaradas al inicio de una clase y que pueden utilizarse a lo largo del ciclo de vida de dicha clase. Porque también existen las `variables locales`, las que se declaran específicamente en los métodos 
de la clase y que solo viven dentro de dicho método. 

Es vital inicializar las variables locales antes de su uso, ya que Java no asigna valores por defecto a variables locales, lo cual podría llevar a errores de compilación.

## Valores por defecto en Java y sufijos D, F, y L
Hay que poner especial atención a los valores por defecto de Java.
Por ejemplo, ¿Qué ocurriría si se trata de asignar el valor `50.0` a una variable de tipo `float`?  
`float valorFloat = 50.0;`  

A simple vista no se ve que vaya a haber ningún inconveniente ya que el valor `50.0` es sin duda un valor de coma flotante. Sin embargo Java reconoce a todo valor de coma flotante, por defecto, como valores de tipo `double`.
En consecuencia, se estará tratando de almacenar un valor `double` en una variable de tipo `float` y Java respondería con un error en tiempo de ejecución por tipos de datos incompatibles:  
`float valorFloat = 50.0; // Error: incompatible types: possible lossy conversion from double to float`  

Para solucionar este problema debemos utilizar el sufijo 'f' o 'F' para indicar explícitamente que el valor de `50.0` es de tipo `float`:  
`float valorFloat = 50.0f; // Correcto: asignación explícita de un valor float`  

El sufijo 'd' o 'D' para un valor como `50.0` es opcional porque, como bien se mencionó anteriormente, Java reconoce por defecto este valor como un valor de tipo `double`. 
Incluso es opcional su uso en valores enteros, porque Java transforma implícitamente el entero en un valor de tipo `double` cuando se almacena un entero en una variable de tipo `double`, sin embargo su uso 
se recomienda para efectos de claridad que ayudan con la legibilidad del código.

El sufijo 'l' o 'L' es necesario cuando  se asigna un valor a una variable de tipo `long` para evitar la limitación de tamaño de `int`:  
`long valorLong = 50000L; // Correcto, sin el sufijo se interpreta como int.`

## Casting
Hay casos donde, como se pudo apreciar, la conversión implícita de un tipo de dato a otro no es posible, para lo cual se ha hecho uso de sufijos especiales que ayudan con esta conversión.
Pero también existe otro modo de convertir tipos de datos de manera explícita, a través de un mecanismo conocido como `casting`.

El casting es una conversión explícita de un tipo de dato a otro, necesaria cuando se realiza una operación que podría perder precisión o no es compatible directamente. 
Por ejemplo, en la sentencia `short valorShort = (short) (Short.MIN_VALUE + 100);` es necesario porque la operación Short.MIN_VALUE + 100 se evalúa como un `int` por defecto, 
y necesita ser convertida explícitamente a short para evitar la pérdida de datos o errores de compilación.

Para usar casting solo es necesario anteponer a la expresión que se desea convertir, el tipo de dato entre paréntesis al que se desea transformar.

## Expresiones
En Java, las expresiones son construcciones que combinan variables, operadores, llamadas a métodos y constantes para producir un nuevo valor. 
Las expresiones son fundamentales en cualquier lenguaje de programación porque permiten realizar operaciones, evaluar condiciones, y manipular datos de manera dinámica durante la ejecución de un programa. 
A continuación, te explico en detalle los componentes y características de las expresiones en Java.

Las expresiones en Java pueden incluir los siguientes componentes:

  - `Variables`: Referencias a espacios de memoria que almacenan valores que pueden cambiar durante la ejecución del programa.
  - `Constantes`: Valores que no cambian durante la ejecución del programa. Pueden ser literales directos (como 42, 3.1416, "Hola Mundo"), o constantes declaradas (final int maxUsers = 100;).
  - `Operadores`: Símbolos que especifican qué operación se debe realizar entre los operandos. Java tiene varios tipos de operadores:
      - `Aritméticos`: Para realizar operaciones matemáticas (por ejemplo, +, -, *, /, %).
      - `Relacionales`: Para comparar dos valores (por ejemplo, ==, !=, <, >, <=, >=).
      - `Lógicos`: Para combinar condiciones booleanas (por ejemplo, &&, ||, !).
      - `De asignación`: Para asignar valores a variables (por ejemplo, =, +=, -=, *=).
      - `Unarios`: Operan sobre un solo operando (por ejemplo, +, - como en -num, ++, --).
      - `Bit a bit`: Operan a nivel de bits individuales de sus operandos (por ejemplo, &, |, ^, ~).
  - `Llamadas a Métodos`: Las funciones o métodos devuelven un valor que puede ser parte de una expresión (por ejemplo, Math.sqrt(x)).
  - `Expresiones Condicionales`: Permiten seleccionar entre dos valores dependiendo de una condición booleana, a menudo usando el operador ternario (? :).
    
### Tipos de Expresiones en Java
Las expresiones pueden ser de varios tipos, dependiendo de su propósito y del tipo de valor que producen:

  - `Expresiones de Asignación`: Asignan el resultado de una expresión a una variable, como x = 5.
  - `Expresiones Aritméticas`: Realizan cálculos matemáticos y devuelven un resultado numérico, como x + y.
  - `Expresiones Booleanas`: Evalúan a un valor booleano (true o false), útiles en estructuras de control como if y while, por ejemplo, x < y.
  - `Expresiones de Cadena`: Involucran operaciones sobre cadenas de caracteres, como concatenación ("Hola, " + "mundo").
  - `Expresiones de Instancia`: Crean objetos o instancias, como new String("Hola").

### Evaluación de Expresiones
La evaluación de una expresión sigue reglas específicas, conocidas como reglas de precedencia y asociatividad de operadores, que determinan el orden en el cual se realizan las operaciones en una expresión compleja. 
Por ejemplo, en la expresión `3 + 4 * 5`, el resultado es `23` y no `35` debido a que el operador `*` tiene mayor precedencia que `+`.

### Importancia de las Expresiones en Java
Las expresiones son críticas en la programación en Java porque permiten al programador escribir instrucciones que manipulen datos de manera eficiente y flexible. 
Estas son usadas en casi todas las partes de un programa, desde simples cálculos hasta complejas decisiones lógicas.

## System.out.println
`System.out.println` es una de las funciones más utilizadas en Java, especialmente útil para la depuración y la presentación de información a los usuarios. 
Forma parte del paquete `java.lang`, el cual es automáticamente importado en cualquier programa Java. 
A continuación, te explico en detalle la utilidad y el funcionamiento de `System.out.println`.

### Componentes de System.out.println
  - `System`: Es una clase final del paquete `java.lang` que proporciona facilidades relacionadas con el sistema, como la entrada y salida estándar, entre otros.
  - `out`: Es un campo estático de la clase `System` que representa el "flujo de salida estándar". Este flujo está conectado a la consola en la mayoría de los entornos de desarrollo Java.
  - `println`: Es un método de la clase `PrintStream`, que es el tipo de objeto referenciado por `System.out`. El método println está sobrecargado varias veces para aceptar diferentes tipos de datos (como int, double, char, String, entre otros) o incluso ningún dato.

### Funcionalidades de System.out.println
  - `Salida de Datos`: Permite mostrar resultados de operaciones, valores de variables, y mensajes en la consola, lo cual es fundamental durante el desarrollo y depuración de programas. Ayuda a entender cómo cambian los estados dentro de un programa en ejecución.
  - `Depuración`: Es una herramienta esencial de depuración, ya que permite a los desarrolladores imprimir mensajes descriptivos junto con los valores de las variables para rastrear el flujo y el estado del programa en diferentes puntos de su ejecución.
  - `Formato de Salida Sencillo`: Al usar println, cada llamada resulta en una nueva línea en la consola, lo que ayuda a mantener la salida organizada sin necesidad de incluir explícitamente caracteres de nueva línea.

### Ejemplos de Uso
Aquí tienes un ejemplo simple de cómo se puede utilizar System.out.println:

```java
public class Test {
    public static void main(String[] args) {
        int sum = 5 + 5;
        System.out.println("El resultado de la suma es: " + sum);
        System.out.println("Este es un mensaje en una nueva línea.");
    }
}
```

Este código imprimirá:
`El resultado de la suma es: 10`  
Este es un mensaje en una nueva línea.

Cada llamada a System.out.println imprime el mensaje en la consola y luego mueve el cursor a una nueva línea, facilitando la lectura de múltiples salidas.

### Importancia de System.out.println
Aunque `System.out.println` es muy útil para programas simples y para la depuración, en aplicaciones más grandes y en producción, se suele utilizar un sistema de logging más avanzado y configurable (como Log4j, SLF4J, etc.). 
Esto se debe a que los sistemas de logging ofrecen niveles de severidad, salida a diferentes destinos, y configuración en tiempo de ejecución, que son características necesarias para el manejo de aplicaciones complejas y en entornos de múltiples usuarios.

## El método 'main'
El método main es el punto de entrada principal para cualquier programa Java. 
Cuando ejecutas un programa Java, el sistema primero busca el método main y lo ejecuta. 
Es un método especial y obligatorio que debe estar presente en cualquier clase que deseas ejecutar como una aplicación independiente.

### Declaración y firma:
El método main tiene la siguiente firma estándar en Java:
```java
public static void main(String[] args)
```

  - `public`: Indica que el método es accesible desde cualquier otra clase.
  - `static`: Indica que el método pertenece a la clase en sí misma, no a una instancia particular de la clase.
  - `void`: Indica que el método no devuelve ningún valor.
  - `main`: Es el nombre del método.
  - `String[] args`: Es un parámetro que representa los argumentos de línea de comandos pasados al programa.

### Punto de entrada
Cuando ejecutas un programa Java, el sistema busca el método main y comienza la ejecución desde allí. 
Si el método main no está presente o no tiene la firma correcta, el programa no se ejecutará.

### Argumentos de líneas de comandos
Los argumentos de línea de comandos pasados al programa se proporcionan como un arreglo de cadenas (`String[] args`) al método main. 
Estos argumentos pueden ser utilizados por el programa para realizar operaciones específicas, como configuraciones de inicialización o interacción con el usuario.

### Implementación:
Dentro del cuerpo del método main, puedes escribir cualquier código que desees que se ejecute cuando el programa se inicie. 
Esto puede incluir la inicialización de variables, la llamada a otros métodos, la interacción con el usuario o cualquier otra operación que desees realizar.

### Finalización:
Una vez que el método main termina de ejecutarse, el programa finaliza su ejecución y sale. 
Cualquier limpieza de recursos o acciones finales que necesiten realizarse deben ser manejadas dentro del método main o en otros métodos llamados desde él.

En resumen, el método main es el punto de entrada principal para cualquier programa Java, desde el cual comienza la ejecución del programa y donde puedes realizar cualquier operación necesaria para el funcionamiento del programa. 
Es un componente esencial en la estructura de cualquier aplicación Java.

Ya hasta esta parte se han incorporado varios términos en los que no se han entrado en detalle, pero serán abordadas todas a medida que avancemos en este curso.

# Ejercicio:
  1. Crea el proyecto 'TiposPrimitivos' en tu IDE de preferencia.
  2. Crea la clase 'TiposPrimitivos'.
  3. Crea el método 'main'
  4. Dentro del método 'main' imprime el rango de valores para los tipos de datos primitivos `byte`, `short`, `int` y `long`. Como pista, puedes utilizar `System.out.println` para imprimir mensajes a la consola y puedes apoyarte de las clases contenedoras para obtener los rangos.
  5. Declara e inicializa una variable `byte`, `short` e `int`. Utiliza un valor literal para el primero (50), una operación matemática más casting para el segundo y el tercero es a libre elección.
  6. Imprime los valores de las variables declaradas en el paso anterior.
  7. Suma el valor de las tres variables e imprime el resultado.
  8. Ese resultado, multiplícalo por 10 y súmale 50000 y almacena el resultado en una variable de tipo `long`.
  9. Imprime la variable de tipo `long`
  10. Imprime una explicación del cálculo realizado.

Puedes encontrar el resultado de este ejercicio dentro de la carpeta `src` de este proyecto.

## Solución propuesta
El código de la clase `TiposPrimitivos` en Java realiza varias operaciones interesantes relacionadas con los tipos primitivos numéricos y sus usos prácticos. A continuación, se detalla cada parte del código:

### Impresión de Rangos de Valores de Tipos Primitivos

El código comienza imprimiendo los rangos de valores mínimos y máximos para los tipos primitivos numéricos `byte`, `short`, `int`, y `long`. Estos valores están definidos en las clases wrapper correspondientes (`Byte`, `Short`, `Integer`, `Long`) y son útiles para entender las limitaciones de cada tipo en cuanto a almacenamiento de datos numéricos.

```java
System.out.println("Rango de valores para byte: de " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
System.out.println("Rango de valores para short: de " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
System.out.println("Rango de valores para int: de " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
System.out.println("Rango de valores para long: de " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
```

### Declaración e Inicialización de Variables

A continuación, se declaran e inicializan variables de tipo `byte`, `short`, e `int`:

- **Byte**: Se inicializa con el valor 50.
- **Short**: Se inicializa sumando 100 al mínimo valor que puede tomar un `short`. Esto se hace para evitar un desbordamiento de valor y para mostrar cómo se puede ajustar el rango de valores operativos de un tipo `short`.
- **Int**: Se inicializa restando 1000 al máximo valor que puede tomar un `int`, demostrando cómo manejar valores cerca del límite superior de un tipo.

```java
byte valorByte = 50;
short valorShort = (short) (Short.MIN_VALUE + 100);
int valorInt = Integer.MAX_VALUE - 1000;
```

### Impresión de los Valores de las Variables

Se imprimen los valores almacenados en cada una de las variables declaradas anteriormente para verificar que se hayan inicializado correctamente.

```java
System.out.println("Valor de valorByte = " + valorByte);
System.out.println("Valor de valorShort = " + valorShort);
System.out.println("Valor de valorInt = " + valorInt);
```

### Cálculo y Impresión de una Suma

El programa calcula la suma de los valores almacenados en las variables `valorByte`, `valorShort`, y `valorInt`. Luego imprime el resultado de esta suma.

```java
int sumaDeTres = valorByte + valorShort + valorInt;
System.out.println("La suma de valorByte, valorShort y valorInt es = " + sumaDeTres);
```

### Cálculo y Impresión de una Operación más Compleja

Finalmente, se realiza un cálculo más complejo donde se multiplica la suma anterior por 10 y se suma 50,000. El resultado se almacena en una variable de tipo `long` para acomodar el potencialmente gran valor resultante y se imprime.

```java
long valorLong = 50000L + (10L * sumaDeTres);
System.out.println("Resultado de valorLong = " + valorLong);
```

### Explicación del Cálculo Realizado

Se proporciona una explicación detallada de cómo se realizó el cálculo para `valorLong`, lo que es útil para entender la lógica detrás de las operaciones y cómo los valores de diferentes tipos primitivos interactúan en cálculos mixtos.

```java
System.out.println("valorLong se calcula sumando 50,000 a 10 veces la suma de valorByte, valorShort y valorInt");
```

### Conclusión

Este código proporciona una excelente demostración práctica de cómo trabajar con diferentes tipos primitivos en Java, cómo manejar la conversión y promoción de tipos en operaciones aritméticas y cómo asegurarse de que los valores permanezcan dentro de los límites seguros para evitar errores de desbordamiento o precisión.