package katas.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFreteTest {

    @Test
    void deveCalcularFretePAC() {
        CalculadoraFrete calc = new CalculadoraFrete();
        Frete pac = new FretePAC();
        assertEquals(12.0, calc.calcular(pac, 10.0));
    }

    @Test
    void deveCalcularFreteSedex() {
        CalculadoraFrete calc = new CalculadoraFrete();
        Frete sedex = new FreteSedex();
        assertEquals(15.0, calc.calcular(sedex, 10.0));
    }
}
