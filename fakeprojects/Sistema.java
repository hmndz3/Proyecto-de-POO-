import java.util.ArrayList;

public class Sistema {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<Clase> listaClases = new ArrayList<>();

    // Métodos para gestionar usuarios
    public void gestionarUsuarios(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    // Métodos para gestionar clases
    public void gestionarClases(Clase clase) {
        listaClases.add(clase);
    }

    // Mostrar soporte (simplificado)
    public void mostrarSoporte() {
        System.out.println("Contacto de soporte: soporte@universidad.edu");
    }
}
