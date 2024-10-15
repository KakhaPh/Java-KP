package Homework_2.Task_7;

public class task_7 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,-1,-2,-3,-4, 5, 6, 7, 8, -5, -6, -7, -8};
        int[] B = new int[A.length];
        int[] C = new int[A.length];
        int j = 0;
        int k = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0) {
                B[j] = A[i];
                j++;
            } else {
                C[k] = A[i];
                k++;
            }
        }

        System.out.println("დადებითი ელემენტების მასივი");
        for(int i = 0; i < j; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println("\nუარყოფითი ელემენტების მასივი:");
        for(int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }

    }
}
