package Homework_1.Task_11;

import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        double b = 7.0, c = 0.01, d = Math.log(b) + c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ x ის მნიშვნელობა: ");
        double x = scanner.nextDouble();

        double y = 0.0;

        if(x != 0) {
            y = (Math.cos(x + 1)) / Math.pow(x, 2);
        } else if(x == 0) {
            y = Math.log(Math.pow(x, 2) + 3);
        }

        System.out.print("y(x) = " + y);

    }
}
