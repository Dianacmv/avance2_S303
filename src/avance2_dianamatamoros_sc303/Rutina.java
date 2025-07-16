package avance2_dianamatamoros_sc303;

import java.util.ArrayList;

// Esta clase representa una rutina de ejercicios personalizada
// Cada rutina tiene un nombre, está asociada a una persona usuaria y contiene una lista de ejercicios
public class Rutina {
    private String nombreRutina;
    private Usuario personaUsuaria;
    private ArrayList<Ejercicio> ejercicios;

    // Constructor de la clase Rutina
    public Rutina(String nombreRutina, Usuario personaUsuaria) {
        this.nombreRutina = nombreRutina;
        this.personaUsuaria = personaUsuaria;
        this.ejercicios = new ArrayList<>();
    }

    // Agrega un ejercicio a la rutina
    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    // Muestra todos los ejercicios de la rutina en consola
    public void mostrarEjercicios() {
        System.out.println("Rutina de: " + personaUsuaria.getNombre());
        for (Ejercicio e : ejercicios) {
            e.mostrarInformacion(); // método definido en la clase abstracta Ejercicio
        }
    }

    // Getters y Setters
    public String getNombreRutina() {
        return nombreRutina;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public Usuario getPersonaUsuaria() {
        return personaUsuaria;
    }

    public void setPersonaUsuaria(Usuario personaUsuaria) {
        this.personaUsuaria = personaUsuaria;
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }
}
