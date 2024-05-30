import java.util.Scanner;

public class Ejercicio214 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad invertida por cada persona
        System.out.println("Por favor, ingresa la cantidad invertida por la primera persona:");
        double inversionPersona1 = scanner.nextDouble();
        System.out.println("Por favor, ingresa la cantidad invertida por la segunda persona:");
        double inversionPersona2 = scanner.nextDouble();
        System.out.println("Por favor, ingresa la cantidad invertida por la tercera persona:");
        double inversionPersona3 = scanner.nextDouble();

        // Calcular el total invertido
        double totalInvertido = inversionPersona1 + inversionPersona2 + inversionPersona3;

        // Calcular el porcentaje de inversión de cada persona
        double porcentajePersona1 = (inversionPersona1 / totalInvertido) * 100;
        double porcentajePersona2 = (inversionPersona2 / totalInvertido) * 100;
        double porcentajePersona3 = (inversionPersona3 / totalInvertido) * 100;

        // Imprimir los porcentajes de inversión de cada persona
        System.out.println("El porcentaje de inversión de la primera persona es: " + porcentajePersona1 + "%");
        System.out.println("El porcentaje de inversión de la segunda persona es: " + porcentajePersona2 + "%");
        System.out.println("El porcentaje de inversión de la tercera persona es: " + porcentajePersona3 + "%");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}