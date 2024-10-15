package Homework_2.Task_5;

public class task_5 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,-1,-2,-3,-4,5,6,7,8,-5,-6,-7,-8};
        int [] C = new int[A.length];
        int j = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0) {
                C[j] = A[i];
                j++;
            }
        }

        for(int i = 0; i < j; i++) {
            System.out.print(C[i]);
        }
    }
}
