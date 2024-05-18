## Problema
Imagina que estás desarrollando un sistema de validación de números donde los números válidos deben compartir al menos el mismo último dígito. Este programa puede ser útil en sistemas de validación de datos, análisis de números o aplicaciones educativas que enseñan conceptos de programación y análisis numérico.

### Enunciado del Problema
Desarrolla un programa en Java que verifique si al menos dos de tres números enteros comparten el mismo último dígito. Los números deben estar en el rango de 10 a 1000, inclusive. Si algún número no está en este rango, el programa debe retornar `false`.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
   - Utiliza el método `main` para probar el método `tienenMismoUltimoDigito` con varios conjuntos de tres números.

2. **Definición del Método `esValido`**:
   - Verifica si un número está en el rango de 10 a 1000, inclusive. Si es así, retorna `true`; de lo contrario, retorna `false`.

3. **Definición del Método `tienenMismoUltimoDigito`**:
   - Verifica si cada uno de los tres números es válido usando el método `esValido`. Si alguno no es válido, retorna `false`.
   - Obtiene el último dígito de cada número usando el operador `%`.
   - Compara los últimos dígitos y retorna `true` si al menos dos de ellos son iguales; de lo contrario, retorna `false`.

### Solución propuesta

1. **Método `main`**:
   - Prueba el método `tienenMismoUltimoDigito` con varios conjuntos de tres números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `esValido`**:
   - **Verificación de Rango de Número**:
     ```java
     return (numero >= 10 && numero <= 1000);
     ```
     Este método verifica si un número está en el rango de 10 a 1000, inclusive.

3. **Método `tienenMismoUltimoDigito`**:
   - **Verificación de Números Válidos**:
     ```java
     if (!esValido(primerNumero) || !esValido(segundoNumero) || !esValido(tercerNumero)) {
         return false;
     }
     ```
     Verifica si cada uno de los tres números es válido usando el método `esValido`. Si alguno no es válido, retorna `false`.

   - **Obtención de los Últimos Dígitos**:
     ```java
     int ultimoDigitoPrimero = primerNumero % 10;
     int ultimoDigitoSegundo = segundoNumero % 10;
     int ultimoDigitoTercero = tercerNumero % 10;
     ```
     Obtiene el último dígito de cada número usando el operador `%`.

   - **Comparación de los Últimos Dígitos**:
     ```java
     return (ultimoDigitoPrimero == ultimoDigitoSegundo) ||
             (ultimoDigitoPrimero == ultimoDigitoTercero) ||
             (ultimoDigitoSegundo == ultimoDigitoTercero);
     ```
     Compara los últimos dígitos y retorna `true` si al menos dos de ellos son iguales; de lo contrario, retorna `false`.

### Conclusión

Este código es eficiente y claro, asegurando que se verifique correctamente si al menos dos de tres números comparten el mismo último dígito. La estructura del programa facilita su comprensión y mantenimiento.