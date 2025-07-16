package avance2_dianamatamoros_sc303;

public class Usuario {
    private String nombre;
    private String contrasena;

    // Constructor que recibe nombre y contraseña
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    // Constructor adicional que solo recibe el nombre
    // Se utiliza cuando aún no trabajamos con contraseñas
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.contrasena = ""; // Contraseña vacía por defecto
    }

    // Obtener el nombre de la persona usuaria
    public String getNombre() {
        return nombre;
    }

    // Establecer el nombre de la persona usuaria
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Obtener la contraseña de la persona usuaria
    public String getContrasena() {
        return contrasena;
    }

    // Establecer la contraseña de la persona usuaria
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Método para validar los datos ingresados (validación simple)
    public boolean validar(String nombreIngresado, String contrasenaIngresada) {
        return this.nombre.equals(nombreIngresado) && this.contrasena.equals(contrasenaIngresada);
    }
}

