package Homework_4.Task_5;

public class Institute extends Organization {
    String type;
    int studentQuantity, teacherQuantity;

    Institute(String n, String a, int stuffQ, String t, int studQ, int teachQ){
        super(n, a, stuffQ);
        type = t;
        studentQuantity = studQ;
        teacherQuantity = teachQ;
    }

    int getTotalPeople() {
        return studentQuantity + teacherQuantity + stuffQuantity;
    }
}
