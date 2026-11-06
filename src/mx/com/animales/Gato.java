package mx.com.animales;

// Etapa 2: Herencia y sobrescritura
public class Gato extends Animal {

    // Constructor de la clase Gato
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el método de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Miau");
    }
}
