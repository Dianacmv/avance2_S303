package avance2_dianamatamoros_sc303;

public class Espalda extends Ejercicio {

    // Constructor que inicializa el ejercicio de espalda con sus atributos
    public Espalda(String nombre, int repeticiones, int series) {
        super(nombre, repeticiones, series);
    }

    // Implementación del método obligatorio para mostrar la información del ejercicio
    @Override
    public void mostrarInformacion() {
        System.out.println("Ejercicio de Espalda");
        System.out.println("Nombre: " + nombre);
        System.out.println("Repeticiones: " + repeticiones);
        System.out.println("Series: " + series);
    }
}
