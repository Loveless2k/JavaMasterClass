# Problema
Imagina que estás trabajando en un proyecto que requiere el seguimiento del tiempo en un formato extenso, como podría ser el registro del tiempo total de operación de una máquina o el tiempo de servicio de un empleado expresado en minutos,
y necesitas convertir ese tiempo a un formato más comprensible en términos de años y días.

### Enunciado del Problema
Desarrolla un programa que convierta una cantidad de minutos en años y días.
Este programa debe validar que los minutos sean positivos y luego realizar la conversión adecuada para presentar cuántos años completos y días restantes representan esos minutos.

### Paso a Paso para Resolver el Problema

1. **Validar la entrada:**
   - Verifica que el número de minutos proporcionado sea mayor o igual a cero. Si no lo es, imprime un mensaje de error y termina la ejecución del método.

2. **Realizar cálculos:**
   - Convertir los minutos a horas dividiendo por 60.
   - Convertir las horas a días dividiendo por 24.
   - Convertir los días a años dividiendo por 365.
   - Calcular los días restantes usando el operador de módulo con 365 para obtener el remanente después de extraer los años completos.

3. **Imprimir el resultado:**
   - Formatea y muestra el resultado en el formato deseado, mostrando los años y los días restantes calculados.

### Breve Descripción del Ejercicio
Este programa, `CalculadoraDeMinutosAnhiosYDias`, convierte minutos a años y días, proporcionando una manera simple y efectiva de entender grandes lapsos de tiempo expresados inicialmente en minutos.
Ideal para aplicaciones de gestión de tiempo o historiales de servicio.

## Solución propuesta
El programa `CalculadoraDeMinutosAYearsDias` en Java es una herramienta diseñada para convertir una cantidad de minutos en un formato más comprensible y convencional, expresado en años y días.
Este tipo de funcionalidad es útil en diversos contextos donde se requiere representar el tiempo de forma extensa y más intuitiva, como en el seguimiento de la duración de proyectos, el tiempo de servicio de empleados, o el funcionamiento de equipos.

### Descripción de Componentes

**1. Método `main`:**
- Funciona como el punto de entrada del programa, donde se hacen llamadas al método `imprimirAnhiosYDias` con diferentes valores de entrada para demostrar la funcionalidad de la conversión de minutos a años y días.

**2. Método `imprimirAñosYDias`:**
- **Parámetro:** Acepta un parámetro `minutos` de tipo `long`, que representa la cantidad de minutos a convertir.
- **Validación:** Verifica que la cantidad de minutos no sea negativa. Si es negativa, imprime "Valor inválido" y termina la ejecución prematuramente.
- **Cálculos:**
   - **Conversión a horas:** Divide los minutos por 60 para obtener el total de horas.
   - **Conversión a días:** Divide las horas totales por 24 para determinar la cantidad de días.
   - **Conversión a años:** Divide los días por 365 para encontrar el número de años completos.
   - **Días restantes:** Usa el operador de módulo (`%`) con 365 para calcular los días que sobran después de contabilizar los años completos.
- **Salida:** Imprime el resultado en el formato "minutos min = años a y días d", proporcionando una representación clara y directa del tiempo en términos más largos.

### Funcionalidad del Programa
Este programa es especialmente valioso para contextos en los que se necesita una perspectiva a largo plazo del tiempo, como en la gestión de recursos humanos para calcular el tiempo de servicio de los empleados,
o en mantenimiento de equipos para monitorear períodos prolongados de actividad. Convertir minutos a años y días hace que estas medidas sean más accesibles y fáciles de entender para la toma de decisiones y evaluaciones.

### Buenas Prácticas y Consideraciones

- **Validación de entrada:** Es crucial para evitar cálculos incorrectos y garantizar que el programa maneje solo datos válidos.
- **Uso de tipos de datos adecuados:** El uso de `long` para las variables asegura que el programa pueda manejar grandes cantidades de minutos sin problemas de desbordamiento.
- **Claridad en la salida:** La salida es clara y directa, facilitando la comprensión inmediata de los resultados por parte de los usuarios.

En conclusión, `CalculadoraDeMinutosAnhiosYDias` demuestra una implementación eficaz y práctica de métodos para convertir y presentar el tiempo en formatos más grandes y manejables, proporcionando herramientas útiles para la gestión efectiva del tiempo en diversas aplicaciones.
