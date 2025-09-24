package katas.dip;

public class RelatorioService {
    public void gerarRelatorio() {
        RelatorioPDF pdf = new RelatorioPDF();
        pdf.formatar("Relatório anual");
    }
}

class RelatorioPDF {
    public void formatar(String conteudo) {
        System.out.println("Formatando como PDF: " + conteudo);
    }
}
