package Homework_9.Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private final String name;
    private final int age;

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

    public static class Main {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student ("Alice", 22));
            students.add(new Student ("Nick", 25));


            Collections.sort(students);
            System.out.println(students);
        }
    }
}