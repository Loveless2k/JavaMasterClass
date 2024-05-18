## Problema
Imagina que estás desarrollando una aplicación para verificar la validez de números de identificación que deben compartir al menos un dígito para ser considerados válidos. Este programa podría ser útil en sistemas de validación de datos, análisis de números, o aplicaciones educativas que enseñan conceptos de programación y análisis numérico.

### Enunciado del Problema
Desarrolla un programa en Java que verifique si dos números de dos dígitos tienen al menos un dígito en común. Si alguno de los números no es de dos dígitos, el programa debe retornar `false`.

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
   - Utiliza el método `main` para probar el método `tieneDigitoCompartido` con varios pares de números.

2. **Definición del Método `tieneDigitoCompartido`**:
   - Verifica si alguno de los números no es de dos dígitos. Si es así, retorna `false`.
   - Conserva el valor original de `segundoNumero` para restablecerlo después de cada iteración del primer bucle.
   - Usa un bucle `while` para iterar a través de los dígitos del `primerNumero`:
      - Obtén el último dígito de `primerNumero` usando el operador `%`.
      - Restablece `segundoNumero` a su valor original.
      - Usa un bucle `while` interno para iterar a través de los dígitos de `segundoNumero`:
         - Obtén el último dígito de `segundoNumero` usando el operador `%`.
         - Verifica si los dígitos actuales de `primerNumero` y `segundoNumero` son iguales. Si es así, retorna `true`.
         - Elimina el último dígito de `segundoNumero` usando el operador `/`.
      - Elimina el último dígito de `primerNumero` usando el operador `/`.
   - Si no se encuentra ningún dígito compartido, retorna `false`.

### Solución propuesta

1. **Método `main`**:
   - Prueba el método `tieneDigitoCompartido` con varios pares de números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `tieneDigitoCompartido`**:
   - **Verificación de Números de Dos Dígitos**:
     ```java
     if ((primerNumero > 99 || primerNumero < 10) ||
             segundoNumero > 99 || segundoNumero < 10) {
         return false;
     }
     ```
     Verifica si alguno de los números no es de dos dígitos. Si es así, retorna `false`.

   - **Inicialización y Bucle `while` Externo**:
     ```java
     int segundoNumeroOriginal = segundoNumero;

     while (primerNumero > 0) {
         int digitoActualPrimerNumero = primerNumero % 10;
         segundoNumero = segundoNumeroOriginal;
     ```
     Conserva el valor original de `segundoNumero` y usa un bucle `while` para iterar a través de los dígitos de `primerNumero`.

   - **Bucle `while` Interno**:
     ```java
     while (segundoNumero > 0) {
         int digitoActualSegundoNumero = segundoNumero % 10;
         if (digitoActualPrimerNumero == digitoActualSegundoNumero) {
             return true;
         }
         segundoNumero /= 10;
     }
     primerNumero /= 10;
     ```
     Usa un bucle `while` interno para iterar a través de los dígitos de `segundoNumero`. Verifica si los dígitos actuales de `primerNumero` y `segundoNumero` son iguales. Si es así, retorna `true`.

   - **Retorno `false` si No se Encuentra un Dígito Compartido**:
     ```java
     return false;
     ```
     Si no se encuentra ningún dígito compartido después de iterar a través de todos los dígitos, retorna `false`.

### Conclusión

Este código es eficiente y claro, asegurando que se verifique correctamente si dos números de dos dígitos tienen al menos un dígito en común. La estructura del programa facilita su comprensión y mantenimiento.