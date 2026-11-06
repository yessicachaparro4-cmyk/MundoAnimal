package mx.com.animales;

// Etapa 2: Herencia y sobrescritura
// Etapa 3: Implementación de la interfaz Movible
public class Vaca extends Animal implements Movible {

    // Constructor de la clase Vaca
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el método de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Muuu");
    }

    // Implementación del movimiento de la vaca
    @Override
    public void moverse() {
        System.out.println("Movimiento: Camina lentamente");
    }
}