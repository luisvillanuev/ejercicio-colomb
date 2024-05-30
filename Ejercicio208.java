import java.util.Scanner;

public class Ejercicio208 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las calificaciones parciales
        System.out.println("Por favor, ingresa la calificación del primer parcial:");
        double parcial1 = scanner.nextDouble();
        System.out.println("Por favor, ingresa la calificación del segundo parcial:");
        double parcial2 = scanner.nextDouble();
        System.out.println("Por favor, ingresa la calificación del tercer parcial:");
        double parcial3 = scanner.nextDouble();

        // Solicitar al usuario que ingrese la calificación de prácticas
        System.out.println("Por favor, ingresa la calificación de prácticas:");
        double practicas = scanner.nextDouble();

        // Solicitar al usuario que ingrese la calificación de asistencia a clases
        System.out.println("Por favor, ingresa la calificación de asistencia a clases:");
        double asistencia = scanner.nextDouble();

        // Calcular el promedio de las calificaciones parciales
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        // Calcular la calificación final
        double calificacionFinal = (promedioParciales * 0.60) + (practicas * 0.30) + (asistencia * 0.10);

        // Imprimir la calificación final
        System.out.println("La calificación final en la materia de Introducción a la Programación es: " + calificacionFinal);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}