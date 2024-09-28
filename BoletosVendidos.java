public class BoletosVendidos {
    private Boleto[] boletos;
    private int cantidadBoletos;

    public BoletosVendidos(int capacidad) {
        this.boletos = new Boleto[capacidad];
        this.cantidadBoletos = 0;
    }

    public void agregarBoleto(Boleto boleto) {
        if (cantidadBoletos < boletos.length) {
            boletos[cantidadBoletos++] = boleto;
        }
    }

    public int obtenerCantidadBoletosVendidos() {
        return cantidadBoletos;
    }

    public Boleto[] getBoletos() {
        return boletos;
    }
}
