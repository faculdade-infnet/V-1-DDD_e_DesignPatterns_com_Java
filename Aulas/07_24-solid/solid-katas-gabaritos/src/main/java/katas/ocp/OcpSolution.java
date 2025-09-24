package katas.ocp;

interface Frete {
    double calcular(double peso);
}

class FreteSedex implements Frete {
    public double calcular(double peso) {
        return peso * 1.5;
    }
}

class FretePAC implements Frete {
    public double calcular(double peso) {
        return peso * 1.2;
    }
}

class CalculadoraFrete {
    public double calcular(Frete frete, double peso) {
        return frete.calcular(peso);
    }
}
