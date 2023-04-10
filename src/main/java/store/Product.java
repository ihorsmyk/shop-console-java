package store;

public abstract class Product {
    private String manufacturer;
    private String name;
    private double price;

    public Product(String manufacturer, String name, double price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "-".repeat(28) +
                "\nProduct: " + name +
                "\nmanufacturer: " + manufacturer +
                "\nprice: " + price;
    }
}

