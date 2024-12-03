package Classwork_7.Task_6;

public class NumberFormat {
    public static void main(String[] args) {
        String[] k = {"1", "2", "abc", "4", "abc"};

        try {
            for(String numb : k) {
                int number = Integer.parseInt(numb);
                System.out.print(numb + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("არასწორი ფორმატი!");
        }
    }
}
