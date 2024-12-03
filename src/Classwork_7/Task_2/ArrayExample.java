package Classwork_7.Task_2;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,15};
        try {
            System.out.println("მეოთხე ელემენტი: " + numbers[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("შეცდომა: არასწორი ინდექსით წვდომა მასივში!");
        }
    }
}
