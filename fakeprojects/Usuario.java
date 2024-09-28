public class Usuario {
    private String correo;
    private String nombre;
    private String contraseña;

    // Constructor
    public Usuario(String correo, String nombre, String contraseña) {
        this.correo = correo;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    // Métodos
    public void registrar() {
        System.out.println("Usuario registrado: " + nombre);
    }

    public boolean autenticar(String correo, String contraseña) {
        return this.correo.equals(correo) && this.contraseña.equals(contraseña);
    }

    public void actualizarPerfil(String nuevoNombre, String nuevaContraseña) {
        this.nombre = nuevoNombre;
        this.contraseña = nuevaContraseña;
        System.out.println("Perfil actualizado.");
    }

    // Getters y Setters
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
