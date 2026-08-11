package pe.edu.vallegrande;

public class Calificacion {

    // Método para calcular el promedio de tres notas
    public double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para verificar si está aprobado (nota mínima es 13)
    public boolean estaAprobado(double promedio) {
        return promedio >= 13;
    }
}
