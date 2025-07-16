
package avance2_dianamatamoros_sc303;

public class Pierna extends Ejercicio {

    // Constructor que inicializa el ejercicio de pierna con sus atributos
    public Pierna(String nombre, int repeticiones, int series) {
        super(nombre, repeticiones, series);
    }

    // Implementación del método obligatorio para mostrar la información del ejercicio
    @Override
    public void mostrarInformacion() {
        System.out.println("Ejercicio de Pierna");
        System.out.println("Nombre: " + nombre);
        System.out.println("Repeticiones: " + repeticiones);
        System.out.println("Series: " + series);
    }
}