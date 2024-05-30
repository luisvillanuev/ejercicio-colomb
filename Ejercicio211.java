import java.util.Scanner;

public class Ejercicio211 {
    public static void main(String[] args) {
        // Precios de los alimentos
        double precioBocadilloJamón = 15;
        double precioBocadilloQueso = 10;
        double precioPatatasFritas = 5;
        double precioRefresco = 3;
        double precioCerveza = 4;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de unidades consumidas de cada alimento
        System.out.println("Por favor, ingresa el número de bocadillos de jamón consumidos:");
        int bocadillosJamón = scanner.nextInt();
        System.out.println("Por favor, ingresa el número de bocadillos de queso consumidos:");
        int bocadillosQueso = scanner.nextInt();
        System.out.println("Por favor, ingresa el número de patatas fritas consumidas:");
        int patatasFritas = scanner.nextInt();
        System.out.println("Por favor, ingresa el número de refrescos consumidos:");
        int refrescos = scanner.nextInt();
        System.out.println("Por favor, ingresa el número de cervezas consumidas:");
        int cervezas = scanner.nextInt();

        // Calcular la cuenta total
        double cuentaTotal = (precioBocadilloJamón * bocadillosJamón) +
                             (precioBocadilloQueso * bocadillosQueso) +
                             (precioPatatasFritas * patatasFritas) +
                             (precioRefresco * refrescos) +
                             (precioCerveza * cervezas);

        // Imprimir la cuenta total
        System.out.println("La cuenta total es: " + cuentaTotal + " Bs.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}