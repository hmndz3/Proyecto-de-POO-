import java.util.ArrayList;

public class Horario {
    private int identificador;
    private String correousuario;
    private ArrayList<Clase> clases = new ArrayList<>();

    // Constructor
    public Horario(int identificador, String correousuario) {
        this.identificador = identificador;
        this.correousuario = correousuario;
    }

    // Métodos
    public void agregarClase(Clase clase) {
        clases.add(clase);
        System.out.println("Clase añadida al horario.");
    }

    public void eliminarClase(Clase clase) {
        clases.remove(clase);
        System.out.println("Clase eliminada del horario.");
    }

    public void mostrarHorario() {
        System.out.println("Horario del usuario: " + correousuario);
        for (Clase c : clases) {
            System.out.println(c.getNombre() + " - " + c.getHorario());
        }
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }
}
