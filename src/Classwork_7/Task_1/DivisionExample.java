package Classwork_7.Task_1;

public class DivisionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: ნულზე გაყოფა დაუშვებელია!");
        }
    }
}
