# Problema
Imagina que estás desarrollando una aplicación para niños que les ayuda a aprender números en español. El programa debe ser capaz de tomar un número y mostrarlo en palabras para mejorar la comprensión y el aprendizaje del idioma y de las matemáticas básicas.

### Enunciado del Problema
Desarrolla un programa que convierta números enteros del 0 al 9 a sus equivalentes en palabras en español. Para números fuera de este rango, el programa debe imprimir "OTRO".

### Paso a Paso para Resolver el Problema

1. **Definición de la Función de Conversión**:
   - Crea un método llamado `imprimirNumeroEnPalabra` que acepta un número entero como parámetro.
   - Utiliza un `switch` expression para mapear cada número entero a su palabra correspondiente en español.
   - En el caso `default` del `switch`, maneja cualquier número que no esté entre 0 y 9, asignando la palabra "OTRO".

2. **Prueba de la Función**:
   - En el método `main`, invoca la función de conversión con números del 0 al 9, y también con números fuera de este rango para demostrar la respuesta del caso `default`.

## Solución propuesta
El programa `NumeroEnPalabra` en Java es un ejemplo sencillo de cómo convertir números enteros en sus correspondientes representaciones en palabras en español utilizando un switch expression, una característica de Java que permite realizar estas conversiones de manera limpia y eficiente. A continuación, te explico cada parte del código:

### Estructura General del Código

```java
public class NumeroEnPalabra {

    public static void main(String[] args) {
        imprimirNumeroEnPalabra(0);
        imprimirNumeroEnPalabra(1);
        imprimirNumeroEnPalabra(2);
        imprimirNumeroEnPalabra(3);
        imprimirNumeroEnPalabra(4);
        imprimirNumeroEnPalabra(5);
        imprimirNumeroEnPalabra(6);
        imprimirNumeroEnPalabra(7);
        imprimirNumeroEnPalabra(8);
        imprimirNumeroEnPalabra(9);
        imprimirNumeroEnPalabra(10);
        imprimirNumeroEnPalabra(-4);
    }

    public static void imprimirNumeroEnPalabra(int numero) {
        String numeroEnPalabra = switch (numero) {
            case 0 -> "CERO";
            case 1 -> "UNO";
            case 2 -> "DOS";
            case 3 -> "TRES";
            case 4 -> "CUATRO";
            case 5 -> "CINCO";
            case 6 -> "SEIS";
            case 7 -> "SIETE";
            case 8 -> "OCHO";
            case 9 -> "NUEVE";
            default -> "OTRO";
        };

        System.out.println(numeroEnPalabra);
    }
}
```

### Componentes del Código

1. **Método `main`**:
   - Este método es el punto de entrada del programa. Realiza varias llamadas al método `imprimirNumeroEnPalabra` con diferentes valores, que van desde números dentro del rango especificado (0-9) hasta números fuera de este rango (10 y -4), para demostrar la funcionalidad completa del conversor.

2. **Método `imprimirNumeroEnPalabra`**:
   - **Parámetro de Entrada**: El método toma un parámetro `numero` de tipo `int`, que es el número que se desea convertir en palabra.
   - **Switch Expression**: El corazón del método es un switch expression que asigna directamente una palabra en español a cada número del 0 al 9:
      - **Casos Específicos**: Para cada uno de los números del 0 al 9, hay un caso que retorna directamente la palabra en español correspondiente al número (por ejemplo, `case 0 -> "CERO"`).
      - **Caso Default**: Se utiliza para manejar cualquier número que no esté dentro del rango de 0 a 9, devolviendo la palabra "OTRO". Este caso asegura que el método pueda manejar cualquier entrada entera, proporcionando una salida definida incluso para valores no contemplados específicamente.
   - **Impresión del Resultado**: Finalmente, el resultado (la palabra convertida o "OTRO") se imprime en la consola.

### Uso Práctico

Este programa es útil en contextos educativos o en aplicaciones donde la representación verbal de números es necesaria. Por ejemplo, puede ser usado en programas de aprendizaje para niños, herramientas de accesibilidad para leer texto en voz alta, o en sistemas de respuesta automatizada donde los números necesitan ser claramente comunicados a los usuarios.

### Conclusión

El programa `NumeroEnPalabra` demuestra un uso práctico y eficiente de los switch expressions en Java para convertir números a palabras, ofreciendo una solución simple pero robusta para una tarea común en muchas aplicaciones de software. La estructura del código es clara y fácil de entender, lo que lo hace accesible para programadores de todos los niveles y útil en una variedad de escenarios de programación.