import java.util.Scanner;

public class Ejercicio232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0, neutros = 0;

        System.out.print("Ingrese la cantidad de números a evaluar: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > 0)
                positivos++;
            else if (num < 0)
                negativos++;
            else
                neutros++;
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números neutros: " + neutros);
        scanner.close();
    }
}