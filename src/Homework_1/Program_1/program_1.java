package Homework_1.Program_1;
import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ ციფრი 1-დან 12-მდე: ");

        int month = scanner.nextInt();
        scanner.close();

        String season = switch (month) {
            case 12, 1, 2 -> "ზამთარი";
            case 3, 4, 5 -> "გაზაფხული";
            case 6, 7, 8 -> "ზაფხული";
            case 9, 10, 11 -> "შემოდგომა";
            default -> "არასწორი თვე!";
        };

        System.out.print(season);
    }
}
