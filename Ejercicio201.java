public class Ejercicio201 {
    public static void main(String[] args) {
        // Calificaciones del alumno
        double calificacionParcial1 = 85; // Calificación del primer parcial
        double calificacionParcial2 = 78; // Calificación del segundo parcial
        double calificacionParcial3 = 92; // Calificación del tercer parcial
        double calificacionExamenFinal = 88; // Calificación del examen final
        double calificacionTrabajoFinal = 90; // Calificación del trabajo final

        // Porcentajes de los componentes de la calificación final
        double porcentajeParciales = 0.55;
        double porcentajeExamenFinal = 0.30;
        double porcentajeTrabajoFinal = 0.15;

        // Calcular el promedio de los parciales
        double promedioParciales = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3;

        // Calcular la calificación final
        double calificacionFinal = (promedioParciales * porcentajeParciales) + 
                                   (calificacionExamenFinal * porcentajeExamenFinal) +
                                   (calificacionTrabajoFinal * porcentajeTrabajoFinal);

        // Imprimir la calificación final
        System.out.println("La calificación final en la materia de Algoritmos es: " + calificacionFinal);
    }
}