package Homework_2.Task_12;

public class task_12 {
    public static void main(String[] args) {
        int[] A = {1,3,5,-1,10,2,4};
        int[] B = {1,3,5738,-1,-1,2,4};
        int maxA = A[0];
        int maxB = B[0];

        for(int i = 0; i < A.length; i++) {
            if(A[i] > maxA) {
                maxA = A[i];
            }
            if(A[i] > maxB) {
                maxB = B[i];
            }
        }

        System.out.print(maxA + maxB);
    }
}
