package Homework_8.Task_2;

import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "პროდუქტი: " + name + "', ფასი: " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1-დაამატე პროდუქტის სახელი და ფასი, 2-წაშლა სახელით, 3-ძებნა, 4-ბეჭდვა, 5-გამოსვლა");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("შეიყვანეთ პროდუქტის სახელი: ");
                    String name = scanner.nextLine();
                    System.out.print("შეიყვანეთ პროდუქტის ფასი: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    products.add(new Product(name, price));
                    break;
                case 2:
                    System.out.print("შეიყვანეთ პროდუქტის სახელი, რომელიც უნდა წაიშალოს: ");
                    String nameToRemove = scanner.nextLine();
                    products.removeIf(product -> product.name.equals(nameToRemove));
                    break;
                case 3:
                    System.out.print("შეიყვანეთ პროდუქტის სახელი, რომ მოძებნოთ: ");
                    String nameToSearch = scanner.nextLine();
                    boolean found = false;
                    for (Product product : products) {
                        if (product.name.equals(nameToSearch)) {
                            System.out.println("პოვნილია: " + product);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("პროდუქტი ვერ მოიძებნა.");
                    }
                    break;
                case 4:
                    products.sort(Comparator.comparing(product -> product.name));
                    System.out.println("დალაგებული სია:");
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 5:
                    System.out.println("გამოსვლა...");
                    return;
                default:
                    System.out.println("არასწორი ჩანაწერი;");
            }
        }
    }
}
