import java.util.Scanner;

public class Ejercicio226 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la altura de la escalera
        System.out.println("Ingrese la altura de la escalera:");
        int altura = scanner.nextInt();

        // Dibujar la escalera invertida de asteriscos
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                // Imprimir un asterisco en cada posición de la fila
                System.out.print("*");
            }
            // Ir a la siguiente fila
            System.out.println();
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}