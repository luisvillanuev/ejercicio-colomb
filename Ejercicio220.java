import java.util.Scanner;

public class Ejercicio220 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables para la suma y la cantidad de números
        int suma = 0;
        int cantidadNumeros = 0;

        // Leer números hasta que se ingrese -1
        System.out.println("Ingrese una secuencia de números (termina con -1):");
        int numero = scanner.nextInt();
        while (numero != -1) {
            // Verificar si el número es positivo
            if (numero >= 0) {
                // Sumar el número a la suma total
                suma += numero;
                // Incrementar la cantidad de números
                cantidadNumeros++;
            } else {
                System.out.println("No se permiten números negativos. Ignorando " + numero);
            }
            // Leer el siguiente número
            numero = scanner.nextInt();
        }

        // Calcular la media aritmética
        double media = (double) suma / cantidadNumeros;

        // Imprimir la media aritmética
        System.out.println("La media aritmética de la secuencia es: " + media);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
