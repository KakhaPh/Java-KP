package Homework_9.Task_1;

public interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V>implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static class Main {
        public static void main(String[] args) {
            Pair<String, Integer> pair = new OrderedPair<>("Age", 30);
            System.out.println("Key: " + pair.getKey() + "\nValue: " + pair.getValue());
        }
    }
}
