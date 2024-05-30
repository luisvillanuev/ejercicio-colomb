import java.util.Scanner;

public class Ejercicio203 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.println("Por favor, ingresa tu edad:");
        int edad = scanner.nextInt();

        // Calcular el número de pulsaciones por cada 10 segundos de ejercicio
        double pulsacionesPor10Segundos = (220.0 - edad) / 10;

        // Imprimir el resultado
        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio es: " + pulsacionesPor10Segundos);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}