import java.util.ArrayList;

public class Peaje {
    private String nombre;
    private String departamento;
    private double valorTotalRecolectado;
    private ArrayList<Vehiculo> vehiculos;

    public double calcularTotalPeajesIngresados() {
        double totalPeajes = 0.0;
        for (Vehiculo vehiculo : vehiculos) {
            totalPeajes += calcularPeaje(vehiculo);
        }
        return totalPeajes;
    }

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.valorTotalRecolectado = 0.0;
        this.vehiculos = new ArrayList<>();
    }

// Método para calcular el peaje de un vehículo y actualizar el total recolectado
    public double calcularPeaje(Vehiculo vehiculo) {
        double peaje = 0.0;
        if (vehiculo instanceof Carro) {
            peaje = ((Carro) vehiculo).calcularPeaje();
        } else if (vehiculo instanceof Moto) {
            peaje = ((Moto) vehiculo).calcularPeaje();
        } else if (vehiculo instanceof Camion) {
            peaje = ((Camion) vehiculo).calcularPeaje();
        }

        valorTotalRecolectado += peaje;
        vehiculos.add(vehiculo);

        return peaje;
    }

// Método para calcular el valor total de peajes de todos los vehículos
    public double calcularValorTotalPeajes() {
        double valorTotalPeajes = 0.0;
        for (Vehiculo vehiculo : vehiculos) {
            valorTotalPeajes += calcularPeaje(vehiculo);
        }
        return valorTotalPeajes;
    }

    // Getters y Setters para los atributos de Peaje
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getValorTotalRecolectado() {
        return valorTotalRecolectado;
    }

    public void setValorTotalRecolectado(double valorTotalRecolectado) {
        this.valorTotalRecolectado = valorTotalRecolectado;
    }

    public void imprimirListadoVehiculos() {
    }

    public void valorTotalRecolectado() {
    }
}