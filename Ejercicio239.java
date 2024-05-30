import java.util.Scanner;

public class Ejercicio239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int num;

        do {
            System.out.print("Ingrese un número (999 para terminar): ");
            num = scanner.nextInt();
            if (num != 999) {
                suma += num;
            }
        } while (num != 999);

        System.out.println("La suma de los números es: " + suma);

        scanner.close();
    }
}