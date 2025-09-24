package katas.srp;

public class Fatura {
    private String cliente;
    private double valor;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}

class FaturaRepository {
    public void salvar(Fatura fatura) {
        System.out.println("Salvando fatura no banco: " + fatura.getCliente());
    }
}

class FaturaNotifier {
    public void enviarEmail(Fatura fatura) {
        System.out.println("Enviando e-mail para " + fatura.getCliente());
    }
}
