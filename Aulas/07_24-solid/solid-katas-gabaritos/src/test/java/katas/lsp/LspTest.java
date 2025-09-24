package katas.lsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FormaTest {

    @Test
    void deveCalcularAreaRetangulo() {
        Retangulo r = new Retangulo();
        r.setLargura(4);
        r.setAltura(5);
        assertEquals(20, r.getArea());
    }

    @Test
    void deveCalcularAreaQuadrado() {
        Quadrado q = new Quadrado();
        q.setLado(4);
        assertEquals(16, q.getArea());
    }
}
