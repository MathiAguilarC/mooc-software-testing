package tudelft.sum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void testAddTwoNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();

        // Ejemplo 1: 12 + 34
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3, 4));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);
        assertEquals(Arrays.asList(5, 6), result);  // 12 + 34 = 46

        // Ejemplo 2: 9 + 1 con acarreo
        first = new ArrayList<>(Arrays.asList(9));
        second = new ArrayList<>(Arrays.asList(1));
        result = sum.addTwoNumbers(first, second);
        assertEquals(Arrays.asList(1, 0), result);  // 9 + 1 = 10

        // Ejemplo 3: 99 + 11 con acarreo
        first = new ArrayList<>(Arrays.asList(9, 9));
        second = new ArrayList<>(Arrays.asList(1, 1));
        result = sum.addTwoNumbers(first, second);
        assertEquals(Arrays.asList(1, 1, 0), result);  // 99 + 11 = 110
    }
}
