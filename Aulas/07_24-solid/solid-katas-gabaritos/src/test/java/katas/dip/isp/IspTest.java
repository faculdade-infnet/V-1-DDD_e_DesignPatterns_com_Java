package katas.isp;

import org.junit.jupiter.api.Test;

public class TrabalhadorTest {

    @Test
    void humanoTrabalhaECome() {
        Humano h = new Humano();
        h.trabalhar();
        h.comer();
    }

    @Test
    void roboTrabalha() {
        Robo r = new Robo();
        r.trabalhar();
    }
}
