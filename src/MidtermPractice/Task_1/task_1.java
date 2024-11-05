package MidtermPractice.Task_1;

public class task_1 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100) + 1;

        if(random % 5 == 0) {
            System.out.print(random);
        } else {
            System.out.println("არ არის ხუთის ჯერადი");
        }
    }
}
