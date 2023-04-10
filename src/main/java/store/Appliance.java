package store;

public class Appliance extends Product {
    private String model;

    public Appliance(String manufacturer, String name, double price, String model) {
        super(manufacturer, name, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + "\nmodel: " + model;
    }
}
