package Classwork_7.Task_5;

public class ArraySizeError {
    public static void main(String[] args) {
        int arraySize = 3;
        try {
            String[] array = new String[arraySize];
            System.out.println("მასივის ზომა: " + arraySize);
        } catch (NegativeArraySizeException e) {
            System.out.println("შეცდომა: მასივის ზომა არ უნდა იყოს უარყოფითი");
        }
    }
}
