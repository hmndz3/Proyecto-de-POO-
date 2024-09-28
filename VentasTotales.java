public class VentasTotales {
    private BoletosVendidos boletosVendidos;

    public VentasTotales(BoletosVendidos boletosVendidos) {
        this.boletosVendidos = boletosVendidos;
    }

    public double calcularVentasTotales() {
        double total = 0;
        for (Boleto boleto : boletosVendidos.getBoletos()) {
            total += boleto.getPrecio();
        }
        return total;
    }
}
