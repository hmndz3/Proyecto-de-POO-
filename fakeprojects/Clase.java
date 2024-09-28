public class Clase {
    private int identificador;
    private String nombre;
    private String codigoClase;
    private String profesor;
    private String horario;
    private String seccion;

    // Constructor
    public Clase(int identificador, String nombre, String codigoClase, String profesor, String horario, String seccion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.codigoClase = codigoClase;
        this.profesor = profesor;
        this.horario = horario;
        this.seccion = seccion;
    }

    // Métodos
    public void inscribir() {
        System.out.println("Clase " + nombre + " inscrita.");
    }

    public void cancelarInscripcion() {
        System.out.println("Inscripción de la clase " + nombre + " cancelada.");
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
