package katas.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoboTest {
    @Test
    void testComerDeveFalhar() {
        Robo robo = new Robo();
        assertThrows(UnsupportedOperationException.class, robo::comer);
    }
}
