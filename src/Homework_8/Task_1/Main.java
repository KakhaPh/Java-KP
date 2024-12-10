package Homework_8.Task_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Student = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("1-დამატება, 2-წაშლა, 3-ძებნა, 4-ბეჭდვა, 5-გამოსვლა");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("შეიყვანეთ სტუდენტის სახელი: ");
                    String toAdd = scanner.nextLine();
                    if (Student.contains(toAdd)) {
                        System.out.println("სტუდენტი უკვე არსებობს ამ სიაში.");
                    } else {
                        Student.add(toAdd);
                        System.out.println("სტუდენტი წარმატებით დაემატა.");
                    }
                case 2:
                    System.out.print("შეიყვანეთ სტუდენტის სახელი რომელიც უნდა წაიშალოს: ");
                    String toRemove = scanner.nextLine();
                    Student.remove(toRemove);
                    System.out.println("სტუდენტი წარმატებით წაიშალა.");
                    break;
                case 3:
                    System.out.println("შეიყვანეთ სახელი მოსაძებნად: ");
                    String toSearch = scanner.nextLine();
                    System.out.println(Student.contains(toSearch) ? "სტუდენტი სიაშია" : "სტუდენტი ვერ მოიძებნა");
                    break;
                case 4:
                    Collections.sort(Student);
                    System.out.println("დალაგებული სია: " + Student);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("არასწორი ჩანაწერი;");
            }
        }
    }
}
