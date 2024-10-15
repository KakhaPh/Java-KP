package Homework_2.Task_13;

public class task_13 {
    public static void main(String[] args) {
        int[] B = {1,2,3,4,5,6,6,7,8,9,10,11};
        int[] A = new int[B.length];
        int[] C = new int[B.length];
        int j = 0;
        int k = 0;

        for(int i = 0; i < B.length; i++) {
            if(B[i] % 2 == 0) {
                A[j] = B[i];
                j++;
            }
            if(B[i] % 2 != 0){
                C[k] = B[i];
                k++;
            }
        }

        System.out.print("ლუწი რიცხვები:");
        for(int i = 0; i < j; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.print("\nკენტი რიცხვები:");
        for(int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
