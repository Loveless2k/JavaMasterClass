### Sobrecarga de Métodos
Como bien se mencionó la clase pasada, la sobrecarga de métodos es una característica de la programación orientada a objetos que permite a una clase tener varios métodos
con el mismo nombre, pero diferentes firmas. La firma de un método incluye el número de parámetros, el tipo de parámetros y el orden de los parámetros.

#### Ejemplos de Sobrecarga de Métodos
Considera una clase que necesita métodos para sumar números, pero los números pueden ser enteros, flotantes, o una combinación de ambos:

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double sumar(int a, double b) {
        return a + b;
    }

    public double sumar(double a, int b) {
        return a + b;
    }
}
```

#### Consideraciones y Buenas Prácticas

1. **Claridad**: Asegúrate de que la sobrecarga no complica la comprensión del código.
   Los métodos sobrecargados deben realizar acciones similares para no confundir al usuario del código.
3. **Consistencia**: Mantén una consistencia lógica en el orden de los parámetros. Por ejemplo, si tienes un método que acepta `(int, double)`,
   el método sobrecargado debería aceptar `(double, int)` y no `(int, double, otroTipo)`.
5. **Uso de varargs**: Cuidado con la sobrecarga de métodos que usan varargs (`...`), ya que pueden causar ambigüedad con llamadas a métodos que aceptan
   una matriz de tipos similares.
7. **Documentación**: Documenta claramente todos los métodos sobrecargados. Especifica claramente qué hace cada versión del método sobrecargado.

### `String.format`
`String.format` es un método en Java que permite formatear cadenas de manera similar a `printf` en C.
Utiliza una cadena de formato con especificadores de formato que incluyen marcadores de posición para los valores que se pasan como argumentos adicionales.

#### Para Qué Sirve y Cómo se Utiliza
`String.format` es útil para construir cadenas que necesitan contener valores variables en un formato específico.
Es ampliamente utilizado para crear cadenas con formato numérico, fechas, o alinear el texto de manera precisa.

#### Ejemplos

```java
String nombre = "Alice";
int edad = 30;
String mensaje = String.format("Hola, mi nombre es %s y tengo %d años.", nombre, edad);
System.out.println(mensaje);  // "Hola, mi nombre es Alice y tengo 30 años."

double precio = 19.99;
String infoProducto = String.format("El precio es: $%.2f", precio);
System.out.println(infoProducto);  // "El precio es: $19.99"
```

#### Sugerencias y Buenas Prácticas

1. **Consistencia**: Utiliza los mismos tipos de especificadores de formato para el mismo tipo de datos en todo tu código para mantener la consistencia.
2. **Precisión**: Especifica la precisión para los tipos flotantes cuando sea necesario para evitar impresiones de muchos decimales.
3. **Seguridad**: Asegúrate de que el número de especificadores de formato en la cadena de formato coincida con el número y tipo de argumentos pasados
   para evitar `IllegalFormatException`.
5. **Localización**: Usa `Formatter` o recursos de localización si necesitas formatear cadenas que son sensibles a la configuración regional, especialmente para fechas y monedas.

En resumen, la sobrecarga de métodos y `String.format` son herramientas poderosas en Java que, cuando se utilizan correctamente, pueden hacer que el código sea más flexible,
reutilizable y fácil de leer. Sin embargo, requieren un uso cuidadoso para evitar complicaciones y garantizar la claridad del código.

De cualquier modo, veremos String.format y otras maneras de formatear cadenas más adelante a medida que avancemos en el curso, pero esta es una buena introducción
a esta herramienta.

# Problema
Imagina que estás desarrollando una aplicación para un evento deportivo donde necesitas mostrar los tiempos de los participantes en un formato estandarizado de horas,
minutos y segundos, basado en la duración total de su participación, que se registra en segundos o en minutos y segundos.

### Enunciado del Problema
Desarrolla un programa que convierte el tiempo en segundos o en combinación de minutos y segundos a un formato de cadena que representa horas, minutos y segundos.

### Paso a Paso para Resolver el Problema

1. **Definir dos métodos sobrecargados para convertir el tiempo**:
    - Un método que acepta segundos y lo convierte a horas, minutos y segundos.
    - Un segundo método que acepta minutos y segundos y realiza la misma conversión.

2. **Validación de Entradas**:
    - Comprobar que los segundos y minutos son no negativos y que los segundos no superan los 59.

3. **Cálculo del Tiempo**:
    - Convertir los segundos totales a minutos y segundos, o calcular las horas a partir de los minutos y ajustar los minutos y segundos respectivamente.

4. **Formateo del Resultado**:
    - Devolver el tiempo formateado como una cadena en el formato "HH mm ss", usando `String.format` para asegurar un formato consistente con ceros a la izquierda si es necesario.

## Solución propuesta
De ahora en más, - spoilers - Vamos a discutir sobre la solución propuesta a este problema.
El código del programa `ConvertidorDeTiempo` en Java es un ejemplo de cómo utilizar métodos sobrecargados para convertir tiempo expresado en segundos,
o una combinación de minutos y segundos, a un formato más legible de horas, minutos y segundos.
Esta funcionalidad es especialmente útil en contextos donde se necesita representar duraciones o tiempos de manera clara y precisa,
como en cronómetros de eventos deportivos, registros de tiempo de proyectos, o cualquier sistema que requiera seguimiento de tiempo.

### Descripción de Componentes

**1. Método `main`:**
- Actúa como el punto de entrada del programa, donde se realizan llamadas de prueba al método `obtenerDuracionEnFormato` con diferentes valores para ilustrar su utilidad.

**2. Método `obtenerDuracionEnFormato` (primera sobrecarga):**
- Acepta un solo parámetro de `segundos`. Primero, verifica que los segundos no sean negativos.
- Luego, calcula cuántos minutos y segundos restantes hay en el total de segundos proporcionados.
- Hace una llamada al segundo método sobrecargado, pasando los minutos y segundos calculados, para obtener el tiempo formateado.

**3. Método `obtenerDuracionEnFormato` (segunda sobrecarga):**
- Acepta dos parámetros: `minutos` y `segundos`.
- Realiza validaciones para asegurar que los minutos no sean negativos y que los segundos estén dentro del rango permitido (0-59).
- Calcula cuántas horas hay en los minutos dados, y cuántos minutos restan después de extraer las horas.
- Utiliza `String.format` para formatear el resultado en un formato de "HH mm ss", donde cada unidad de tiempo se muestra con dos dígitos,
  agregando ceros a la izquierda si es necesario.

### Funcionalidad del Programa
El programa es útil para cualquier aplicación que necesite mostrar duraciones en un formato estándar y fácilmente comprensible.
La sobrecarga de métodos permite que se pueda llamar al método `obtenerDuracionEnFormato` con diferentes tipos de argumentos,
lo que aumenta la flexibilidad y la reutilización del código.

### Consideraciones de Implementación
- El uso de `String.format` en este contexto es esencial para asegurar que el tiempo esté siempre en un formato uniforme y profesional,
  lo que es especialmente importante en interfaces de usuario donde la presentación del tiempo debe ser clara y consistente.
- Las validaciones de entrada garantizan que el programa se comporte de manera predecible y robusta incluso con entradas inesperadas o incorrectas.
