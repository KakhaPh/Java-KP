package Homework_1.Task_18;

public class task_18 {
    public static void main(String[] args) {
        int a = 3, b = 4;
        double area = 0, perimeter = 0;

        char ps = 's';

        switch (Character.toLowerCase(ps)) {
            case 's':
                area = a * b;
                System.out.println("ფართობი: " + area);
                break;
            case 'p':
                perimeter = 2 * (a + b);
                System.out.println("პერიმეტრი: " + perimeter);
                break;
            default:
                System.out.println("Bye-bye!");
                break;
        }
    }
}
