# Constantes
En Java, una **constante** es una variable cuyo valor no se espera que cambie una vez que se le ha asignado un valor inicial.
Las constantes son útiles en muchos contextos de programación para hacer que el código sea más legible, seguro y fácil de mantener.

### Características de las Constantes en Java

- **Inmutabilidad**: Una vez que una constante es inicializada, su valor no puede ser modificado.
- **Declaración**: Se declaran típicamente con las palabras clave `static` y `final`.
  `static` implica que la variable pertenece a la clase, más que a una instancia de la clase;
  `final` indica que una vez que la variable ha sido asignada, no puede ser reasignada.

### Cuándo Usar Constantes
Las constantes son especialmente útiles en los siguientes casos:

- **Valores que no cambian**: Como números pi (`π`), la gravedad en la Tierra, configuraciones estáticas que son comunes a todas las instancias de una clase.
- **Configuraciones de aplicación**: Tales como claves de API, URL de servicios web, o configuraciones de red que deben estar centralizadas y ser fácilmente accesibles
  desde diferentes partes del código.
- **Mejora de legibilidad**: Ayudan a reemplazar los "números mágicos" o cadenas en el código que no explican su propósito por sí mismos,
  haciendo el código más legible y mantenible.

### Ejemplos de Uso

**Declaración de Constantes:**

```java
public class PhysicsConstants {
    public static final double SPEED_OF_LIGHT = 299792458.0; // velocidad de la luz en m/s
    public static final double GRAVITY = 9.81; // aceleración debido a la gravedad en m/s^2
}
```

**Uso de Constantes en Métodos:**

```java
public class Calculator {
    public static final double PI = 3.14159;

    public double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}
```

### Sugerencias y Buenas Prácticas

- **Nombrar claramente**: Las constantes deben tener nombres descriptivos en mayúsculas, con palabras separadas por guiones bajos (`_`).
  Esto mejora la legibilidad y hace que sean fácilmente distinguibles en el código.
- **Uso apropiado de `static final`**: Asegúrate de utilizar `static` solo cuando la constante debe ser compartida entre todas las instancias de la clase.
  Si una constante es usada solo dentro de un método, podría ser declarada como `final` dentro de ese método.
- **Inicialización inmediata**: Siempre que sea posible, inicializa la constante en el punto de declaración.
- **Documentar su propósito**: Especialmente cuando el valor de la constante no es obvio, documenta por qué se necesita ese valor específico,
  lo que puede ser crucial para el mantenimiento futuro del código.

### Conclusión
Las constantes son una herramienta poderosa en Java que no solo ayuda a evitar errores al prevenir cambios no intencionales en valores críticos,
sino que también hacen que el código sea más claro y fácil de entender.
Usar constantes de manera efectiva puede significar una gran diferencia en la calidad del software y su capacidad para adaptarse y evolucionar sin introducir errores.

# Problema
Imagina que estás ayudando en una tienda de ropa donde las etiquetas de las prendas están en medidas imperiales (pies y pulgadas),
pero muchos de tus clientes están más familiarizados con el sistema métrico.
Necesitas una herramienta rápida que convierta estas medidas a centímetros para facilitar la compra a tus clientes.

### Enunciado del Problema
Desarrolla un programa que convierta medidas en pies y pulgadas a centímetros, usando dos métodos sobrecargados: uno que solo acepta pulgadas y otro que acepta tanto pies como pulgadas.

### Paso a Paso para Resolver el Problema

1. **Definir Constantes:**
    - Establece constantes para los valores de conversión, como el número de pulgadas en un pie y el número de centímetros en una pulgada.

2. **Implementar Método de Conversión de Pulgadas:**
    - Crea un método que acepte un número de pulgadas y lo multiplique por la constante de conversión para obtener el equivalente en centímetros.

3. **Implementar Método de Conversión de Pies y Pulgadas:**
    - Desarrolla un segundo método que acepte un número de pies y un número de pulgadas.
    - Convierte los pies a pulgadas y súmalas a las pulgadas proporcionadas.
    - Utiliza el primer método para convertir el total de pulgadas a centímetros.

4. **Probar la Funcionalidad:**
    - En el método `main`, realiza llamadas a ambos métodos con valores de muestra para demostrar que funcionan correctamente.

### Breve Descripción del Ejercicio
Este programa, `ConvertirACentimetros`, proporciona una herramienta útil para convertir medidas en pies y pulgadas a centímetros,
ideal para contextos donde se requiere una rápida conversión entre sistemas de medición, como en comercios o durante proyectos de diseño.

## Solución propuesta
De aquí en más, - spoilers - discutiremos sobre la solución propuesta.
El código del programa `ConvertirACentimetros` en Java se diseñó para convertir medidas expresadas en pies y pulgadas a centímetros.
La utilidad de este programa radica en su capacidad para facilitar conversiones rápidas y precisas entre sistemas de medición,
lo cual es comúnmente necesario en contextos como la ingeniería, la construcción, y la confección de prendas de vestir, donde se requiere precisión en las medidas.

### Estructura y Componentes del Código
El código se compone de varias partes clave que trabajan en conjunto para realizar las conversiones:

### Descripción Detallada

**1. Constantes:**
- `CENTIMETRO`: Define cuántos centímetros hay en una pulgada, con un valor de 2.54.
  Esta constante se utiliza para realizar la conversión de pulgadas a centímetros.
- `UN_PIE_EN_PULGADAS`: Define cuántas pulgadas hay en un pie, establecido a 12.
  Esta constante se usa para convertir pies a pulgadas.

**2. Método `main`:**
- Es el punto de entrada del programa donde se realizan llamadas a los métodos de conversión con valores de muestra para demostrar la funcionalidad.
- `convertirACentimetros(6)`: Convierte 6 pulgadas directamente a centímetros.
- `convertirACentimetros(6, 5)`: Convierte 6 pies y 5 pulgadas a centímetros.
  Primero, convierte los pies a pulgadas y luego suma las pulgadas adicionales antes de convertir el total a centímetros.

**3. Método `convertirACentimetros` (Sobrecarga 1):**
- Acepta un argumento entero (`pulgadas`) y retorna su equivalente en centímetros multiplicando las pulgadas por el valor de la constante `CENTIMETRO`.

**4. Método `convertirACentimetros` (Sobrecarga 2):**
- Acepta dos argumentos enteros (`pies` y `pulgadas`).
- Calcula el total de pulgadas combinando los pies convertidos en pulgadas y las pulgadas adicionales.
- Llama a la primera versión del método `convertirACentimetros` para convertir el total de pulgadas calculadas a centímetros.

### Sobrecarga de métodos
Habrás notado que en esta solución he creado el método `convertirACentrimetros` dos veces, aunque con distintos parámetros. A esto se le conoce como `sobre carga de métodos`.
La sobrecarga de métodos, o _method overloading_, es una característica de la programación orientada a objetos que permite a una clase tener más de un método con el mismo nombre, pero con diferentes listas de parámetros. Esta técnica es útil para mejorar la legibilidad del código y para crear métodos que realizan tareas similares pero con diferentes tipos o cantidades de argumentos. La sobrecarga de métodos es soportada en muchos lenguajes de programación, incluyendo Java, C++, y C#.

#### Criterios para la Sobrecarga de Métodos
Para sobrecargar un método, los métodos deben diferir en uno o más de los siguientes aspectos:
- **Número de parámetros**: Los métodos pueden tener diferentes números de parámetros.
- **Tipo de parámetros**: Los métodos pueden tener el mismo número de parámetros, pero con diferentes tipos.
- **Orden de los parámetros**: Para métodos con el mismo número y tipos de parámetros, el orden de los tipos puede ser diferente.

#### Beneficios de la Sobrecarga de Métodos
- **Claridad y simplicidad**: Facilita a los desarrolladores el uso de métodos que hacen esencialmente lo mismo, pero con diferentes parámetros, sin tener que recordar múltiples nombres de métodos.
- **Reutilización de código**: Permite a los desarrolladores escribir un método que puede ser llamado con diferentes tipos de datos, aumentando la reutilización del código.
- **Facilidad de uso y mantenimiento**: Hace que el código sea más intuitivo y fácil de entender, y simplifica el mantenimiento al agrupar métodos relacionados bajo un solo nombre.

#### Consideraciones
- La sobrecarga de métodos no se determina por el tipo de retorno del método, es decir, dos métodos con el mismo nombre y parámetros pero diferentes tipos de retorno no constituyen una sobrecarga válida.
- Es importante no abusar de la sobrecarga, ya que un exceso puede hacer que el código sea difícil de leer y mantener, especialmente si las diferencias en el comportamiento de los métodos sobrecargados no son claras o intuitivas.

En resumen, la sobrecarga de métodos es una técnica poderosa en programación orientada a objetos que, si se usa correctamente, puede hacer que el código sea más flexible, reutilizable y fácil de entender.
Ya profundizaremos más en la sobre carga de métodos en próximas clases, y haremos más ejercicios para que aprendas a aplicarla correctamente.

### Utilidad del Programa
Este programa es especialmente útil para realizar conversiones rápidas entre unidades comúnmente utilizadas en Estados Unidos (pies y pulgadas) a un sistema métrico (centímetros)
que es estándar en muchas otras partes del mundo.
Esto facilita tareas como adaptar recetas, realizar proyectos de bricolaje o carpintería, y trabajar en campos donde las dimensiones de los materiales son críticas.

En resumen, `ConvertirACentimetros` es un programa práctico y eficiente que resuelve el problema común de la conversión de medidas de manera simple y precisa.
