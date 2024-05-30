import java.util.Scanner;

public class Ejercicio228 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir el código de usuario y la contraseña correcta
        String codigoCorrecto = "1";
        String contraseñaCorrecta = "1234";

        // Variables para almacenar el código y la contraseña ingresados por el usuario
        String codigoUsuario;
        String contraseñaUsuario;

        // Solicitar al usuario que ingrese el código de usuario y la contraseña
        do {
            System.out.println("Ingrese el código de usuario:");
            codigoUsuario = scanner.nextLine();
            System.out.println("Ingrese la contraseña:");
            contraseñaUsuario = scanner.nextLine();

            // Verificar si el código y la contraseña son correctos
            if (!codigoUsuario.equals(codigoCorrecto) || !contraseñaUsuario.equals(contraseñaCorrecta)) {
                System.out.println("Código de usuario o contraseña incorrectos. Inténtelo de nuevo.");
            }
        } while (!codigoUsuario.equals(codigoCorrecto) || !contraseñaUsuario.equals(contraseñaCorrecta));

        // Mostrar un mensaje de éxito cuando se ingresen los valores correctos
        System.out.println("Acceso concedido. ¡Bienvenido!");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}