package Homework_2.Task_2;

public class task_2 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int s = 0;
        for(int numb : A) {
            if (numb % 2 == 0) {
                s += numb;
            }
        }
        System.out.print(s);
    }
}
