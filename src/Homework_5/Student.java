package Homework_5;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String studentId;
    private final double[] scores;
    private int scoreCount;

    public Student(String firstName, String lastName, String studentId, int maxScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.scores = new double[maxScores];
        this.scoreCount = 0;
    }

    public void addScore(double score) {
        if (scoreCount < scores.length) {
            scores[scoreCount] = score;
            scoreCount++;
        }
    }

    public double calculateAverage() {
        if (scoreCount == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < scoreCount; i++) {
            sum += scores[i];
        }
        return sum / scoreCount;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getHighestScore() {
        double highest = 0;
        for (int i = 0; i < scoreCount; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        return highest;
    }
}
