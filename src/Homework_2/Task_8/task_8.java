package Homework_2.Task_8;

public class task_8 {
    public static void main(String[] args) {
        int[] B = {1,2,3,4,-1,-2,-3,-4,};
        for (int i = 0; i < B.length; i++) {
            B[i] = B[i] * -1;
        }

        for(int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
