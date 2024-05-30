import java.util.Scanner;

public class Ejercicio222 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar las variables para el máximo, el mínimo, la suma y la cantidad de números
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int cantidadNumeros = 0;

        // Leer números hasta que se ingrese 0
        System.out.println("Ingresa números enteros (0 para finalizar):");
        int numero = scanner.nextInt();
        while (numero != 0) {
            // Actualizar el máximo
            if (numero > maximo) {
                maximo = numero;
            }
            // Actualizar el mínimo
            if (numero < minimo) {
                minimo = numero;
            }
            // Sumar el número a la suma total
            suma += numero;
            // Incrementar la cantidad de números
            cantidadNumeros++;
            // Leer el siguiente número
            numero = scanner.nextInt();
        }

        // Calcular la media
        double media = (double) suma / cantidadNumeros;

        // Imprimir los resultados
        if (cantidadNumeros > 0) {
            System.out.println("El máximo es: " + maximo);
            System.out.println("El mínimo es: " + minimo);
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}