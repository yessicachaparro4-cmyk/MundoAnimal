package mx.com.animales;

// Etapa 2: Herencia y sobrescritura
public class Vaca extends Animal {

    // Constructor de la clase Vaca
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el método de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Sonido: Muuu");
    }
}