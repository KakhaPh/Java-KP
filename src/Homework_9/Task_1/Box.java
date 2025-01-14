package Homework_9.Task_1;

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static class Main {
        public static void main(String[] args) {
            Box<Integer> intBox = new Box<>();
            intBox.setValue(100);
            System.out.println(intBox.getValue());

            Box<String> strBox = new Box<>();
            strBox.setValue("hello Java");
            System.out.println(strBox.getValue());
        }
    }
}