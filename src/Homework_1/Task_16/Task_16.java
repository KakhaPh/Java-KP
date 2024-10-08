package Homework_1.Task_16;

public class Task_16 {
    public static void main(String[] args) {
        char letter = 'i';

        String k = switch (letter) {
            case 'a', 'e', 'i', 'o', 'u' -> "ხმოვანი";
            case 'y', 'w' -> "ნახევრად ხმოვანი";
            default -> "თანხმოვანი";
        };

        System.out.print(k);
    }
}
