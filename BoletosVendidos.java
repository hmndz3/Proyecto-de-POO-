public class BoletosVendidos {
    private Boleto[] boletos;
    private int cantidadBoletos;
// hay que hace algo mas 
    public BoletosVendidos(int capacidad) {
        this.boletos = new Boleto[capacidad];
        this.cantidadBoletos = 0;
    }
// esta mierda no funcionaaaaaaaaaa
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
