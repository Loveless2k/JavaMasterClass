# Desafío de operadores
Imagina que estás en una tienda y compras dos artículos que cuestan 20.00 y 80.00 respectivamente. 
La tienda tiene una promoción que te ofrece un descuento en tu próxima compra si el total gastado hoy (multiplicado por 100) no deja ningún resto al dividirse entre 40. 
El programa determina si calificas para el descuento.

## Enunciado del Problema
Dado dos cantidades monetarias, calcula el total al multiplicarlo por 100 y determina si ese total es un múltiplo exacto de 40. 
Si no lo es, imprime un mensaje indicando que hay un resto.

## Paso a Paso para Resolver el Problema
  1. Inicializa dos variables con los precios de los artículos.
  2. Suma los precios y multiplica el resultado por 100 para ajustarlo a la promoción.
  3. Calcula el resto de la división de ese total entre 40.
  4. Declara una variable booleana para saber si el resto es cero.
  5. Imprime el resultado del cálculo booleano.
  6. Usa una condicional para imprimir un mensaje si hay un resto.

## Solución planteada
El código en la clase `DesafioOperador` realiza una serie de operaciones aritméticas con dos valores iniciales, y posteriormente evalúa si el resultado de una operación específica (el módulo) es cero, para finalmente imprimir un mensaje en base al resultado de esta evaluación. A continuación se explica cada parte del código:

### Declaración de Variables
```java
double primerValor = 20.00d;
double segundoValor = 80.00d;
```
Aquí se declaran e inicializan dos variables de tipo `double`, `primerValor` y `segundoValor`, con los valores `20.00` y `80.00` respectivamente. El sufijo `d` es opcional pero ayuda a clarificar que los números son de tipo `double`.

### Operación Aritmética Compuesta
```java
double tercerValor = (primerValor + segundoValor) * 100.00d;
System.out.println("TercerValor = " + tercerValor);
```
En esta línea, se suman `primerValor` y `segundoValor`, y el resultado se multiplica por `100.00`. Esto es, `(20.00 + 80.00) * 100.00`, que resulta en `10000.00`. Luego, este resultado se almacena en la variable `tercerValor` y se imprime.

### Cálculo del Resto
```java
double resto = tercerValor % 40.00d;
System.out.println("Resto = " + resto);
```
Se calcula el resto de la división de `tercerValor` por `40.00`. Dado que `10000.00 % 40.00` es `0.00`, el resultado almacenado y posteriormente impreso por `resto` es `0.00`.

### Evaluación Booleana
```java
boolean sinResto = (resto == 0.00d);
System.out.println("sinResto = " + sinResto);
```
Se evalúa si `resto` es exactamente `0.00`. Si es así, la variable booleana `sinResto` se establece en `true`. Se imprime el valor de `sinResto`, que en este caso sería `true`.

### Condicional para Impresión de Resultado
```java
if (!sinResto){
    System.out.println("Quedó algún resto");
}
```
Este bloque condicional verifica si `sinResto` es `false` utilizando el operador de negación `!`. Si `sinResto` fuera `false`, se imprimiría el mensaje `"Quedó algún resto"`. Dado que `sinResto` es `true`, este mensaje no se imprime.

### Conclusión
Este programa ilustra cómo realizar y combinar operaciones matemáticas básicas en Java, cómo manejar resultados booleanos basados en comparaciones, y cómo usar condicionales para controlar el flujo del programa basándose en resultados de operaciones aritméticas. El uso de este tipo de operaciones es común en muchas aplicaciones que requieren cálculos precisos y toma de decisiones basada en esos cálculos.