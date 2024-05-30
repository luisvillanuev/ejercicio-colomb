import java.util.Scanner;

public class Ejercicio244 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo menor que 20 para verificar si es primo: ");
        int num = scanner.nextInt();

        if (num < 20 && esPrimo(num))
            System.out.println(num + " es un número primo.");
        else
            System.out.println(num + " no es un número primo válido.");

        scanner.close();
    }

    static boolean esPrimo(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}