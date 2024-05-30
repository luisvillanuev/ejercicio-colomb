import java.util.Scanner;

public class Ejercicio205 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad en bolivianos
        System.out.println("Por favor, ingresa la cantidad en bolivianos:");
        double bolivianos = scanner.nextDouble();

        // Solicitar al usuario que ingrese el tipo de cambio
        System.out.println("Por favor, ingresa el tipo de cambio de bolivianos a dólares:");
        double tipoCambio = scanner.nextDouble();

        // Realizar la conversión de bolivianos a dólares
        double dolares = bolivianos / tipoCambio;

        // Imprimir el resultado
        System.out.println(bolivianos + " bolivianos equivalen a $" + dolares + " dólares.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
