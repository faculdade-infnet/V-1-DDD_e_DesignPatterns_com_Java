package katas.dip;

import org.junit.jupiter.api.Test;

public class RelatorioServiceTest {
    @Test
    void testGerarRelatorio() {
        RelatorioService service = new RelatorioService();
        service.gerarRelatorio();
    }
}
