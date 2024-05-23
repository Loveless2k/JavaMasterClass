## Problema
Imagina que estás desarrollando una aplicación que necesita convertir números en su representación en palabras, por ejemplo, en una aplicación bancaria que convierte montos en letras para cheques, o en una aplicación educativa para enseñar conceptos matemáticos. Este programa es útil para convertir cualquier número entero positivo en palabras.

### Enunciado del Problema
Desarrolla un programa en Java que convierta un número entero positivo en su representación en palabras. Si el número es negativo, el programa debe imprimir "Valor inválido".

### Paso a Paso para Resolver el Problema

1. **Inicialización del Método Principal**:
   - Utiliza el método `main` para probar los métodos `obtenerCuentaDigitos`, `reverso` y `numeroAPalabras` con varios números.

2. **Definición del Método `obtenerCuentaDigitos`**:
   - Verifica si el número es negativo. Si es así, retorna -1.
   - Si el número es 0, retorna 1.
   - Usa un bucle `while` para contar los dígitos del número.

3. **Definición del Método `reverso`**:
   - Inicializa una variable `numeroReverso` a 0 para almacenar el número invertido.
   - Usa un bucle `while` para invertir el número.

4. **Definición del Método `numeroAPalabras`**:
   - Verifica si el número es negativo. Si es así, imprime "Valor inválido".
   - Si el número es 0, imprime "CERO".
   - Invierte el número usando el método `reverso`.
   - Usa un bucle `while` para convertir cada dígito del número invertido en su representación en palabras.
   - Usa un bucle `for` para agregar ceros necesarios al final de la conversión si el número original tiene más dígitos que el número invertido.

### Solución propuesta

1. **Método `main`**:
   - Prueba los métodos `obtenerCuentaDigitos`, `reverso` y `numeroAPalabras` con varios números para asegurar que el programa funcione correctamente con diferentes entradas.

2. **Método `obtenerCuentaDigitos`**:
   - **Verificación de Número Válido**:
     ```java
     if (numero < 0) {
         return -1;
     }
     ```
     Verifica si el número es negativo. Si es así, retorna -1.

   - **Conteo de Dígitos**:
     ```java
     if (numero == 0) {
         return 1;
     }

     int cuentaDigitos = 0;
     while (numero != 0) {
         cuentaDigitos++;
         numero /= 10;
     }

     return cuentaDigitos;
     ```
     Si el número es 0, retorna 1. Usa un bucle `while` para contar los dígitos del número.

3. **Método `reverso`**:
   - **Inversión del Número**:
     ```java
     int numeroReverso = 0;
     while (numero != 0) {
         int digito = numero % 10;
         numeroReverso = numeroReverso * 10 + digito;
         numero /= 10;
     }

     return numeroReverso;
     ```
     Inicializa `numeroReverso` a 0 y usa un bucle `while` para invertir el número.

4. **Método `numeroAPalabras`**:
   - **Verificación de Número Válido y Cero**:
     ```java
     if (numero < 0) {
         System.out.println("Valor inválido");
     } else if (numero == 0) {
         System.out.println("CERO");
     } else {
         ...
     }
     ```
     Verifica si el número es negativo o cero. Si es negativo, imprime "Valor inválido". Si es cero, imprime "CERO".

   - **Inversión del Número y Conversión a Palabras**:
     ```java
     int numeroReverso = reverso(numero);
     int cuentaDigitosOriginal = obtenerCuentaDigitos(numero);
     int cuentaDigitosReverso = obtenerCuentaDigitos(numeroReverso);

     while (numeroReverso != 0) {
         int digito = numeroReverso % 10;
         switch (digito) {
             case 0 -> System.out.print("Cero ");
             case 1 -> System.out.print("Uno ");
             case 2 -> System.out.print("Dos ");
             case 3 -> System.out.print("Tres ");
             case 4 -> System.out.print("Cuatro ");
             case 5 -> System.out.print("Cinco ");
             case 6 -> System.out.print("Seis ");
             case 7 -> System.out.print("Siete ");
             case 8 -> System.out.print("Ocho ");
             case 9 -> System.out.print("Nueve ");
         }
         numeroReverso /= 10;
     }

     for (int i = 0; i < cuentaDigitosOriginal - cuentaDigitosReverso; i++) {
         System.out.print("Cero ");
     }
     ```
     Invierte el número usando el método `reverso` y obtiene la cuenta de dígitos del número original y del número invertido. Usa un bucle `while` para convertir cada dígito del número invertido en su representación en palabras. Si el número original tiene más dígitos que el número invertido, usa un bucle `for` para agregar ceros necesarios al final de la conversión.

### Conclusión

Este código es eficiente y claro, asegurando que se conviertan correctamente los números enteros positivos en su representación en palabras y manejando adecuadamente las entradas inválidas. La estructura del programa facilita su comprensión y mantenimiento.