package mx.com.animales;

    // Etapa 1: Clase abstracta Animal
    public abstract class Animal {

        // Atributos privados
        private String nombre;
        private int edad;

        // Constructor para inicializar los atributos
        public Animal(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Método para mostrar la información
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre
                    + " | Edad: " + edad);
        }

        // Método abstracto que implementarán las clases hijas
        public abstract void hacerSonido();
}
