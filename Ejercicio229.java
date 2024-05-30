import java.util.Scanner;

public class Ejercicio229 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar los números ingresados por el usuario
        int numero1, numero2;

        // Repetir el proceso hasta que ambos números ingresados sean 0
        do {
            // Solicitar al usuario que ingrese los dos números
            System.out.println("Ingrese el primer número:");
            numero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número:");
            numero2 = scanner.nextInt();

            // Verificar si ambos números son pares y diferentes de 0
            if (esPar(numero1) && esPar(numero2) && numero1 != 0 && numero2 != 0) {
                // Calcular la suma de los dos números y mostrar el resultado
                int suma = numero1 + numero2;
                System.out.println("La suma de los dos números pares es: " + suma);
            } else if (numero1 != 0 && numero2 != 0) {
                // Si al menos uno de los números no es par, mostrar un mensaje de error
                System.out.println("Ambos números no son pares. Inténtelo de nuevo.");
            }
        } while (numero1 != 0 || numero2 != 0);

        // Mostrar un mensaje de despedida cuando ambos números sean 0
        System.out.println("Ambos números ingresados son 0. Fin del programa.");

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}