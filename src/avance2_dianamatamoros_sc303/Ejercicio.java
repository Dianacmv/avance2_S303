package avance2_dianamatamoros_sc303;

public abstract class Ejercicio implements Mostrable {
    // Nombre del ejercicio
    protected String nombre;
    // Cantidad de repeticiones por serie
    protected int repeticiones;
    // Cantidad de series que debe realizar la persona usuaria
    protected int series;

    // Constructor: inicializa el ejercicio con los datos mínimos necesarios
    public Ejercicio(String nombre, int repeticiones, int series) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    // Método obligatorio que cada subclase debe implementar para mostrar los detalles del ejercicio
    @Override
    public abstract void mostrarInformacion();

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
