package katas.srp;

import org.junit.jupiter.api.Test;

public class FaturaTest {
    @Test
    void testGerarFatura() {
        Fatura fatura = new Fatura();
        fatura.gerar("João", 150.0);
    }
}
