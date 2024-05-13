# Problema
Imagina que trabajas en una aplicación de calendario o en un sistema de programación de eventos. Necesitas asegurarte de que las fechas ingresadas sean válidas y calcular correctamente el número de días en cada mes, teniendo en cuenta los años bisiestos para febrero.

### Enunciado del Problema
Desarrolla un programa en Java que determine si un año es bisiesto y calcule el número de días en un mes dado para un año específico. El programa debe manejar entradas válidas e inválidas para los meses y años.

### Paso a Paso para Resolver el Problema

1. **Método para Verificar Año Bisiesto**:
    - Define un método llamado `esAnoBisiesto` que toma un año como parámetro y devuelve `true` si el año es bisiesto y `false` en caso contrario.
    - La lógica para determinar si un año es bisiesto sigue las reglas del calendario gregoriano: un año es bisiesto si es divisible por 400, o si es divisible por 4 pero no por 100.

2. **Método para Obtener los Días en un Mes**:
    - Define un método llamado `obtenerDiasEnMes` que toma un mes y un año como parámetros y devuelve el número de días en ese mes.
    - Utiliza un switch expression para retornar el número correcto de días según el mes.
    - Para febrero (mes 2), verifica si el año es bisiesto para determinar si tiene 28 o 29 días.

3. **Prueba de los Métodos**:
    - En el método `main`, invoca ambos métodos con diferentes valores para demostrar su funcionamiento y manejo de casos válidos e inválidos.

## Solución propuesta
El código de la clase `NumeroDeDiasEnMes` en Java es un ejemplo de cómo verificar si un año es bisiesto y calcular el número de días en un mes específico de un año determinado. A continuación, se explica cada parte del código en detalle.

### Estructura General del Código

```java
public class NumeroDeDiasEnMes {

    public static void main(String[] args) {
        System.out.println(esAnoBisiesto(-1600));
        System.out.println(esAnoBisiesto(1600));
        System.out.println(esAnoBisiesto(2017));
        System.out.println(esAnoBisiesto(2000));

        System.out.println(obtenerDiasEnMes(1, 2020));
        System.out.println(obtenerDiasEnMes(2, 2020));
        System.out.println(obtenerDiasEnMes(2, 2018));
        System.out.println(obtenerDiasEnMes(-1, 2020));
        System.out.println(obtenerDiasEnMes(1, -2020));
    }

    public static boolean esAnoBisiesto(int ano) {
        if (ano < 1 || ano > 9999) {
            return false;
        }
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }

    public static int obtenerDiasEnMes(int mes, int ano) {
        if ((mes < 1 || mes > 12) || (ano < 1 || ano > 9999)) {
            return -1;
        }

        boolean esBisiesto = esAnoBisiesto(ano);

        return switch (mes) {
            case 1 -> 31;
            case 2 -> esBisiesto ? 29 : 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> -1;
        };
    }
}
```

### Componentes del Código

1. **Método `main`**:
    - Este método es el punto de entrada del programa. Realiza varias llamadas a los métodos `esAnoBisiesto` y `obtenerDiasEnMes` para demostrar su funcionalidad.
    - Las pruebas incluyen años negativos, años bisiestos, años comunes y meses válidos e inválidos.

2. **Método `esAnoBisiesto`**:
    - **Parámetro de Entrada**: El método toma un parámetro `ano` de tipo `int`.
    - **Verificación de Año Válido**: Primero, verifica si el año está en el rango válido (1 a 9999). Si no es así, retorna `false`.
    - **Cálculo de Año Bisiesto**: Luego, determina si el año es bisiesto usando las reglas del calendario gregoriano:
        - Un año es bisiesto si es divisible por 400.
        - Un año es bisiesto si es divisible por 4 pero no por 100.
    - **Retorno**: Devuelve `true` si el año es bisiesto, de lo contrario `false`.

3. **Método `obtenerDiasEnMes`**:
    - **Parámetros de Entrada**: Este método toma dos parámetros: `mes` y `ano`, ambos de tipo `int`.
    - **Verificación de Mes y Año Válidos**: Primero, verifica si el mes está en el rango válido (1 a 12) y si el año está en el rango válido (1 a 9999). Si no es así, retorna `-1`.
    - **Verificación de Año Bisiesto**: Llama al método `esAnoBisiesto` para determinar si el año es bisiesto.
    - **Switch Expression para Días en el Mes**:
        - Utiliza un switch expression para determinar el número de días en el mes dado.
        - Para febrero (mes 2), utiliza un operador ternario (`? :`) para retornar 29 días si el año es bisiesto, de lo contrario 28 días.
        - Para otros meses, retorna el número correspondiente de días.
    - **Retorno**: Devuelve el número de días en el mes o `-1` si los parámetros de entrada son inválidos.

### Uso Práctico
Este programa es útil en aplicaciones de calendario, sistemas de programación de eventos, y cualquier otro contexto donde sea necesario validar fechas y calcular el número de días en un mes específico. La verificación de años bisiestos asegura que febrero se maneje correctamente, lo cual es crucial para la precisión del calendario.

### Conclusión
El programa `NumeroDeDiasEnMes` es un ejemplo de cómo implementar la lógica de validación de fechas y cálculos de días en Java. Utiliza switch expressions para simplificar la lógica y asegura que las entradas sean validadas adecuadamente antes de realizar los cálculos. Esto hace que el código sea robusto y fácil de mantener.