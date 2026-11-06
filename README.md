# MundoAnimal 🐾

## Descripción del proyecto

MundoAnimal es una aplicación desarrollada en Java como parte de una actividad individual de Generation México.

Su objetivo es aplicar los conceptos de programación orientada a objetos (POO): herencia, encapsulamiento, clases abstractas, sobrescritura de métodos, polimorfismo e interfaces.

El programa muestra el nombre, la edad, el sonido y la forma de desplazarse de diferentes animales.

## Tecnologías utilizadas

- Java (JDK 23)
- IntelliJ IDEA
- Git y GitHub

## Estructura del proyecto

```text
MundoAnimal/
├── src/
│   └── mx/com/animales/
│       ├── Animal.java
│       ├── Perro.java
│       ├── Gato.java
│       ├── Vaca.java
│       ├── Caballo.java
│       ├── Movible.java
│       └── Main.java
├── .gitignore
└── README.md
```

## Funcionamiento

La clase abstracta `Animal` contiene los atributos privados `nombre` y `edad`, un constructor, el método `mostrarInformacion()` y el método abstracto `hacerSonido()`.

Las clases `Perro`, `Gato`, `Vaca` y `Caballo` heredan de `Animal` e implementan sus propios sonidos.

La interfaz `Movible` establece el método `moverse()`, que cada animal implementa según su forma de desplazarse.

En `Main.java` se utiliza un arreglo `Animal[]` y un ciclo `for` para demostrar el polimorfismo sin utilizar condicionales `if/else`.

## Instrucciones para ejecutar

1. Clonar el repositorio de GitHub.
2. Abrir el proyecto en IntelliJ IDEA.
3. Configurar el JDK 23.
4. Abrir el archivo `Main.java`.
5. Ejecutar el método `main()`.
6. Observar los resultados en la consola.

## Ejemplo de salida

```text
Nombre: Max | Edad: 3
Sonido: Guau
Movimiento: Corre
--------------------
Nombre: Luna | Edad: 2
Sonido: Miau
Movimiento: Camina
--------------------
Nombre: Lola | Edad: 5
Sonido: Muuu
Movimiento: Camina lentamente
--------------------
Nombre: Rayo | Edad: 4
Sonido: Hiiii
Movimiento: Galopa
--------------------
```

## Preguntas de reflexión

### 1. ¿Qué se reutiliza al heredar de Animal?

Se reutilizan los atributos `nombre` y `edad`, el constructor mediante `super()` y el método `mostrarInformacion()`. Esto evita repetir código en cada clase hija.

### 2. ¿Qué hace super(nombre, edad)?

Permite llamar al constructor de la clase padre `Animal` para inicializar los atributos `nombre` y `edad` de cada animal.

### 3. ¿Para qué sirve @Override?

Sirve para indicar que estamos sobrescribiendo un método heredado o implementando uno definido en una interfaz. También ayuda a comprobar que el método esté declarado correctamente.

### 4. ¿Por qué el mismo método hacerSonido() produce resultados distintos?

Porque utilizamos polimorfismo. Cada clase implementa su propia versión de `hacerSonido()` y Java ejecuta automáticamente la correspondiente al objeto.

### 5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?

Una clase abstracta permite compartir atributos, constructores y métodos entre clases relacionadas. Una interfaz define comportamientos que diferentes clases pueden implementar, aunque no tengan la misma clase padre.

## Conclusión

Esta actividad me permitió comprender cómo utilizar la herencia y las interfaces para organizar mejor el código, así como aplicar el polimorfismo para trabajar con distintos objetos sin repetir instrucciones.

También reforcé mis conocimientos de Java y el uso de Git para llevar un historial del desarrollo del proyecto.