package MidtermPractice.Task_2;

public class task_2 {
    public static void main(String[] args) {
        int[] array = {1, -1, 2, -2, 3, -3};
        int countPositives = 0;
        for (int j : array) {
            if (j > 0) {
                countPositives++;
            }
        }

        System.out.println(countPositives);
    }
}
