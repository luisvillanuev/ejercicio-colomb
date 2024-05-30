import java.util.Scanner;

public class Ejercicio248 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();

        double suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
        }

        double promedio = suma / n;
        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);

        scanner.close();
    }
}