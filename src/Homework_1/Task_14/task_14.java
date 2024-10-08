package Homework_1.Task_14;

import java.util.Scanner;

public class task_14 {
    public static void main(String[] args) {
        double x = -3, c = 1.2, b = (Math.sqrt(2*Math.PI*Math.pow(x, 3)) * Math.sin(x)) / (x-c);
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ t - ს მნიშვნელობა: ");
        double t = scanner.nextDouble();
        double y = 0.0;

        if(t < -1) {
            y = x;
        } else if (t >= -1 && t <= 1) {
            y = (2 * Math.sqrt(Math.exp(-b))) / Math.exp(b) + 1;
        } else if (t > 1) {
            y = (Math.sin(b+1) + 1) / Math.exp(-(b+1));
        }

        System.out.print("y(t) = " + y);
    }
}
