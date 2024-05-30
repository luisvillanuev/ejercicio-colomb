import java.util.Scanner;

public class Ejercicio213 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los tiempos cronometrados en cada día (lunes, miércoles y viernes)
        System.out.println("Por favor, ingresa el tiempo cronometrado en minutos para el día lunes:");
        double tiempoLunes = scanner.nextDouble();
        System.out.println("Por favor, ingresa el tiempo cronometrado en minutos para el día miércoles:");
        double tiempoMiercoles = scanner.nextDouble();
        System.out.println("Por favor, ingresa el tiempo cronometrado en minutos para el día viernes:");
        double tiempoViernes = scanner.nextDouble();

        // Calcular el tiempo promedio
        double tiempoPromedio = (tiempoLunes + tiempoMiercoles + tiempoViernes) / 3;

        // Imprimir el tiempo promedio
        System.out.println("El tiempo promedio de la ruta en una semana cualquiera es: " + tiempoPromedio + " minutos");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}