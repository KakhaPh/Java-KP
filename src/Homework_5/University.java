package Homework_5;

public class University {
    private final String name;
    private final Student[] students;
    private int studentCount;

    public University(String name, int maxStudents) {
        this.name = name;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        }
    }

    public Student getTopStudent() {
        if (studentCount == 0) {
            return null;
        }
        Student topStudent = students[0];
        for (int i = 1; i < studentCount; i++) {
            if (students[i].calculateAverage() > topStudent.calculateAverage()) {
                topStudent = students[i];
            }
        }
        return topStudent;
    }

    public String getName() {
        return name;
    }
}
