package Classwork_8.Task_3;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

