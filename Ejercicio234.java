import java.util.Scanner;

public class Ejercicio234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es capicúa: ");
        int num = scanner.nextInt();

        if (esCapicua(num))
            System.out.println("El número " + num + " es capicúa.");
        else
            System.out.println("El número " + num + " no es capicúa.");

        scanner.close();
    }

    static boolean esCapicua(int num) {
        int original = num;
        int reverso = 0;

        while (num != 0) {
            int digito = num % 10;
            reverso = reverso * 10 + digito;
            num /= 10;
        }

        return original == reverso;
    }
}