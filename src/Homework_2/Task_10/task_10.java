package Homework_2.Task_10;

public class task_10 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,-1,-2,-3,-4,};
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.pow(A[i], 2);
        }

        for(int numb : A) {
            System.out.print(numb + " ");
        }
    }
}
