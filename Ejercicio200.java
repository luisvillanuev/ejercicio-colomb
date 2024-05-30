public class Ejercicio200 {
    public static void main(String[] args) {
        // Capital inicial
        double capital = 1000; // Cambia este valor por el capital que desees

        // Tasa de interés mensual
        double tasaInteresMensual = 0.015; // 1.5% expresado como decimal

        // Calcular el interés ganado después de 2 meses
        double interesGanado = capital * tasaInteresMensual * 2;

        // Calcular el capital total después de 2 meses
        double capitalTotal = capital + interesGanado;

        // Imprimir resultados
        System.out.println("Capital inicial: $" + capital);
        System.out.println("Interés ganado después de 2 meses: $" + interesGanado);
        System.out.println("Capital total después de 2 meses: $" + capitalTotal);
    }
}