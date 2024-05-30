import java.util.Scanner;

public class Ejercicio250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();

        double notaMaxima = Double.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = scanner.nextDouble();
            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
        }

        System.out.println("La nota más alta es: " + notaMaxima);

        scanner.close();
    }
}
