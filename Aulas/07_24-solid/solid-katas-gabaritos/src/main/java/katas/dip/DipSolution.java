package katas.dip;

interface RelatorioFormatter {
    void formatar(String conteudo);
}

class RelatorioPDF implements RelatorioFormatter {
    public void formatar(String conteudo) {
        System.out.println("Formatando como PDF: " + conteudo);
    }
}

class RelatorioService {
    private RelatorioFormatter formatter;

    public RelatorioService(RelatorioFormatter formatter) {
        this.formatter = formatter;
    }

    public void gerarRelatorio(String conteudo) {
        formatter.formatar(conteudo);
    }
}
