package Homework_2.Task_11;

public class task_11 {
    public static void main(String[] args) {
        int[] A = {1,3,5,-1,-1,2,4};
        int sumOf2to5 = 0;
        for(int numb : A) {
            if(numb >= 2 && numb <= 5) {
                sumOf2to5 += numb;
            }
        }

        System.out.print(sumOf2to5 + "");
    }
}
