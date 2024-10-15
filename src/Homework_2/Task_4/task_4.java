package Homework_2.Task_4;

public class task_4 {
    public static void main(String[] args) {
        int[] B = {1,2,3,4,5,6,7,8,9,10};
        int min = B[0];
        for (int numb : B) {
            if(numb < min) {
                min = numb;
            }
        }
        System.out.print(min);
    }
}
