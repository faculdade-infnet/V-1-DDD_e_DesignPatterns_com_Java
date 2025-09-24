package katas.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFreteTest {
    @Test
    void testFreteSedex() {
        CalculadoraFrete calc = new CalculadoraFrete();
        assertEquals(15.0, calc.calcular("SEDEX", 10.0));
    }
}
