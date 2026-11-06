package mx.com.animales;

// Etapa 2: Herencia y sobrescritura
// Etapa 3: Implementación de la interfaz Movible
public class Gato extends Animal implements Movible {

    // Constructor de la clase Gato
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el método de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Miau");
    }

    // Implementación del movimiento del gato
    @Override
    public void moverse() {
        System.out.println("Movimiento: Camina");
    }
}
