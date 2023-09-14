public class Carro extends Vehiculo {
    public Carro(String placa) {
        super(placa);
    }

    // Método para calcular el peaje del carro
    public double calcularPeaje() {
        return 10000.0;
    }
}