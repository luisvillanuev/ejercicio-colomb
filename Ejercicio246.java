import java.util.Scanner;

public class Ejercicio246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número n para calcular la serie: ");
        int n = scanner.nextInt();

        int sumaSerie = calcularSerie(n);
        System.out.println("La suma de la serie es: " + sumaSerie);

        scanner.close();
    }

    static int calcularSerie(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * (i + 9);
        }
        return suma;
    }
}