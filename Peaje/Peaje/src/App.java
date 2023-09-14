import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Peaje peaje = new Peaje("Invias", "Valle del cauca");
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        vehiculos.add(new Carro("QRW158"));
        vehiculos.add(new Moto("OOZ454"));
        vehiculos.add(new Camion("KOF995", 4));
        vehiculos.add(new Camion("SEN043", 2));
        vehiculos.add(new Moto("ADS026"));

        for (Vehiculo vehiculo : vehiculos) {
            double peajeCalculado = peaje.calcularPeaje(vehiculo);
            System.out.println(vehiculo.getClass().getSimpleName() + " - Placa: " + vehiculo.getPlaca() + " - Peaje: " + peajeCalculado);
        }


    
        peaje.imprimirListadoVehiculos();
    
        double valorTotalPeajes = peaje.calcularValorTotalPeajes();
        System.out.println("Valor total de peajes de todos los vehículos: " + valorTotalPeajes);
    }
    }
