package Classwork_8.Task_5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action: 1-Add, 2-Remove, 3-Search, 4-Print Sorted, 5-Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to add: ");
                    String toAdd = scanner.nextLine();
                    list.add(toAdd);
                    break;
                case 2:
                    System.out.print("Enter a string to remove: ");
                    String toRemove = scanner.nextLine();
                    list.remove(toRemove);
                    break;
                case 3:
                    System.out.print("Enter a string to search: ");
                    String toSearch = scanner.nextLine();
                    System.out.println(list.contains(toSearch) ? "Found" : "Not Found");
                    break;
                case 4:
                    Collections.sort(list);
                    System.out.println("Sorted List: " + list);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
