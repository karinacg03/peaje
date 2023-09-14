public class Camion extends Vehiculo {
    private int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    // Método para calcular el peaje del camión
    public double calcularPeaje() {
        return 5000.0 * numeroEjes;
    }
}