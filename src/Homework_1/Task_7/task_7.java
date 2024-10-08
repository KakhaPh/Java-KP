package Homework_1.Task_7;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        double a = -0.5;
        double b = 2.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ t ს მნიშვნელობა: ");
        double t = scanner.nextDouble();

        double y = 0.0;

        if (t < 1) {
            y = 1;
        } else if (t >= 1 && t <= 2) {
            y = a * Math.pow(t, 2) * Math.log(t);
        } else if (t > 2) {
            y = Math.exp(a * t) * Math.cos(b*t);
        }

        System.out.println("y(t) = " + y);
    }
}
