package avance2_dianamatamoros_sc303;

import java.util.ArrayList;

public class Rutina {
    private String nombreRutina; // Nombre que identifica la rutina
    private Usuario personaUsuaria; // Persona usuaria dueña de la rutina
    private ArrayList<Ejercicio> ejercicios; // Lista de ejercicios incluidos en la rutina

    // Constructor que recibe el nombre de la rutina y la persona usuaria asociada
    public Rutina(String nombreRutina, Usuario personaUsuaria) {
        this.nombreRutina = nombreRutina;
        this.personaUsuaria = personaUsuaria;
        this.ejercicios = new ArrayList<>(); // Se inicia la lista vacía
    }

    // Método para agregar un ejercicio a la rutina
    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    // Método para mostrar los ejercicios registrados en esta rutina
    public void mostrarEjercicios() {
        System.out.println("Rutina: " + nombreRutina);
        System.out.println("Asignada a: " + personaUsuaria.getNombre());
        for (Ejercicio ejercicio : ejercicios) {
            ejercicio.mostrarInformacion(); // Se llama al método mostrar de cada ejercicio
        }
    }

    // Getters y setters necesarios para trabajar con los atributos privados

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
