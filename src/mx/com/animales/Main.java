package mx.com.animales;

// Etapa 4: Polimorfismo
// Etapa 5: Integración de Caballo
public class Main {

    public static void main(String[] args) {

        // Crear objetos de diferentes animales
        Animal perro = new Perro("Max", 3);
        Animal gato = new Gato("Luna", 2);
        Animal vaca = new Vaca("Lola", 5);
        Animal caballo = new Caballo("Rayo", 4);

        // Arreglo de animales: polimorfismo
        Animal[] grupo = {perro, gato, vaca, caballo};

        // Recorrer los animales sin utilizar if/else
        for (Animal animal : grupo) {

            animal.mostrarInformacion();
            animal.hacerSonido();

            // Utilizar la interfaz Movible
            Movible movible = (Movible) animal;
            movible.moverse();

            System.out.println("--------------------");
        }
    }
}