import java.util.Scanner;

public class Ejercicio231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.println("Número positivo: " + num);
                sum += num;
            }
        }

        System.out.println("La suma de los números positivos es: " + sum);
        scanner.close();
    }
}
