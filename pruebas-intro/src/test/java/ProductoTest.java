import pe.edu.vallegrande.producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProductoTest {

    // Casos para calcularPromedio
    @Test
    void probarCalcularPromedio_Caso1() {
        producto p = new producto("Test", 0);
        double resultado = p.calcularPromedio(15, 14, 16);
        assertEquals(15, resultado);
    }

    @Test
    void probarCalcularPromedio_Caso2() {
        producto p = new producto("Test", 0);
        double resultado = p.calcularPromedio(10, 12, 14);
        assertEquals(12, resultado);
    }

    @Test
    void probarCalcularPromedio_Caso3() {
        producto p = new producto("Test", 0);
        double resultado = p.calcularPromedio(20, 18, 16);
        assertEquals(18, resultado);
    }

    // Casos para estaAprobado
    @Test
    void probarEstaAprobado_Caso1() {
        producto p = new producto("Test", 0);
        boolean resultado = p.estaAprobado(15);
        assertTrue(resultado);
    }

    @Test
    void probarEstaAprobado_Caso2_Limite() {
        producto p = new producto("Test", 0);
        boolean resultado = p.estaAprobado(13);
        assertTrue(resultado);
    }

    @Test
    void probarEstaAprobado_Caso3() {
        producto p = new producto("Test", 0);
        boolean resultado = p.estaAprobado(12);
        assertFalse(resultado);
    }

    @Test
    void probarEstaAprobado_Caso4() {
        producto p = new producto("Test", 0);
        boolean resultado = p.estaAprobado(5);
        assertFalse(resultado);
    }

    // Reto octavo caso: Evalua 12.9 para verificar que no redondee hacia arriba por error
    @Test
    void probarEstaAprobado_Caso8_Justificado() {
        producto p = new producto("Test", 0);
        boolean resultado = p.estaAprobado(12.9);
        assertFalse(resultado);
    }
}
