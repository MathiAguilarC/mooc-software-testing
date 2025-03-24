package tudelft.numfinder;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumFinderMainTest {

    @Test
    void testFallaConNumerosDecrecientes() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{4, 3, 2, 1});

        // Este test demuestra el error original si el código tiene "else if"
        assertEquals(4, nf.getLargest(), "El valor mayor debería ser 4");
        assertEquals(1, nf.getSmallest(), "El valor menor debería ser 1");
    }

}