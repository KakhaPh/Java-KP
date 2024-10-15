package Homework_2.Task_21;

public class task_21 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int[] B = new int[A.length];
        int[] C = new int[A.length];
        int j = 0;
        int k = 0;

        for (int i = 0; i < A.length; i+=2) {
            B[j] = A[i];
            j++;
        }
        for (int i = 1; i < A.length; i+=2) {
            C[k] = A[i];
            k++;
        }

        for(int i = 0; i < j; i++){
            System.out.print(B[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < k; i++){
            System.out.print(C[i] + " ");
        }
    }
}
