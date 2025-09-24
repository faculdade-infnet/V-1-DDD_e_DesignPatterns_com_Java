package katas.srp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaturaTest {

    @Test
    void deveCriarFaturaValida() {
        Fatura fatura = new Fatura("João", 150.0);
        assertEquals("João", fatura.getCliente());
        assertEquals(150.0, fatura.getValor());
    }
}
