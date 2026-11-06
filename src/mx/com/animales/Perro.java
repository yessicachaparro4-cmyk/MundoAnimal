package mx.com.animales;

// Etapa 2: Herencia y sobrescritura
// Etapa 3: Implementación de la interfaz Movible
public class Perro extends Animal implements Movible {

    // Constructor de la clase Perro
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el método de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Guau");
    }

    // Implementación del movimiento del perro
    @Override
    public void moverse() {
        System.out.println("Movimiento: Corre");
    }
}