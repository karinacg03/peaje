public class Moto extends Vehiculo {
    public Moto(String placa) {
        super(placa);
    }

    // Método para calcular el peaje de la moto
    public double calcularPeaje() {
        return 5000.0;
    }
}