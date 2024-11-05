package Homework_5;

public class Test {
    public static void main(String[] args) {
        University uni1 = new University("უნივერსიტეტი A", 10);
        University uni2 = new University("უნივერსიტეტი B", 10);

        Student student1 = new Student("სახელი1", "გვარი1", "A001", 3);
        student1.addScore(85);
        student1.addScore(90);
        student1.addScore(78);

        Student student2 = new Student("სახელი2", "გვარი2", "B002", 3);
        student2.addScore(95);
        student2.addScore(88);
        student2.addScore(92);

        Student student3 = new Student("სახელი3", "გვარი3", "C003", 3);
        student3.addScore(80);
        student3.addScore(85);
        student3.addScore(83);

        uni1.addStudent(student1);
        uni2.addStudent(student2);
        uni2.addStudent(student3);

        Student highestScoringStudent = null;
        double highestAverage = 0;
        String highestScoringUniversity = "";

        for (University uni : new University[]{uni1, uni2}) {
            Student topStudent = uni.getTopStudent();
            if (topStudent != null && topStudent.calculateAverage() > highestAverage) {
                highestAverage = topStudent.calculateAverage();
                highestScoringStudent = topStudent;
                highestScoringUniversity = uni.getName();
            }
        }

        if (highestScoringStudent != null) {
            System.out.println("მაღალ ქულიანი სტუდენტი: " + highestScoringStudent.getFullName() +
                    " (ID: " + highestScoringStudent.getStudentId() +
                    ") " + highestScoringUniversity +
                    " საშუალო ქულა: " + highestAverage);
        }
    }
}
