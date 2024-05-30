import java.util.Scanner;

public class Ejercicio243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo para verificar si es primo: ");
        int num = scanner.nextInt();

        if (esPrimo(num))
            System.out.println(num + " es un número primo.");
        else
            System.out.println(num + " no es un número primo.");

        scanner.close();
    }

    static boolean esPrimo(int num) {
        if (num <= 1)
            return false;

        int divisor = 2;
        while (divisor * divisor <= num) {
            if (num % divisor == 0)
                return false;
            divisor++;
        }
        return true;
    }
}