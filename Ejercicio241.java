import java.util.Scanner;

public class Ejercicio241 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        int cociente = division(dividendo, divisor);
        System.out.println("El cociente de la división es: " + cociente);

        scanner.close();
    }

    static int division(int dividendo, int divisor) {
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        return cociente;
    }
}
