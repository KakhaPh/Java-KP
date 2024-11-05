package Homework_4.Task_3;

public class Director extends Worker {
    float bonus;

    Director(String n, float s, float b) {
        super(n, s);
        bonus = b;
    }

    float getTotalSalary() {
        return (int)(getSalary() + bonus);
    }
}
