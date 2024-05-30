import java.util.Scanner;

public class Ejercicio245 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n para calcular la suma de los cuadrados: ");
        int n = scanner.nextInt();

        int sumaCuadrados = calcularSumaCuadrados(n);
        System.out.println("La suma de los cuadrados de los " + n + " primeros números naturales es: " + sumaCuadrados);

        scanner.close();
    }

    static int calcularSumaCuadrados(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }
}