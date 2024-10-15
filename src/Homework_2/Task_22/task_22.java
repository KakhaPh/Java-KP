package Homework_2.Task_22;

public class task_22 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        long multiplyOdds = 1;
        int sumEvens = 0;

        for (int i = 0; i < A.length; i+=2) {
            multiplyOdds *= A[i];
        }

        for (int i = 1; i < A.length; i+=2) {
            sumEvens += A[i];
        }

        System.out.print(multiplyOdds+"\n");
        System.out.print(sumEvens);

    }
}
