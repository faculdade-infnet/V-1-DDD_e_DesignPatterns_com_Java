package katas.ocp;

public class CalculadoraFrete {
    public double calcular(String tipo, double peso) {
        if (tipo.equals("SEDEX")) {
            return peso * 1.5;
        } else if (tipo.equals("PAC")) {
            return peso * 1.2;
        }
        return peso;
    }
}
