package Homework_2.Task_23;

public class task_23 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int maxOddA = A[0];
        for(int i = 0; i < A.length; i+=2) {
            if(A[0] < A[i]) {
                maxOddA = A[i];
            }
        }

        System.out.print(maxOddA);
    }
}
