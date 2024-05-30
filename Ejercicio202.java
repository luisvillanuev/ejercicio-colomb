import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

public class Ejercicio202 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su año de nacimiento
        System.out.println("Por favor, ingresa tu año de nacimiento:");
        int añoNacimiento = scanner.nextInt();

        // Obtener el año actual
        int añoActual = java.time.LocalDate.now().getYear();

        // Calcular la edad restando el año de nacimiento al año actual
        int edad = añoActual - añoNacimiento;

        // Imprimir la edad calculada
        System.out.println("Tu edad es: " + edad + " años.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}