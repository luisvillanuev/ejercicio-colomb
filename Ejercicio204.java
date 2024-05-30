import java.util.Scanner;

public class Ejercicio204 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor en dólares
        System.out.println("Por favor, ingresa el valor en dólares:");
        double dolares = scanner.nextDouble();

        // Definir la tasa de cambio de dólares a bolivianos
        double tasaCambio = 8.08;

        // Realizar la conversión de dólares a bolivianos
        double bolivianos = dolares * tasaCambio;

        // Imprimir el resultado
        System.out.println("$" + dolares + " dólares equivale a " + bolivianos + " bolivianos.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}