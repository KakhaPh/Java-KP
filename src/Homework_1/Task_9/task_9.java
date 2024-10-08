package Homework_1.Task_9;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        double z = 5.5, c = 0.01, x = 4 * Math.cos(z) + Math.pow(Math.tan(c+1), 2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ t ის მნიშვნელობა: ");
        double t = scanner.nextDouble();

        double w = 0.0;

        if(t < 2) {
            w = Math.sqrt(Math.exp(2-x));
        } else if (t == 2) {
            w = 1 + Math.pow(z, 2) * x;
        } else if (t > 2) {
            w = 1/(Math.cos(c-4) + z);
        }

        System.out.println("w(t) =  " + w);
    }
}
