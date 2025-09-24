package katas.isp;

interface Trabalhador {
    void trabalhar();
}

interface Comedor {
    void comer();
}

class Humano implements Trabalhador, Comedor {
    public void trabalhar() {
        System.out.println("Humano trabalhando.");
    }

    public void comer() {
        System.out.println("Humano comendo.");
    }
}

class Robo implements Trabalhador {
    public void trabalhar() {
        System.out.println("Robô trabalhando.");
    }
}
