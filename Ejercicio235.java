import java.util.Scanner;

public class Ejercicio235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cuántos números Fibonacci desea calcular: ");
        int n = scanner.nextInt();

        System.out.println("Los " + n + " primeros números Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}