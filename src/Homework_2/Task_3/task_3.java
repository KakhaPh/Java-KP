package Homework_2.Task_3;

public class task_3 {
    public static void main(String[] args) {
        int[] c = {0,1,2,3,-3,2,-1,3};
        int DN = 0;
        int UN = 0;
        int ON = 0;

        for (int numb : c) {
            if(numb > 0) {
                DN++;
            } else if (numb < 0) {
                UN++;
            } else if(numb == 0){
                ON++;
            }
        }

        System.out.println(DN + " " + UN + " " + ON );
    }
}
