package store;

public class Clothes extends Product {
    private String size;
    private String forWhom;
    private String color;

    public Clothes(String manufacturer, String name, double price, String size, String forWhom, String color) {
        super(manufacturer, name, price);
        this.size = size;
        this.forWhom = forWhom;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getForWhom() {
        return forWhom;
    }

    public void setForWhom(String forWhom) {
        this.forWhom = forWhom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsize: " + size +
                "\ncolor: " + color +
                "\ngender: " + forWhom;
    }
}
