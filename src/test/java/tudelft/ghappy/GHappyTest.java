package tudelft.ghappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GHappyTest {
    @Test
    public void testGHappyWithFirstG() {
        GHappy gHappy = new GHappy();

        // Caso con "g" en la primera posición
        String str = "ggxx";
        boolean result = gHappy.gHappy(str);

        // La salida debería ser verdadera porque las dos "g" son felices
        assertTrue(result);
    }

    @Test
    public void testGHappyWithSoloSingleG() {
        GHappy gHappy = new GHappy();

        // Caso con una sola "g"
        String str = "xgx";
        boolean result = gHappy.gHappy(str);

        // La salida debería ser falsa porque la "g" no está acompañada por otra "g"
        assertFalse(result);
    }

    @Test
    public void testGHappyWithEmptyString() {
        GHappy gHappy = new GHappy();

        // Caso con cadena vacía
        String str = "";
        boolean result = gHappy.gHappy(str);

        // La salida debería ser verdadera porque no hay "g" para ser infelices
        assertTrue(result);
    }
}
