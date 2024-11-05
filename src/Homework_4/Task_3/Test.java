package Homework_4.Task_3;

public class Test {
    public static void main(String[] args) {
        Director d1 = new Director("kakha",3500, 1000);
        Director d2 = new Director("kakha2",3800, 1000);

        System.out.println(d1.name + ": " + d1.getTotalSalary());
        System.out.println(d2.name + ": " + d2.getTotalSalary());

    }
}
