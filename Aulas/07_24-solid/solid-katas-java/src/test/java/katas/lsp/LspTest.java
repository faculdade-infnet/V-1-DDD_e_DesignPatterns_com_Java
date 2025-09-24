package katas.lsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {
    @Test
    void testRetanguloArea() {
        Retangulo r = new Retangulo();
        r.setLargura(4);
        r.setAltura(5);
        assertEquals(20, r.getArea());
    }

    @Test
    void testQuadradoArea() {
        Retangulo q = new Quadrado();
        q.setLargura(4);
        q.setAltura(5);
        // Resultado inesperado, ilustra quebra do LSP
        assertNotEquals(20, q.getArea());
    }
}
