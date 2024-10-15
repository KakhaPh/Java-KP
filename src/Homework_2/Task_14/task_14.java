package Homework_2.Task_14;

public class task_14 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        System.out.print((double) sum / A.length);
    }
}
