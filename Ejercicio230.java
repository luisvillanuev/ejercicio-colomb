import java.util.Scanner;

public class Ejercicio230 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar los números ingresados por el usuario
        double numero1, numero2;

        // Solicitar al usuario que ingrese los dos números
        do {
            System.out.println("Ingrese el primer número (mayor que 0):");
            numero1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número (mayor que 0):");
            numero2 = scanner.nextDouble();

            // Verificar si ambos números son positivos y si el primero es mayor que el segundo
            if (numero1 <= 0 || numero2 <= 0 || numero1 <= numero2) {
                System.out.println("Error: Ambos números deben ser positivos y el primero mayor que el segundo.");
            }
        } while (numero1 <= 0 || numero2 <= 0 || numero1 <= numero2);

        // Calcular la división y mostrar el resultado
        double resultado = numero1 / numero2;
        System.out.println("El resultado de la división es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}