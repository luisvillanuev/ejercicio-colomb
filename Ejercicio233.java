import java.util.Scanner;

public class Ejercicio233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números negativos a convertir: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número negativo " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num < 0)
                num = Math.abs(num);
            System.out.println("Número positivo: " + num);
        }

        scanner.close();
    }
}