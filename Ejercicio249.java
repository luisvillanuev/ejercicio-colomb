import java.util.Scanner;

public class Ejercicio249 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();

        double notaMinima = Double.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = scanner.nextDouble();
            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        System.out.println("La nota más baja es: " + notaMinima);

        scanner.close();
    }
}