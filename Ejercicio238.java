import java.util.Scanner;

public class Ejercicio238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }

        System.out.println("La suma de los elementos del número es: " + suma);

        scanner.close();
    }
}