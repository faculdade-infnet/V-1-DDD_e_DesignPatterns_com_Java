package katas.isp;

interface Funcionario {
    void trabalhar();
    void comer();
}

class Robo implements Funcionario {
    public void trabalhar() {
        System.out.println("Robô trabalhando.");
    }

    public void comer() {
        throw new UnsupportedOperationException("Robôs não comem!");
    }
}
