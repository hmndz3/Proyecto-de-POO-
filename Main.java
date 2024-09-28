import java.util.Scanner;

class Main {
    public  static void main(String[] args) {
        // Datos del Cliente
        boolean bandera1 = false;
        Cliente nuevo = null;
        Localidad[] localidades = null;
        BoletosVendidos boletosVendidos = new BoletosVendidos(150); 

        while (!bandera1) {
            System.out.println("\nVENTA DE BOLETOS ESTADIO OLIMPICO.");
            System.out.println("\nPorfavor ingrese los siguientes datos.");
            Scanner sc = new Scanner(System.in);
            System.out.print("1.Nombre y Apellido: ");
            String nombre = sc.nextLine();
            System.out.print("2.Numero de Telefono: ");
            int telefono = sc.nextInt();
            System.out.print("3.Cantidad de Boletos: ");
            int cantidadBoletos = sc.nextInt();
            System.out.print("4.Presupuesto Total: ");
            double presupuestoMaximo = sc.nextDouble();
            nuevo = new Cliente(nombre, telefono, cantidadBoletos, presupuestoMaximo);

            // Datos del Estadio y las Localidades
            Localidad localidad1 = new Localidad("Localidad 10", 50, 1720);
            Localidad localidad2 = new Localidad("Localidad 5", 50, 575);
            Localidad localidad3 = new Localidad("Localidad 1", 50, 250);
            localidades = new Localidad[] { localidad1, localidad2, localidad3 };

            Estadio estadionuevo = new Estadio("ESTADIO OLIMPICO", 150, localidades);

            if (cantidadBoletos > 6) {
                System.out.println("\n EL LIMITE DE BOLETOS ES 6 POR PERSONA!");
            } else {
                boolean bandera2 = false;
                while (!bandera2) {
                    System.out.println("MENU PRINCIPAL!");
                    System.out.println("Opciones: \n 1. Informacion sobre el Estadio. \n 2. Informacion Personal. \n 3. Informacion sobre Localidades \n 4. Comprar Boletos. \n 5. Boletos Vendidos Totales. \n 6. Reporte de Caja \n 7. Salir.");
                    System.out.print("Eleccion: ");
                    int opcion = sc.nextInt();
                    sc.nextLine(); 
                    switch (opcion) {
                        case 7:
                            System.out.println("\nGracias por usar el programa!");
                            bandera2 = true;
                            bandera1 = true;
                            break;
                        case 1:
                            System.out.println("\nInformacion Sobre el Estadio!");
                            System.out.println("Nombre: " + estadionuevo.getNombre());
                            System.out.println("Capacidad Total del Estadio Actual: " + estadionuevo.getCapacidadTotal());
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("\nInformacion Personal!");
                            System.out.println("Nombre: " + nuevo.getNombre());
                            System.out.println("Teléfono: " + nuevo.getTelefono());
                            System.out.println("Cantidad de Boletos: " + nuevo.getCantidadBoletos());
                            System.out.println("Presupuesto Máximo: " + nuevo.getPresupuestoMaximo());
                            System.out.println("");
                            break;
                            case 3:
                                System.out.println("\nInformacion sobre Localidades!");
                                for (int i = 0; i < localidades.length; i++) {
                                    System.out.println("Localidad #" + (i + 1) + ": " + localidades[i].getNombre());
                                    System.out.println("    Capacidad Actual: " + localidades[i].getCapacidad());
                                    System.out.println("    Precio: " + localidades[i].getPrecio()); 
                                    System.out.println("");
                                }
                                break;
                        case 4:
                            System.out.println("\nComprar Boletos!");
                            System.out.print("Ingrese el número de localidad para comprar (1-3): ");
                            int numLocalidad = sc.nextInt() - 1;
                            if (numLocalidad >= 0 && numLocalidad < localidades.length) {
                                Localidad localidadSeleccionada = localidades[numLocalidad];
                                if (localidadSeleccionada.getCapacidad() > 0) {
                                    double precioBoleto = localidadSeleccionada.getPrecio();
                                    if (presupuestoMaximo >= precioBoleto && cantidadBoletos > 0) {
                                        Boleto nuevoBoleto = new Boleto(localidadSeleccionada, precioBoleto);
                                        boletosVendidos.agregarBoleto(nuevoBoleto);
                                        localidadSeleccionada.setCapacidad(localidadSeleccionada.getCapacidad() - 1);
                                        cantidadBoletos--;
                                        presupuestoMaximo -= precioBoleto;
                                        System.out.println("Boleto comprado exitosamente!");
                                    } else {
                                        System.out.println("No tienes suficiente presupuesto o cantidad de boletos!");
                                    }
                                } else {
                                    System.out.println("No hay capacidad en la localidad seleccionada!");
                                }
                            } else {
                                System.out.println("Número de localidad inválido!");
                            }
                            System.out.println("");
                            break;
                        case 5:
                            System.out.println("\nBoletos Vendidos Totales!");
                            System.out.println("Total de boletos vendidos: " + boletosVendidos.obtenerCantidadBoletosVendidos());
                            System.out.println("");
                            break;
                        case 6:
                            System.out.println("\nReporte de Caja!");
                            VentasTotales ventasTotales = new VentasTotales(boletosVendidos);
                            System.out.println("Total vendido: $" + ventasTotales.calcularVentasTotales());
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                }
            }
        }
    }
}