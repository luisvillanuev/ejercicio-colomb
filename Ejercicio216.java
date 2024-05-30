import java.util.Scanner;

public class Ejercicio216 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las calificaciones en Matemáticas
        System.out.println("Ingresa la calificación del examen de Matemáticas:");
        double examenMatematicas = scanner.nextDouble();
        System.out.println("Ingresa la calificación del promedio de tareas de Matemáticas:");
        double promedioTareasMatematicas = calcularPromedioTareas(3, scanner);

        // Solicitar al usuario las calificaciones en Física
        System.out.println("Ingresa la calificación del examen de Física:");
        double examenFisica = scanner.nextDouble();
        System.out.println("Ingresa la calificación del promedio de tareas de Física:");
        double promedioTareasFisica = calcularPromedioTareas(2, scanner);

        // Solicitar al usuario las calificaciones en Química
        System.out.println("Ingresa la calificación del examen de Química:");
        double examenQuimica = scanner.nextDouble();
        System.out.println("Ingresa la calificación del promedio de tareas de Química:");
        double promedioTareasQuimica = calcularPromedioTareas(3, scanner);

        // Calcular las calificaciones finales en cada materia
        double calificacionFinalMatematicas = calcularCalificacionFinal(examenMatematicas, promedioTareasMatematicas);
        double calificacionFinalFisica = calcularCalificacionFinal(examenFisica, promedioTareasFisica);
        double calificacionFinalQuimica = calcularCalificacionFinal(examenQuimica, promedioTareasQuimica);

        // Calcular el promedio general
        double promedioGeneral = (calificacionFinalMatematicas + calificacionFinalFisica + calificacionFinalQuimica) / 3;

        // Imprimir los resultados
        System.out.println("El promedio en Matemáticas es: " + calificacionFinalMatematicas);
        System.out.println("El promedio en Física es: " + calificacionFinalFisica);
        System.out.println("El promedio en Química es: " + calificacionFinalQuimica);
        System.out.println("El promedio general en las tres materias más difíciles es: " + promedioGeneral);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular el promedio de tareas
    public static double calcularPromedioTareas(int numTareas, Scanner scanner) {
        double sumaTareas = 0;
        System.out.println("Ingresa las calificaciones de las tareas:");
        for (int i = 0; i < numTareas; i++) {
            System.out.println("Tarea " + (i + 1) + ":");
            sumaTareas += scanner.nextDouble();
        }
        return sumaTareas / numTareas;
    }

    // Método para calcular la calificación final
    public static double calcularCalificacionFinal(double examen, double promedioTareas) {
        return examen * 0.9 + promedioTareas * 0.1;
    }
}