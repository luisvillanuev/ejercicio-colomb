import java.util.Scanner;

public class Ejercicio209 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de reprobados, aprobados y sobresalientes
        System.out.println("Por favor, ingresa el número de reprobados:");
        int reprobados = scanner.nextInt();
        System.out.println("Por favor, ingresa el número de aprobados:");
        int aprobados = scanner.nextInt();
        System.out.println("Por favor, ingresa el número de sobresalientes:");
        int sobresalientes = scanner.nextInt();

        // Calcular el total de alumnos
        int totalAlumnos = reprobados + aprobados + sobresalientes;

        // Calcular el porcentaje de alumnos que han aprobado la asignatura
        double porcentajeAprobados = (aprobados + sobresalientes) * 100.0 / totalAlumnos;

        // Calcular el porcentaje de reprobados, aprobados, notables y sobresalientes
        double porcentajeReprobados = reprobados * 100.0 / totalAlumnos;
        double porcentajeNotables = aprobados * 100.0 / totalAlumnos;
        double porcentajeSobresalientes = sobresalientes * 100.0 / totalAlumnos;

        // Imprimir los resultados
        System.out.println("El porcentaje de alumnos que han aprobado la asignatura es: " + porcentajeAprobados + "%");
        System.out.println("El porcentaje de reprobados es: " + porcentajeReprobados + "%");
        System.out.println("El porcentaje de aprobados es: " + porcentajeNotables + "%");
        System.out.println("El porcentaje de sobresalientes es: " + porcentajeSobresalientes + "%");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}