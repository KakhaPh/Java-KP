package Classwork_8.Task_1;

public class Generic {
        public static void main(String[] args) {
            Box<Integer> intBox = new Box<>();
            intBox.setValue(10);
            System.out.println(intBox.getValue());
            //
            Box<String> strBox = new Box<>();
            strBox.setValue("Hello, Java!");
            System.out.println(strBox.getValue());
    }
}
