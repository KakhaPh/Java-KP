package Homework_4.Task_5;

public class Test {
    public static void main(String[] args) {
        Institute inst1 = new Institute("სახელმწიფო უნი", "მისამართი", 120, "სახელმწიფო", 1200, 6);
        Institute inst2 = new Institute("ევროპის უნი", "მისამართი", 150, "კერძო", 5500, 50);

        System.out.println(inst1.getTotalPeople());
        System.out.println(inst2.getTotalPeople());

    }
}
