import java.util.Scanner;

public class Ejercicio225 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del lado del cuadrado
        System.out.println("Ingrese el tamaño del lado del cuadrado:");
        int lado = scanner.nextInt();

        // Dibujar el cuadrado de asteriscos
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                // Si estamos en el borde del cuadrado, imprimir un asterisco
                // De lo contrario, imprimir un espacio en blanco
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Ir a la siguiente fila
            System.out.println();
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}