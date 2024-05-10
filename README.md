# Yield
El uso de `yield` en un switch mejorado (switch expression) en Java es una característica que permite devolver un valor de un bloque de código dentro de un `case` del `switch`. Esta capacidad se introdujo en Java 13 como parte de las switch expressions para facilitar operaciones más complejas dentro de cada caso del `switch`, que no se limitan a una simple expresión tras la flecha (`->`).

### Cómo Funciona el `yield` en un Switch Mejorado
El `yield` permite que un bloque de código asociado a un caso específico del `switch` termine con una instrucción que devuelve un valor al switch expression. Es útil cuando el código dentro de un `case` es demasiado complejo para ser expresado en una única expresión tras una flecha (`->`).

### Ejemplo de Uso de `yield`

```java
String mes = "OCTUBRE";
int numeroDias = switch (mes) {
    case "ENERO", "MARZO", "MAYO", "JULIO", "AGOSTO", "OCTUBRE", "DICIEMBRE" -> 31;
    case "ABRIL", "JUNIO", "SEPTIEMBRE", "NOVIEMBRE" -> 30;
    case "FEBRERO" -> {
        // Código más complejo podría ir aquí
        int year = 2024; // Año bisiesto para ejemplo
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            yield 29;
        else
            yield 28;
    }
    default -> throw new IllegalStateException("Mes inválido: " + mes);
};
System.out.println("Número de días en " + mes + ": " + numeroDias);
```

### Recomendaciones y Buenas Prácticas

1. **Limitar la Complejidad**: Aunque `yield` permite incorporar bloques de código complejos dentro de un `switch`, es recomendable mantener la complejidad al mínimo para preservar la legibilidad y la mantenibilidad del código.

2. **Evitar el Uso Excesivo**: Usar `yield` solo cuando sea estrictamente necesario. Si el código dentro del `case` puede ser expresado como una simple expresión, es preferible usar la forma con flecha (`->`) directamente.

3. **Documentación**: Cuando se use `yield`, especialmente en contextos complejos, asegurarse de documentar claramente el propósito y funcionamiento del código para que otros desarrolladores puedan entenderlo fácilmente.

4. **Manejo de Errores**: Considerar el manejo adecuado de errores y estados inesperados dentro de los bloques de código del `switch`. El uso de `default` para lanzar excepciones en casos no esperados es una buena práctica. Ya veremos qué son las excepciones y cómo utilizarlas, más adelante.

5. **Consistencia**: Ser consistente en el uso de `yield` dentro de un proyecto. Si se decide usar `yield` en los switch expressions, tratar de seguir este patrón en todos los casos similares para mantener la coherencia en el estilo de codificación del proyecto.

### Conclusión
`yield` es una herramienta poderosa dentro de las switch expressions que ofrece Java, proporcionando la flexibilidad de ejecutar bloques de código más complejos y devolver un valor específico para cada caso. Su uso adecuado puede simplificar significativamente ciertos tipos de lógica que de otra manera requerirían múltiples estructuras de control o variables temporales adicionales. Sin embargo, es importante usar esta característica con cuidado para mantener el código limpio y comprensible.

### Desafío
Toma el código del ejercicio anterior y modifícalo. Solo deja la implementación del `switch` mejorado, pero esta vez, que incluya `yield` como parte del diseño de la solución.

## Solución propuesta
El código en la clase `CalculadorDeTrimestre` utiliza la funcionalidad de switch expression en Java para determinar a qué trimestre del año pertenece un mes dado. Este código es un ejemplo avanzado que también maneja entradas incorrectas o atípicas mediante el uso de `yield` en el bloque `default`. Vamos a analizar en detalle cada parte del código:

### Estructura y Componentes del Código

1. **Declaración de Constantes**
   Las constantes para cada mes del año están definidas, lo que facilita la administración del código y evita errores comunes de escritura. Cada constante representa un mes del año, asegurando que las cadenas de texto utilizadas en los casos del `switch` sean consistentes y correctas.

2. **Método `main`**
   Este método prueba la funcionalidad del switch expression mostrando el trimestre correspondiente a varios nombres de meses. Se manejan diferentes formatos de entrada (mayúsculas, minúsculas, y entrada incorrecta) para demostrar la robustez del método `obtenerTrimestreMejorado`.

3. **Método `obtenerTrimestreMejorado`**
   Este método utiliza un switch expression para determinar el trimestre correspondiente basándose en el nombre del mes proporcionado. La llamada a `mes.toUpperCase()` garantiza que la comparación de cadenas sea insensible a mayúsculas o minúsculas. Aquí se detallan los casos:

    - **Casos para cada trimestre**: Los meses están agrupados por trimestre. Cada grupo de meses retorna un string que indica el trimestre correspondiente:
        - `ENE, FEB, MAR -> "1er trimestre"`
        - `ABR, MAY, JUN -> "2do trimestre"`
        - `JUL, AGO, SEP -> "3er trimestre"`
        - `OCT, NOV, DIC -> "4to trimestre"`

    - **Manejo de Entradas Incorrectas**: El caso `default` utiliza `yield` dentro de un bloque para retornar un mensaje de error personalizado. Esto es particularmente útil para manejar casos donde el mes no coincide con ninguno de los valores esperados. En lugar de simplemente retornar una cadena, el bloque permite ejecutar múltiples instrucciones antes de `yield` el resultado, lo que es ideal para logging o para establecer mensajes de error más específicos.

      ```java
      default -> {
          String errorMessage = "El input dado '" + mes + "' es incorrecto.";
          yield errorMessage;
      }
      ```

### Buenas Prácticas y Consideraciones

- **Uso de `toUpperCase()`**: Esta llamada es crucial para asegurar que la comparación de strings no sea sensible al caso, permitiendo que `JANUARY`, `january`, `January`, etc., sean tratados de la misma manera.

- **Implementación de `yield`**: Aunque `yield` es útil para casos complejos dentro de un switch expression, debe utilizarse con cautela para no complicar excesivamente la lógica dentro de un `switch`. En este ejemplo, es usado apropiadamente para generar un mensaje de error personalizado.

- **Manejo de errores**: El uso de `yield` en el caso `default` para manejar entradas incorrectas es un ejemplo excelente de cómo proporcionar feedback útil al usuario o al sistema que está haciendo la llamada, lo que mejora la robustez y la mantenibilidad del código.

### Conclusión

Este código demuestra una aplicación práctica y avanzada de las switch expressions en Java, destacando cómo pueden utilizarse para simplificar significativamente el manejo de múltiples condiciones y cómo se pueden integrar prácticas de manejo de errores avanzadas dentro de estructuras de control condicional.