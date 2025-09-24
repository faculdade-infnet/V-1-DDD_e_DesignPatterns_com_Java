package katas.dip;

import org.junit.jupiter.api.Test;

public class RelatorioServiceTest {

    @Test
    void deveFormatarComoPDF() {
        RelatorioFormatter formatter = new RelatorioPDF();
        RelatorioService service = new RelatorioService(formatter);
        service.gerarRelatorio("Relatório de vendas");
    }
}
