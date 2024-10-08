package Homework_1.Task_17;

public class task_17 {
    public static void main(String[] args) {
        char letter = 'p';

        String k = switch (letter) {
            case 'r' -> "red_წითელი";
            case 'g' -> "green_მწვანე";
            case 'y' -> "yellow_ყვითელი";
            case 'p' -> "purple_იასამნისფერი";
            default -> "ფერის განსაზღვრა შეუძლებელია";
        };

        System.out.print(k);
    }
}
