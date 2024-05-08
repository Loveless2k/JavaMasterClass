# Problema
Imagina que estás trabajando en un software de diseño que necesita calcular áreas para diferentes formas geométricas, como círculos y rectángulos, basadas en medidas proporcionadas por el usuario.
Estas medidas deben ser verificadas para asegurar que son válidas antes de realizar los cálculos, ya que una medida negativa no tendría sentido en este contexto.

### Enunciado del Problema
Desarrolla un programa que calcule el área de círculos y rectángulos utilizando métodos sobrecargados.
El programa debe validar que las medidas proporcionadas sean positivas antes de realizar el cálculo, retornando un valor de error si no lo son.

### Paso a Paso para Resolver el Problema

1. **Definir dos métodos sobrecargados `calcularArea`:**
   - Uno para calcular el área de un círculo dado su radio.
   - Otro para calcular el área de un rectángulo dado sus dos lados.

2. **Validar las Entradas:**
   - Ambos métodos primero verifican que sus parámetros sean mayores o iguales a cero.
   - Si algún parámetro es negativo, el método retorna `-1.0` como indicador de error.

3. **Calcular el Área:**
   - Si los parámetros son válidos, el método para el círculo calcula el área usando la fórmula `PI * radio * radio`.
   - El método para el rectángulo calcula el área multiplicando los dos lados (`x * y`).

4. **Retornar el Resultado:**
   - Cada método retorna el valor calculado del área o `-1.0` si hubo un error en la entrada.

## Solución propuesta
A continuación - spoilers - discutiremos sobre la solución propuesta a este problema.
El programa `CalculadoraDeArea` en Java es un ejemplo de cómo utilizar la sobrecarga de métodos para proporcionar funcionalidades que permiten calcular el área de diferentes formas geométricas, específicamente círculos y rectángulos.
Es una herramienta útil para situaciones en las que se requiere calcular áreas en contextos como diseño gráfico, arquitectura, ingeniería, o en la educación.

### Descripción Detallada

**1. Método `main`:**
- Funciona como el punto de entrada del programa, donde se realizan llamadas de prueba a `calcularArea` con distintos valores para demostrar su funcionalidad y manejo de errores.

**2. Método `calcularArea` para círculos:**
- Acepta un parámetro `radio`.
- Realiza una verificación para asegurar que el radio no sea negativo. Si lo es, retorna `-1.0`, lo cual es un indicativo de error.
- Si el radio es válido, calcula el área del círculo usando la fórmula `PI * radio * radio` y retorna el resultado.

**3. Método `calcularArea` para rectángulos:**
- Acepta dos parámetros, `x` (ancho) y `y` (alto).
- Verifica que ninguna de las dimensiones sea negativa. Si alguna dimensión es negativa, retorna `-1.0` como indicativo de error.
- Si ambas dimensiones son válidas, calcula el área del rectángulo como el producto de `x` y `y` y retorna el resultado.

### Funcionalidad del Programa
Este programa es eficaz para calcular áreas rápidamente, con verificaciones integradas para manejar entradas inválidas.
Es especialmente útil en ambientes educativos para enseñar conceptos básicos de geometría, o en aplicaciones profesionales donde tales cálculos son necesarios regularmente.

### Buenas Prácticas y Consideraciones

- **Validación de Entradas**: Este programa ilustra bien cómo manejar errores de entrada comunes como números negativos.
- **Sobrecarga de Métodos**: Muestra cómo se pueden usar métodos sobrecargados para realizar tareas similares (cálculos de área) para diferentes formas, mejorando así la organización y legibilidad del código.
- **Documentación**: Aunque el código es bastante legible, siempre es una buena práctica agregar comentarios explicativos y documentación para describir lo que hace cada método y cómo se deben proporcionar las entradas.

En conclusión, `CalculadoraDeArea` proporciona un ejemplo claro de cómo implementar y organizar funcionalidades matemáticas básicas en un programa, haciendo uso efectivo de la sobrecarga de métodos para ofrecer una interfaz simple y directa para el usuario.
