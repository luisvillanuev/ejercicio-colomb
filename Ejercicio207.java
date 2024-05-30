import java.util.Scanner;

public class Ejercicio207 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos valores reales
        System.out.println("Por favor, ingresa el primer valor:");
        double valor1 = scanner.nextDouble();
        System.out.println("Por favor, ingresa el segundo valor:");
        double valor2 = scanner.nextDouble();

        // Realizar las operaciones aritméticas
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double multiplicacion = valor1 * valor2;
        double division = valor1 / valor2;

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}