package Homework_2.Task_20;

public class task_20 {
    public static void main(String[] args){
        int[] A = {3,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] B = new int[A.length];
        int[] C = new int[A.length];
        int j = 0;
        int k = 0;
        for(int i = 0; i<A.length; i++) {
            if(i < 5) {
                B[j] = A[i];
                j++;
            } else {
                C[k] = A[i];
                k++;
            }
        }

        for(int i = 0; i < j; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.print("\n");
        for(int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
