package Homework_2.Task_18;

public class task_18 {
    public static void main(String[] args) {
        int[] A = {1,2,3,-1,-2,-3};
        int minA = A[0];

        for (int i = 0; i < A.length; i++) {
            if (minA > A[i]) {
                minA = A[i];
            }
        }
        for(int i = 0; i < A.length; i++) {
            if(A[i] < 0) {
                A[i] = minA;
            }
            if(A[i] > 0) {
                A[i] += 12;
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
