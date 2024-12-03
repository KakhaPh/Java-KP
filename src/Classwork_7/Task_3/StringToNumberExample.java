package Classwork_7.Task_3;

public class StringToNumberExample {
    public static void main(String[] args) {
        try {
            String number = "123";
            int result = Integer.parseInt(number);
            System.out.print("რიცხვი: " + result);
        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: ვერ მოხერხდა ტექსტის რიცხვად გარდაქმნა");
        }
    }
}
