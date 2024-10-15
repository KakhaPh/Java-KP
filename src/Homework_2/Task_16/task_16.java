package Homework_2.Task_16;

public class task_16 {
    public static void main(String[] args){
        int[] A = {1,2,5,1,1,2,3,5,6,1,1,2,34,56,1,1,5,5,4,1,1,23,3,3,1};
        int averageOddIndexNumbs = 0;
        int count = 0;

        for(int i = 0; i < A.length; i+=2) {
            if(A[i] > 0) {
                averageOddIndexNumbs += A[i];
                count++;
            }
        }

        System.out.print((double) averageOddIndexNumbs / count);
    }
}
