package Homework_1.Task_10;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        double a = 2.8, b = -0.3, c = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ x ის მნიშვნელობა");
        double x = scanner.nextDouble();

        double v = 0.0;

        if(x < 1.2) {
            v = a * Math.pow(x, 2) + (b * x) + c;
        } else if (x == 1.2) {
            v = a/x + Math.sqrt(Math.pow(x, 2) + 1);
        } else if (x > 1.2) {
            v = (a + (b * x)) / Math.sqrt(Math.pow(x, 2) + 1);
        }

        System.out.println("v(x) = " + v);
    }
}
