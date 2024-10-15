package Homework_2.Task_15;

public class task_15 {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {4,5,6};
        int[] C = new int[A.length];
        int forC = 0;
        for(int i = 0; i < A.length; i++) {
            C[forC] = A[i] + B[i];
            forC++;
        }

        for(int i = 0; i < forC; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
