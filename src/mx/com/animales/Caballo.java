package mx.com.animales;

// Etapa 5: Reto extra - Clase Caballo
public class Caballo extends Animal implements Movible {

    // Constructor de la clase Caballo
    public Caballo(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el sonido del animal
    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Hiiii");
    }

    // Implementar el movimiento del caballo
    @Override
    public void moverse() {
        System.out.println("Movimiento: Galopa");
    }
}