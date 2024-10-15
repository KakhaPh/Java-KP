package Homework_2.Task_17;

import java.util.Scanner;

public class task_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("მიუთითეთ მასივის სიგრძე (n): ");

        int n = scanner.nextInt();

        int[] A = new int[n];
        int lastNegativeElement = -1;
        int lastNegativeElementIndex = 0;
        for(int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(A[i] < 0) {
                lastNegativeElement = A[i];
                lastNegativeElementIndex = i;
            }
        }

        if(lastNegativeElement != -1) {
            System.out.println("მასივში ბოლო უარყოფითი ციფრი არის: " + lastNegativeElement);
            System.out.println("მასივში ბოლო უარყოფითი ციფრის ინდექსი არის: " + lastNegativeElementIndex);

        }else {
            System.out.print("არ არის!");
        }
    }
}
