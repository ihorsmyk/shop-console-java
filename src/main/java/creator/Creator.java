package creator;

import store.Appliance;
import store.Clothes;
import store.Food;
import store.Product;

import java.util.Scanner;

public class Creator {
    public static Product addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of the product:");
        String name = scanner.nextLine().trim().replace("\n", "");

        System.out.println("enter the name of the manufacturer:");
        String manufacturer = scanner.nextLine().trim().replace("\n", "");

        System.out.println("enter the price of the product:");
        double price = 0.0;
        try {
            price = Double.parseDouble(scanner.nextLine().trim().replace("\n", ""));
        } catch (RuntimeException e) {
            System.out.println("the price is incorrect, product not added!");
            return null;
        }
        Product food = new Food(manufacturer, name, price);
        System.out.println(name + " added to store\n");
        return food;
    }

    public static Product addClothes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the type of the clothes:");
        String name = scanner.nextLine().trim().replace("\n", "");

        System.out.println("enter the name of the manufacturer:");
        String manufacturer = scanner.nextLine().trim().replace("\n", "");

        System.out.println("enter the price of the clothes:");
        double price = 0.0;
        try {
            price = Double.parseDouble(scanner.nextLine().trim().replace("\n", ""));
        } catch (RuntimeException e) {
            System.out.println("the price is incorrect, goods not added!");
            return null;
        }
        System.out.println("enter a size of this one:");
        String size = scanner.nextLine().trim().replace("\n", "");

        System.out.println("is this men's or women's clothes?:");
        String gender = scanner.nextLine().trim().replace("\n", "");

        System.out.println("enter a color of this one:");
        String color = scanner.nextLine().trim().replace("\n", "");

        Product clothes = new Clothes(manufacturer, name, price, size, gender, color);
        System.out.println(name + " added to store\n");
        return clothes;
    }

    public static Product addAppliance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of the device:");
        String name = scanner.nextLine().trim().replace("\n", "");

        System.out.println("enter the name of the manufacturer:");
        String manufacturer = scanner.nextLine().trim().replace("\n", "");

        System.out.println("enter the price of this device:");
        double price = 0.0;
        try {
            price = Double.parseDouble(scanner.nextLine().trim().replace("\n", ""));
        } catch (RuntimeException e) {
            System.out.println("the price is incorrect, appliance not added!");
            return null;
        }
        System.out.println("enter a model of this one:");
        String model = scanner.nextLine().trim().replace("\n", "");

        Product device = new Appliance(manufacturer, name, price, model);
        System.out.println(name + " added to store\n");
        return device;
    }
}
