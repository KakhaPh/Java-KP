package Homework_2.Task_6;

public class task_6 {
    public static void main(String[] args) {
        int[] C = {1,4,-1,-2,-3,-4};
        int sumOfPositives = 0;
        int j = 0;
        for(int i = 0; i < C.length; i++) {
            if(C[i] > 0) {
                sumOfPositives += C[i];
                j++;
            }
        }

        System.out.print((double) sumOfPositives / j);
    }
}
