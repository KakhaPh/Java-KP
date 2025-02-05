package MFinalExamPractice.Task_3;

import java.util.Scanner;

public class DivideBySumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ სამნიშნა რიცხვი: ");
        int number = scanner.nextInt();

        if(number < 100 || number > 999) {
            System.out.println("გთხოვთ შეიყვანეთ სამნიშნა რიცხვი!");
        } else {
            try {
                int hundreds = number / 100;
                int tens = (number / 10) % 10;
                int ones = number % 10;

                System.out.println(hundreds);
                System.out.println(tens);
                System.out.println(ones);
                int sumOfDigits = hundreds + tens + ones;

                if (sumOfDigits == 0) {
                    throw new ArithmeticException("ციფრების ჯამი უდრის ნულს, ნულზე გაყოფა არ შეიძლება!");
                }

                double result = (double) number / sumOfDigits;

                System.out.println("შედეგი: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
