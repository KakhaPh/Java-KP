package Homework_2.Task_9;

public class task_9 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,-1,-2,-3,-4,};
        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0) {
                A[i] = 1;
            } else {
                A[i] = 0;
            }
        }

        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
}
