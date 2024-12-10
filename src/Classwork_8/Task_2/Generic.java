package Classwork_8.Task_2;

public class Generic {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderedPair<>("Age", 30);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}
