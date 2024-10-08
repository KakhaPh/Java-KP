package Homework_1.Task_13;

import java.util.Scanner;

public class task_13 {
    public static void main(String[] args) {
        double a = 1.5, b = 0.045, x = Math.cos(a) / b, z = Math.exp(a) / Math.log(a*b + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ t ის მნიშვნელობა: ");
        double t = scanner.nextDouble();

        double y = 0.0;

        if (t == 0) {
            y = Math.log(Math.abs(z + 1) +1 );
        } else if(t != 0) {
            y = Math.log(x+2) / 2 * Math.exp(x-1);
        }

        System.out.print("y(t) = " + y);
    }
}
