import java.util.Scanner;

public class Ejercicio215 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el kilometraje de la última vez que se reportó
        System.out.println("Por favor, ingresa el kilometraje de la última vez que se reportó:");
        double kilometrajeUltimoReporte = scanner.nextDouble();

        // Solicitar al usuario que ingrese el kilometraje actual
        System.out.println("Por favor, ingresa el kilometraje actual:");
        double kilometrajeActual = scanner.nextDouble();

        // Solicitar al usuario que ingrese los litros de gasolina que se repostaron la última vez
        System.out.println("Por favor, ingresa los litros de gasolina que se repostaron la última vez:");
        double litrosUltimaRecarga = scanner.nextDouble();

        // Solicitar al usuario que ingrese la cantidad de gasolina actual
        System.out.println("Por favor, ingresa la cantidad de gasolina actual:");
        double gasolinaActual = scanner.nextDouble();

        // Calcular la distancia recorrida desde el último reporte
        double distanciaRecorrida = kilometrajeActual - kilometrajeUltimoReporte;

        // Calcular la cantidad total de litros consumidos
        double litrosConsumidos = litrosUltimaRecarga - gasolinaActual;

        // Calcular el consumo medio del coche en litros cada 100 kilómetros
        double consumoMedio = (litrosConsumidos / distanciaRecorrida) * 100;

        // Imprimir el consumo medio del coche
        System.out.println("El consumo medio del coche es de: " + consumoMedio + " litros cada 100 kilómetros");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}