import java.util.Scanner;

public class Ejercicio212 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el costo total del automóvil
        System.out.println("Por favor, ingresa el costo total del automóvil:");
        double costoVehiculo = scanner.nextDouble();

        // Calcular la ganancia del vendedor (12% del costo del vehículo)
        double gananciaVendedor = 0.12 * costoVehiculo;

        // Calcular los impuestos locales o estatales (6% del costo total, incluida la ganancia del vendedor)
        double impuestos = 0.06 * (costoVehiculo + gananciaVendedor);

        // Calcular el costo total para el consumidor (suma del costo del vehículo, la ganancia del vendedor y los impuestos)
        double costoTotalConsumidor = costoVehiculo + gananciaVendedor + impuestos;

        // Imprimir el costo total para el consumidor
        System.out.println("El costo total para el consumidor es: $" + costoTotalConsumidor);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}