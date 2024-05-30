import java.util.Scanner;

public class Ejercicio237 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número debe ser menor que el segundo.");
        } else {
            System.out.println("Los números impares entre " + num1 + " y " + num2 + " son:");
            for (int i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        scanner.close();
    }
}
