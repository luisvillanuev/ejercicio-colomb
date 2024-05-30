import java.util.Scanner;

public class Ejercicio224 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar el nombre y las notas del alumno
        String nombreAlumno;
        double notaPractica, notaProblemas, notaTeorica;

        // Solicitar al usuario que ingrese los datos del alumno
        while (true) {
            // Solicitar el nombre del alumno
            System.out.println("Ingrese el nombre del alumno (deje vacío para finalizar):");
            nombreAlumno = scanner.nextLine();

            // Si el nombre es una cadena vacía, salir del bucle
            if (nombreAlumno.isEmpty()) {
                break;
            }

            // Solicitar las notas del alumno
            System.out.println("Ingrese la nota de práctica del alumno:");
            notaPractica = scanner.nextDouble();
            System.out.println("Ingrese la nota de problemas del alumno:");
            notaProblemas = scanner.nextDouble();
            System.out.println("Ingrese la nota teórica del alumno:");
            notaTeorica = scanner.nextDouble();

            // Verificar si las notas están en el rango correcto (0 a 10)
            if (notaPractica < 0 || notaPractica > 10 ||
                notaProblemas < 0 || notaProblemas > 10 ||
                notaTeorica < 0 || notaTeorica > 10) {
                System.out.println("Error: Las notas deben estar entre 0 y 10. Por favor, inténtelo nuevamente.");
                // Limpiar el buffer del scanner
                scanner.nextLine();
                continue; // Saltar al siguiente ciclo del bucle
            }

            // Calcular la nota final del alumno
            double notaFinal = calcularNotaFinal(notaPractica, notaProblemas, notaTeorica);

            // Mostrar el resultado
            System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);
            // Limpiar el buffer del scanner
            scanner.nextLine();
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular la nota final del alumno
    public static double calcularNotaFinal(double practica, double problemas, double teorica) {
        return (practica * 0.10) + (problemas * 0.50) + (teorica * 0.40);
    }
}