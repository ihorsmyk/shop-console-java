package store;

import java.util.ArrayList;
import java.util.Scanner;

public class Store implements IStore {
    String name;
    private ArrayList<Product> products;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public Store(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void deleteProduct(Product product) {
        this.products.remove(product);
    }

    public String getDataByIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the index of the product:");
        int index = 0;
        try {
            index = Integer.parseInt(scanner.nextLine().trim().replace("\n", ""));
            if (index < 0 || index > products.size()) {
                throw new RuntimeException("there is no product for this index, please try again!\n");
            }
        } catch (RuntimeException e) {
            System.out.println("there is no product for this index, please try again!\n");
            return null;
        }
        return products.get(index).toString() + "\n";
    }

    public StringBuilder getListOfNames() {
        StringBuilder listOfProducts = new StringBuilder();
        if (products.isEmpty()) {
            listOfProducts.append("there are no products available!");
        } else {
            for (int i = 0; i < products.size(); i++) {
                listOfProducts.append(i + ": " + products.get(i).getName() + ' ' +
                        products.get(i).getManufacturer() + "\n");
            }
        }
        return listOfProducts;
    }

    @Override
    public String toString() {
        StringBuilder storeStr;
        if (products.isEmpty()) {
            storeStr = new StringBuilder("STORE: " + name + "\nthere are no products available!");
        } else {
            storeStr = new StringBuilder("STORE: " + name + "\nproducts are available: ");
            for (Product product : products) {
                storeStr.append(product);
            }
        }
        return storeStr.toString();
    }
}
