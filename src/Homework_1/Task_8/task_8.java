package Homework_1.Task_8;

import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        double a = 1.5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი: ");
        double x = scanner.nextDouble();

        double y = 0.0;

        if (x < 1.3) {
            y = a * Math.pow(x, 2) - 7 / Math.pow(x, 2);
        } else if (x == 1.3){
            y = a * Math.pow(x, 2) + 7 * Math.sqrt(x);
        } else if (x > 1.3) {
            y = Math.log(x + 7 * Math.sqrt(Math.abs(x + a)));
        }

        System.out.println("y(y) = " + y);

    }
}
