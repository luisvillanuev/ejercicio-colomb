import java.util.Scanner;

public class Ejercicio240 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int producto = multiplicacion(num1, num2);
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);

        scanner.close();
    }

    static int multiplicacion(int num1, int num2) {
        int producto = 0;
        for (int i = 0; i < num2; i++) {
            producto += num1;
        }
        return producto;
    }
}