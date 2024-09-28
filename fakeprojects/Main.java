import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de creación de usuario y registro
        Usuario usuario = new Usuario("pro24003@uvg.edu.gt", "Harry Cifuentes", "contraseña123");
        sistema.gestionarUsuarios(usuario);
        usuario.registrar();

        // Autenticación
        System.out.println("Ingrese su correo: ");
        String correo = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        if (usuario.autenticar(correo, contraseña)) {
            System.out.println("Acceso concedido.");
            // Continuar con las funcionalidades del sistema
        } else {
            System.out.println("Acceso denegado.");
        }

        scanner.close();
    }
}
