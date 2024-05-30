import java.util.Scanner;

public class Ejercicio206 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el salario anterior
        System.out.println("Por favor, ingresa el salario anterior del obrero:");
        double salarioAnterior = scanner.nextDouble();

        // Calcular el nuevo salario con el incremento del 25%
        double nuevoSalario = salarioAnterior * 1.25;

        // Imprimir el resultado
        System.out.println("El nuevo salario del obrero es: $" + nuevoSalario);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}