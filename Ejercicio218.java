import java.util.Scanner;

public class Ejercicio218 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de N
        System.out.println("Ingrese un número positivo y par para N:");
        int N = scanner.nextInt();

        // Verificar si N es positivo y par
        if (N <= 0 || N % 2 != 0) {
            System.out.println("N debe ser un número positivo y par.");
        } else {
            // Calcular la suma de los N primeros números naturales
            int suma = 0;
            for (int i = 1; i <= N; i++) {
                suma += i;
            }

            // Imprimir la suma de los N primeros números naturales
            System.out.println("La suma de los " + N + " primeros números naturales es: " + suma);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}