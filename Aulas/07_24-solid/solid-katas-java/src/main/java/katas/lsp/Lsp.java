package katas.lsp;

public class Retangulo {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return largura * altura;
    }
}

class Quadrado extends Retangulo {
    @Override
    public void setLargura(int tamanho) {
        super.setLargura(tamanho);
        super.setAltura(tamanho);
    }

    @Override
    public void setAltura(int tamanho) {
        super.setAltura(tamanho);
        super.setLargura(tamanho);
    }
}
