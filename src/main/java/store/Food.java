package store;

import java.time.LocalDate;

public class Food extends Product {
    private final LocalDate dateOfManufacture;

    public Food(String manufacturer, String name, double price) {
        super(manufacturer, name, price);
        this.dateOfManufacture = LocalDate.now();
    }

    @Override
    public String toString() {
        return super.toString() + "\ndate of manufacture: " + dateOfManufacture;
    }
}
