package avance2_dianamatamoros_sc303;


public interface Mostrable {
    // Método obligatorio para mostrar información específica de la clase que lo implemente
    void mostrarInformacion();
}

// Clase Usuario: representa a la persona usuaria que accede al sistema
class Usuario {
    private String nombre;
    private String contrasena;

    // Constructor de la clase Usuario
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    // Método para obtener el nombre de la persona usuaria
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre de la persona usuaria
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la contraseña de la persona usuaria
    public String getContrasena() {
        return contrasena;
    }

    // Método para establecer la contraseña de la persona usuaria
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    public boolean validar(String nombreIngresado, String contrasenaIngresada) {
        return this.nombre.equals(nombreIngresado) && this.contrasena.equals(contrasenaIngresada);
    }
}
