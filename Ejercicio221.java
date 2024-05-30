import java.util.Scanner;

public class Ejercicio221 {
    public static void main(String[] args) {
        // Definir la clave
        final String CLAVE_CORRECTA = "eureka";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar el contador de intentos
        int intentos = 0;

        // Solicitar al usuario que ingrese la clave
        while (intentos < 3) {
            System.out.println("Ingrese la clave:");
            String claveIngresada = scanner.nextLine();

            // Verificar si la clave es correcta
            if (claveIngresada.equals(CLAVE_CORRECTA)) {
                System.out.println("¡Clave correcta! Has accedido al sistema.");
                // Salir del programa si la clave es correcta
                return;
            } else {
                System.out.println("Clave incorrecta. Intento " + (intentos + 1) + " de 3.");
                intentos++;
            }
        }

        // Si se han agotado los intentos
        System.out.println("Has agotado tus 3 intentos. Acceso denegado.");
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
