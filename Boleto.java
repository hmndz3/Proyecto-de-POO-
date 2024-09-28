public class Boleto {
    private Localidad localidad;
    private double precio;

    public Boleto(Localidad localidad, double precio) {

        this.localidad = localidad;
        this.precio = precio;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
