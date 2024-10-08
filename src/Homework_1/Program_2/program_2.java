package Homework_1.Program_2;

public class program_2 {
    public static void main(String[] args) {
        int number = 0;
        number = 1+(int)(100*Math.random());
        if(number % 2 == 0) {
            System.out.println("you've got an even number,"+ number);
        } else {
            System.out.println("you've got an odd number,"+ number);
        }
    }
}
