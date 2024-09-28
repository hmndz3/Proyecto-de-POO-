public class Estadio {
    private String nombre;
    private int capacidadTotal;
    private Localidad[] localidades;

    public Estadio(String nombre, int capacidadTotal, Localidad[] localidades) {
        this.nombre = nombre;
        this.capacidadTotal = capacidadTotal;
        this.localidades = localidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public Localidad[] getLocalidades() {
        return localidades;
    }
}
