package mx.com.animales;

// Etapa 4: Aplicación del polimorfismo
public class Main {

    public static void main(String[] args) {

        // Crear objetos con diferentes nombres y edades
        Animal perro = new Perro("Max", 3);
        Animal gato = new Gato("Luna", 2);
        Animal vaca = new Vaca("Lola", 5);

        // Guardar los animales en un arreglo de tipo Animal
        Animal[] grupo = {perro, gato, vaca};

        // Recorrer el arreglo utilizando polimorfismo
        for (Animal animal : grupo) {

            // Mostrar nombre y edad del animal
            animal.mostrarInformacion();

            // Ejecutar el sonido correspondiente
            animal.hacerSonido();

            // Utilizar la interfaz Movible
            Movible movible = (Movible) animal;
            movible.moverse();

            // Separar la información de cada animal
            System.out.println("--------------------");
        }
    }
}