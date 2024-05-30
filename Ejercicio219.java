import java.util.Scanner;

public class Ejercicio219 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de N
        System.out.println("Ingrese un número para N:");
        int N = scanner.nextInt();

        // Verificar si N es positivo
        if (N <= 0) {
            System.out.println("N debe ser un número positivo.");
        } else {
            // Inicializar la suma y el primer número par
            int suma = 0;
            int numeroPar = 2;

            // Iterar N veces para sumar los N primeros números pares
            for (int i = 1; i <= N; i++) {
                // Sumar el número par actual a la suma
                suma += numeroPar;

                // Obtener el siguiente número par
                numeroPar += 2;
            }

            // Imprimir la suma de los N primeros números pares
            System.out.println("La suma de los " + N + " primeros números pares es: " + suma);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}