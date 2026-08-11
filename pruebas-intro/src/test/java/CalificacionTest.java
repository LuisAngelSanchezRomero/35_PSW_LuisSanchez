import pe.edu.vallegrande.Calificacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalificacionTest {

    // Casos para calcularPromedio
    @Test
    void probarCalcularPromedio_Caso1() {
        Calificacion c = new Calificacion();
        double resultado = c.calcularPromedio(15, 14, 16);
        assertEquals(15, resultado);
    }

    @Test
    void probarCalcularPromedio_Caso2() {
        Calificacion c = new Calificacion();
        double resultado = c.calcularPromedio(10, 12, 14);
        assertEquals(12, resultado);
    }

    @Test
    void probarCalcularPromedio_Caso3() {
        Calificacion c = new Calificacion();
        double resultado = c.calcularPromedio(20, 18, 16);
        assertEquals(18, resultado);
    }

    // Casos para estaAprobado
    @Test
    void probarEstaAprobado_Caso1() {
        Calificacion c = new Calificacion();
        boolean resultado = c.estaAprobado(15);
        assertTrue(resultado);
    }

    @Test
    void probarEstaAprobado_Caso2_Limite() {
        Calificacion c = new Calificacion();
        boolean resultado = c.estaAprobado(13);
        assertTrue(resultado); // Límite exacto: 13 >= 13 → aprobado
    }

    @Test
    void probarEstaAprobado_Caso3() {
        Calificacion c = new Calificacion();
        boolean resultado = c.estaAprobado(12);
        assertFalse(resultado);
    }

    @Test
    void probarEstaAprobado_Caso4() {
        Calificacion c = new Calificacion();
        boolean resultado = c.estaAprobado(5);
        assertFalse(resultado);
    }

    // Reto - Octavo caso: Verifica que 12.9 no redondea hacia 13
    @Test
    void probarEstaAprobado_Caso8_Justificado() {
        Calificacion c = new Calificacion();
        boolean resultado = c.estaAprobado(12.9);
        assertFalse(resultado);
    }
}
