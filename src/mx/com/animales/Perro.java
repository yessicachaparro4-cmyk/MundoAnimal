package mx.com.animales;

// Etapa 2: Herencia y sobrescritura
public class Perro extends Animal {

    // Constructor de la clase Perro
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el método de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Guau");
    }
}
