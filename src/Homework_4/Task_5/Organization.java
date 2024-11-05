package Homework_4.Task_5;

public class Organization {
    String name, address;
    int stuffQuantity;

    Organization(String n, String a, int stuffQ) {
        name = n;
        address = a;
        stuffQuantity = stuffQ;
    }

    int getSQ() {
        return stuffQuantity;
    }
}
