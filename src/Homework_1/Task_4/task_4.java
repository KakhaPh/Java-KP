package Homework_1.Task_4;

public class task_4 {
    public static void main(String[] args) {
        int randomNum = 1+(int)(1000*Math.random());
        int countDigits = 0;
        System.out.printf("რიცხვი: %s%n", randomNum);

        while (randomNum != 0) {
            randomNum /= 10;
            countDigits++;
        }

        System.out.printf("თანრიგების რაოდენობა: %s", countDigits);
    }
}
