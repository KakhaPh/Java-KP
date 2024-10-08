package Homework_1.Task_6;

public class task_6 {
    public static void main(String[] args) {
        double a = 3.1, b = 2.5, c = 5.1;
        double sum, multiply;
        sum = (double) (a + b + c);
        multiply = (double) (a * b * c);

        double minimum = Math.min(sum, multiply);

        System.out.print(minimum);
    }
}
