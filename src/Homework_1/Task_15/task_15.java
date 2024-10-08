package Homework_1.Task_15;

public class task_15 {
    public static void main(String[] args) {
        int number = 1;

        String textNumber = switch (number) {
            case 1 -> "ერთი";
            case 2 -> "ორი";
            case 3 -> "სამი";
            case 4 -> "ოთხი";
            case 5 -> "ხუთი";
            default -> "მიუთითეთ სხვა ციფრი";
        };

        System.out.println(number + " " + textNumber);
    }
}
