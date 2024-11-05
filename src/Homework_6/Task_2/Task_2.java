package Homework_6.Task_2;

public class Task_2 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "world";

        if (str1.contains(str2) || str2.contains(str1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
