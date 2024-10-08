package Homework_1.Task_19;

public class task_19 {
    public static void main(String[] args) {
        double radius = 5.0;
        char option = 'a';

        switch (option) {
            case 'l':
                double length = 2 * Math.PI * radius;
                System.out.println("სიგრძე: " + length);
                break;
            case 'd':
                double diameter = 2 * radius;
                System.out.println("დიამეტრიr: " + diameter);
                break;
            case 'a':
                double area = Math.PI * radius * radius;
                System.out.println("ფართობი: " + area);
                break;
            default:
                System.out.println("არასწორი მნიშვნელობა!");
                break;
        }
    }
}
