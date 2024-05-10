### Problema
Imagina que estás trabajando en un entorno donde la comunicación clara y precisa es crucial, como en control de tráfico aéreo o en operaciones militares. Este programa permite convertir mensajes clave letra por letra a su representación fonética para evitar errores de comunicación.

### Enunciado del Problema
Desarrolla un programa que convierta caracteres individuales en sus correspondientes palabras clave del alfabeto fonético NATO. Este programa deberá ser capaz de manejar letras mayúsculas y devolver un mensaje indicativo si la letra no tiene una correspondencia en el alfabeto fonético.

### Paso a Paso para Resolver el Problema

1. **Definir el Método de Conversión**:
   - Utiliza un switch expression para mapear cada letra a su correspondiente palabra fonética NATO.
   - Cada caso del switch retorna la letra y su palabra asociada.
   - El caso `default` maneja cualquier letra que no tenga una correspondencia directa, devolviendo "No encontrado".

2. **Prueba del Método**:
   - En el método `main`, invoca el método de conversión con varias letras para demostrar su funcionalidad.

## Solución propuesta
El código de la clase `ConversorANato` en Java es un ejemplo práctico de cómo implementar un conversor de letras a sus correspondientes códigos en el alfabeto fonético de la OTAN (NATO) utilizando una estructura de control moderna en Java, el switch expression. Este conversor es útil en contextos donde la precisión en la comunicación es esencial, como en operaciones militares, aeronáuticas, o en cualquier servicio de emergencia. A continuación, se explica cada componente del código en detalle:

### Estructura del Código

```java
public class ConversorANato {

    public static void main(String[] args) {
        System.out.println(convertirCaracterANato('A'));
        System.out.println(convertirCaracterANato('B'));
        System.out.println(convertirCaracterANato('C'));
        System.out.println(convertirCaracterANato('D'));
        System.out.println(convertirCaracterANato('E'));
        System.out.println(convertirCaracterANato('F'));
    }

    public static String convertirCaracterANato(char letra) {
        return switch (letra) {
            case 'A' -> "A - Alfa";
            case 'B' -> "B - Bravo";
            case 'C' -> "C - Charlie";
            case 'D' -> "D - Delta";
            case 'E' -> "E - Eco";
            default -> "No encontrado";
        };
    }
}
```

### Componentes del Código

1. **Método `main`**:
   - Este método sirve como punto de entrada para el programa. Realiza varias llamadas al método `convertirCaracterANato`, pasando diferentes letras como argumentos. Cada llamada convierte una letra en su respectivo código NATO y luego imprime el resultado.
   - Se utilizan las letras de 'A' a 'F' para demostrar la funcionalidad del método.

2. **Método `convertirCaracterANato`**:
   - **Parámetro de Entrada**: Este método toma un único parámetro, `letra`, de tipo `char`.
   - **Switch Expression**: Utiliza un switch expression para determinar la palabra correspondiente en el alfabeto fonético NATO para la letra dada.
      - **Casos**: Cada `case` en el switch está asociado con una letra específica y usa la sintaxis `->` para retornar inmediatamente un `String` que contiene la letra y su palabra NATO correspondiente (por ejemplo, "A - Alfa").
      - **Caso Default**: Maneja cualquier letra que no esté explícitamente definida en los casos anteriores, retornando "No encontrado".
   - Este método retorna un `String` que es la combinación de la letra y su representación en el alfabeto NATO o un mensaje de error si la letra no es reconocida.

### Importancia y Uso Práctico
Este programa es útil en aplicaciones que necesitan convertir letras en palabras claras para evitar la ambigüedad en la comunicación oral, especialmente en situaciones donde la claridad es crítica para evitar errores. Al usar switch expressions, el código es más legible y conciso, facilitando el mantenimiento y la escalabilidad.

### Conclusión
El `ConversorANato` es un ejemplo claro de cómo utilizar estructuras de control modernas en Java para realizar tareas específicas de forma eficiente y efectiva. La capacidad de manejar casos no especificados con el caso `default` garantiza que el programa pueda responder adecuadamente ante entradas inesperadas, haciendo el código robusto y confiable para uso en situaciones críticas.