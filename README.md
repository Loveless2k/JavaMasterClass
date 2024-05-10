## Problema 
Imagina que eres un controlador aéreo o un operador de radio y necesitas transmitir mensajes claros y sin ambigüedades a través de comunicaciones que pueden ser susceptibles a errores debido al ruido o interferencias. Utilizar un código fonético, como el alfabeto NATO, es esencial para la claridad y precisión en la comunicación.

### Enunciado del Problema
Desarrolla un programa en Java que convierta caracteres (letras) en sus correspondientes códigos fonéticos según el alfabeto de la OTAN. El programa debe manejar tanto letras reconocidas en el alfabeto como letras o caracteres no contemplados, devolviendo un mensaje específico en cada caso.

### Paso a Paso para Resolver el Problema

1. **Definición de la Función de Conversión**:
   - Crea un método que acepte un carácter y utilice un switch tradicional para asociar cada letra con su correspondiente palabra en el alfabeto NATO.
   - Cada caso dentro del switch asigna un valor a la variable `mensajeFinal` que consiste en la letra seguida de su palabra NATO correspondiente.
   - El caso `default` maneja cualquier entrada que no corresponda a las letras definidas.

2. **Prueba de la Función**:
   - En el método `main`, invoca la función de conversión con varias letras para demostrar cómo funciona la conversión para letras válidas y para un carácter no contemplado.

## Solución propuesta
El código del programa `ConversorANato` en Java es una implementación sencilla y eficiente que convierte caracteres alfabéticos en sus correspondientes códigos fonéticos según el alfabeto de la OTAN (NATO). A continuación, te explico cada parte del código:

### Estructura General del Código
El programa está organizado en dos partes principales: el método `main`, que ejecuta el programa, y el método `convertirCaracterANato`, que realiza la conversión de caracteres a códigos NATO.

```java
public class DesafioNato {

    public static void main(String[] args) {
        System.out.println(convertirCaracterANato('A'));
        System.out.println(convertirCaracterANato('B'));
        System.out.println(convertirCaracterANato('C'));
        System.out.println(convertirCaracterANato('D'));
        System.out.println(convertirCaracterANato('E'));
        System.out.println(convertirCaracterANato('F'));
    }

    public static String convertirCaracterANato(char letra) {
        String mensajeFinal;

        switch (letra) {
            case 'A':
                mensajeFinal = "A - Alfa";
                break;
            case 'B':
                mensajeFinal = "B - Bravo";
                break;
            case 'C':
                mensajeFinal = "C - Charlie";
                break;
            case 'D':
                mensajeFinal = "D - Delta";
                break;
            case 'E':
                mensajeFinal = "E - Eco";
                break;
            default:
                mensajeFinal = "No encontrado";
                break;
        }

        return mensajeFinal;
    }
}
```

### Componentes del Código

1. **Método `main`**:
   - Este es el punto de entrada para el programa. En este método, se realiza una serie de llamadas al método `convertirCaracterANato` para diferentes letras del alfabeto.
   - Cada llamada al método retorna el código NATO correspondiente a la letra proporcionada, que luego se imprime en la consola.

2. **Método `convertirCaracterANato`**:
   - **Parámetro de Entrada**: Este método toma un único parámetro, `letra`, de tipo `char`.
   - **Switch Tradicional**: Utiliza un switch para asignar a cada letra su correspondiente palabra en el alfabeto NATO:
      - **Casos Específicos**: Para las letras de 'A' a 'E', cada caso dentro del switch asigna a `mensajeFinal` un string que combina la letra con su palabra NATO correspondiente.
      - **Caso Default**: Este caso se ejecuta si la letra proporcionada no coincide con ninguno de los casos específicos anteriores. Asigna a `mensajeFinal` el valor "No encontrado", lo que indica que la letra no tiene una asignación directa en el alfabeto NATO proporcionado.
   - **Retorno**: Devuelve el valor de `mensajeFinal`, que contiene el código NATO correspondiente o el mensaje de no encontrado.

### Uso Práctico

Este programa es especialmente útil en contextos donde la precisión en la comunicación es crítica, como en la aviación, la navegación marítima, o en operaciones militares y de emergencia. Al convertir letras a códigos claros y universalmente reconocidos, se minimiza el riesgo de malentendidos causados por la mala calidad de la comunicación o por diferencias en los acentos y pronunciaciones.

### Conclusión

El programa `DesafioNato` demuestra una aplicación práctica de los switch en Java para resolver un problema común en comunicaciones críticas. Utiliza estructuras de control tradicionales para ofrecer una solución directa y eficaz al problema de convertir letras a palabras clave en un contexto donde la claridad y precisión son fundamentales.