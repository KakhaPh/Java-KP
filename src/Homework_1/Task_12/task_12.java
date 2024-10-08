package Homework_1.Task_12;

import java.util.Scanner;

public class task_12 {
    public static void main(String[] args) {
        double a = 2.5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ x ის მნიშვნელობა");
        double x = scanner.nextDouble();
        double w = 0.0;

        if (x > a) {
            w = x * Math.sqrt(Math.sqrt(x-a));
        } else if (x == a) {
            w = x * Math.sin(a*x);
        } else if (x < a) {
            w = Math.exp(-a*x) * Math.cos(a*x);
        }

        System.out.print("w(x) = " + w);
    }
}
