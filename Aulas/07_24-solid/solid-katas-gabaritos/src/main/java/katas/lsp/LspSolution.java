package katas.lsp;

interface Forma {
    int getArea();
}

class Retangulo implements Forma {
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

class Quadrado implements Forma {
    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return lado * lado;
    }
}
