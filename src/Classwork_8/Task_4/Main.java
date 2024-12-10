package Classwork_8.Task_4;

public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Alice", 22);
            Student student2 = (Student) student1.clone();
            //
            System.out.println(student1);
            System.out.println(student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
