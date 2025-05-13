package tudelft.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier(ProductDao dao) {
        this.dao = dao;
    }

    public void setNewPrices() {
        for (Product product : dao.all()) {
            double newPrice = product.getPrice();

            if (product.getCategory().equals("BUSINESS")) {
                // El precio de "BUSINESS" debe ser el 110% del original (aumentar el precio)
                newPrice = newPrice * 1.1;
            } else if (product.getCategory().equals("HOME")) {
                // El precio de "HOME" debe ser el 90% del original (disminuir el precio)
                newPrice = newPrice * 0.9;
            }

            // Redondear el precio a 2 decimales usando BigDecimal
            BigDecimal roundedPrice = new BigDecimal(newPrice).setScale(2, RoundingMode.HALF_UP);

            // Establecer el nuevo precio redondeado
            product.setPrice(roundedPrice.doubleValue());
        }
    }
}
