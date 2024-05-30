public class Ejercicio223 {
    public static void main(String[] args) {
        // Contadores para los múltiplos de 2 y de 3
        int multiplosDeDos = 0;
        int multiplosDeTres = 0;

        // Iterar sobre los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificar si el número es múltiplo de 2 o de 3
            if (i % 2 == 0) {
                multiplosDeDos++;
            }
            if (i % 3 == 0) {
                multiplosDeTres++;
            }
        }

        // Imprimir los resultados
        System.out.println("Cantidad de números múltiplos de 2: " + multiplosDeDos);
        System.out.println("Cantidad de números múltiplos de 3: " + multiplosDeTres);
    }
}