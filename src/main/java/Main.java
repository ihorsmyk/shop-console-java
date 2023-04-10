import creator.Creator;
import store.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("!!ADD NEW SHOP!!");
        System.out.println("please, enter a name of the shop:");

        String shopName = scanner.nextLine().trim();
        Store store = new Store(shopName);

        boolean next = false;

        do {
            System.out.println("make your choice:");
            System.out.println("1 - add food to product list");
            System.out.println("2 - add clothes to product list");
            System.out.println("3 - add appliance to product list");
            System.out.println("4 - see the list of added products in the shop");
            System.out.println("5 - see all data about the selected product by index");
            System.out.println("0 - finish adding, and view the full list of products");

            String choice = scanner.nextLine();

            switch (choice) {
                case "0":
                    next = true;
                    break;
                case "1":
                    Product food = Creator.addFood();
                    if (food != null) {
                        store.addProduct(food);
                    }
                    break;
                case "2":
                    Product clothes = Creator.addClothes();
                    if (clothes != null) {
                        store.addProduct(clothes);
                    }
                    break;
                case "3":
                    Product appliance = Creator.addAppliance();
                    if (appliance != null) {
                        store.addProduct(appliance);
                    }
                    break;
                case "4":
                    System.out.println(store.getListOfNames());
                    break;
                case "5":
                    String data = store.getDataByIndex();
                    if (data != null) {
                        System.out.println(data);
                    }
                    break;
                default:
                    System.out.println("invalid choice please try again!");
            }
        } while (!next);

        System.out.println(store.toString());
    }
}
