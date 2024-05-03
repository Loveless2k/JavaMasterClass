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
De aquí en adelante, - spoilers -, discutiremos al respecto de la solución planteada.
La solución proporcionada, contenida en la clase `DesafioOperador`, realiza una serie de operaciones aritméticas y lógicas para determinar si un total calculado es un múltiplo exacto de 40. 
Aquí está el desglose de cada paso:

### Inicialización de Variables de Precios:
  - `primerValor`: Se inicializa con 20.00, simulando el costo del primer artículo.
  - `segundoValor`: Se inicializa con 80.00, representando el costo del segundo artículo.
    
### Cálculo del Total:
  - `tercerValor`: Se calcula como la suma de `primerValor` y `segundoValor`, y el resultado se multiplica por 100. Esto podría representar, por ejemplo, un ajuste de puntos o una promoción donde se amplifica el total gastado para aplicar a algún beneficio.
    
### Cálculo del Resto:
  - `resto`: Se obtiene al aplicar el operador de módulo (%) al `tercerValor` usando 40.00 como divisor. El resultado indica si hay algún resto después de dividir el total entre 40.

### Evaluación de si hay Resto:
  - `sinResto`: Es una variable booleana que será `true` si resto es igual a 0.00, lo que indicaría que `tercerValor` es un múltiplo exacto de 40, y `false` si hay algún resto.

### Impresión de Resultados:
  - Se imprime el `tercerValor`, que es el total después de la promoción.
  - Se imprime el `resto` para mostrar el resto de la división.
  - Se imprime el valor de `sinResto` para indicar si se cumple la condición de no tener resto.

### Condicional para Mensaje Final:
Se usa una estructura `if` con la negación de `sinResto (!sinResto)` como condición para determinar si se debe imprimir un mensaje. 
Si `sinResto` es `false` (lo que significa que hay un resto), entonces se imprime el mensaje "Quedó algún resto". Este mensaje podría simbolizar una notificación al cliente sobre la ineligibilidad para el beneficio de la promoción.
En resumen, el programa imita un escenario de una tienda donde se calcula si se cumple con una promoción específica basada en el total de la compra. 

Como habrás podido observar, en este desafío hemos incluído un nuevo elemento, el condicional. 
En la próxima clase explicaremos cómo opera esta nueva incorporación en detalle.
