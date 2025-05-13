package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {

    @Test
    public void testInvalidCharacter() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();

        // Caso con un carácter no válido en el mensaje
        String result = cipher.CaesarShiftCipher("abc@def", 3);

        // Se espera que el resultado sea "invalid"
        assertEquals("invalid", result);
    }

    @Test
    public void testValidShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();

        // Caso válido con desplazamiento de 3
        String result = cipher.CaesarShiftCipher("abc", 3);

        // El resultado esperado es "def"
        assertEquals("def", result);
    }

    @Test
    public void testNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();

        // Caso con desplazamiento negativo
        String result = cipher.CaesarShiftCipher("def", -3);

        // El resultado esperado es "abc"
        assertEquals("abc", result);
    }

}
