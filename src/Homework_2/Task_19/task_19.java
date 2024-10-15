package Homework_2.Task_19;

import java.util.Scanner;

public class task_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("მიუთითეთ მასივის სიგრძე: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        int countPositives = 0;

        boolean containsZero = false;

        while(!containsZero) {
            System.out.print("შეიყვანეთ მასივის ელემენტები(აუცილებელია შეიცავდეს 1 ნულს მაინც): ");
            for(int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
                if(A[i] == 0) {
                    containsZero = true;
                }
            }
            if(!containsZero) {
                System.out.print("აუცილებელია შეიცავდეს 1 ნულს მაინც!");
            }
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                break;
            }
            if(A[i] > 0) {
                countPositives++;
            }
        }

        System.out.print("დადებითი წევრების რაოდენობა ნულამდე " + countPositives);

    }
}
