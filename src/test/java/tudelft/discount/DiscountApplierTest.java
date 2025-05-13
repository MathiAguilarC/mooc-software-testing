package tudelft.discount;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    private ProductDao dao;
    private DiscountApplier discountApplier;

    @BeforeEach
    void setUp() {
        // Simulamos el ProductDao usando Mockito
        dao = mock(ProductDao.class);
        discountApplier = new DiscountApplier(dao);
    }

    @Test
    void testSetNewPricesHome() {
        // Crear productos con categorías "HOME" y "BUSINESS"
        Product p1 = new Product("Product1", 100.0, "HOME");
        Product p2 = new Product("Product2", 200.0, "BUSINESS");

        // Simulamos que dao.all() retorne la lista de productos
        when(dao.all()).thenReturn(Arrays.asList(p1, p2));

        // Aplicar los nuevos precios
        discountApplier.setNewPrices();

        // Verificar que el precio de "HOME" se ha actualizado al 90% del original
        assertEquals(90.0, p1.getPrice());

        // Verificar que el precio de "BUSINESS" se ha actualizado al 110% del original
        assertEquals(220.0, p2.getPrice());
    }

    @Test
    void testSetNewPricesNoProducts() {
        // Simulamos que no hay productos en la base de datos
        when(dao.all()).thenReturn(Arrays.asList());

        // Aplicar los nuevos precios (aunque no hay productos)
        discountApplier.setNewPrices();

        // Verificar que no se haya modificado nada
        verify(dao, times(1)).all(); // Verificamos que dao.all() fue llamado una vez
    }
}
