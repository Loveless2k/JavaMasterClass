## Problema
Imagina que estás desarrollando un software para un juego de matemáticas donde los estudiantes deben encontrar números que son múltiplos de 3 y 5 dentro de un rango específico. Este programa ayuda a automatizar la verificación y suma de estos números.

### Enunciado del Problema
Desarrolla un programa en Java que encuentre y sume los primeros cinco números que sean múltiplos de 3 y 5 dentro del rango de 15 a 1000. El programa debe imprimir cada número que coincida y la suma total de estos números.

### Paso a Paso para Resolver el Problema

1. **Inicialización de Variables**:
   - Declara e inicializa `contadorDeCoincidencias` a 0 para contar las coincidencias.
   - Declara e inicializa `sumaDeCoincidencias` a 0 para almacenar la suma de los números que coinciden.

2. **Bucle `for` para Iterar sobre el Rango**:
   - Usa un bucle `for` para iterar desde 15 hasta 1000.

3. **Verificación de Múltiplos de 3 y 5**:
   - Dentro del bucle, usa una condición `if` para verificar si el número actual es múltiplo de 3 y 5.

4. **Actualización de Contador y Suma**:
   - Si la condición es verdadera, imprime el número, incrementa el `contadorDeCoincidencias` y agrega el número a `sumaDeCoincidencias`.

5. **Terminación del Bucle**:
   - Si se han encontrado 5 coincidencias, usa `break` para salir del bucle.

6. **Impresión del Resultado Final**:
   - Después del bucle, imprime la suma total de las coincidencias.

### Solución propuesta

1. **Método `main`**:
   - **Declaración de Variables**:
     ```java
     int contadorDeCoincidencias = 0;
     int sumaDeCoincidencias = 0;
     ```
     Se declaran e inicializan las variables `contadorDeCoincidencias` y `sumaDeCoincidencias` a 0.

   - **Bucle `for` para Iterar sobre el Rango**:
     ```java
     for (int numero = 15; numero <= 1000; numero++) {
     ```
     Este bucle itera sobre los números del 15 al 1000.

   - **Verificación de Múltiplos de 3 y 5**:
     ```java
     if (numero % 3 == 0 && numero % 5 == 0) {
         System.out.println("Encontrada una coincidencia: " + numero);
         sumaDeCoincidencias += numero;
         contadorDeCoincidencias++;
     ```
     Dentro del bucle, se verifica si el número es múltiplo de 3 y 5. Si es así, se imprime el número, se suma a `sumaDeCoincidencias` y se incrementa `contadorDeCoincidencias`.

   - **Terminación del Bucle**:
     ```java
     if (contadorDeCoincidencias == 5) {
         break;
     }
     ```
     Si se han encontrado 5 coincidencias, se utiliza `break` para salir del bucle.

   - **Impresión del Resultado Final**:
     ```java
     System.out.println("Suma de las coincidencias: " + sumaDeCoincidencias);
     ```
     Después del bucle, se imprime la suma total de las coincidencias.

Este código es eficiente y claro, asegurando que se encuentre y sume exactamente cinco números múltiplos de 3 y 5 dentro del rango especificado.