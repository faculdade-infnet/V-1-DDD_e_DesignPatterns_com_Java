package katas.srp;

public class Fatura {
    public void gerar(String cliente, double valor) {
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor: " + valor);
        salvarNoBanco(cliente, valor);
        enviarEmail(cliente);
    }

    private void salvarNoBanco(String cliente, double valor) {
        System.out.println("Salvando no banco...");
    }

    private void enviarEmail(String cliente) {
        System.out.println("Enviando e-mail para " + cliente);
    }
}
