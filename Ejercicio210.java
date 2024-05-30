import java.util.Scanner;

public class Ejercicio210 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el monto total del presupuesto
        System.out.println("Por favor, ingresa el monto total del presupuesto anual del hospital:");
        double presupuestoTotal = scanner.nextDouble();

        // Calcular la cantidad de dinero que recibirá cada área
        double ginecologia = presupuestoTotal * 0.40;
        double traumatologia = presupuestoTotal * 0.30;
        double pediatria = presupuestoTotal * 0.30;

        // Imprimir los resultados
        System.out.println("El área de Ginecología recibirá: $" + ginecologia);
        System.out.println("El área de Traumatología recibirá: $" + traumatologia);
        System.out.println("El área de Pediatría recibirá: $" + pediatria);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}