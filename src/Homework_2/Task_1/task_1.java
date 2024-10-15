package Homework_2.Task_1;

public class task_1 {
    public static void main(String[] args) {
        int[] B = {1,2,1,1,1,-4};
        int p = 0;
        int n = 0;
        for (int numb : B) {
            if (numb > 0) {
                p += numb;
                n++;
            }
        }
        System.out.println(p);
        System.out.println(n);

    }
}
