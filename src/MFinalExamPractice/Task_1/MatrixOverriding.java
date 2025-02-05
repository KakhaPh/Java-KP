package MFinalExamPractice.Task_1;

public class MatrixOverriding extends Matrix {
    public MatrixOverriding(int[][] matrix) {
        super(matrix);
    }

    @Override
    public int getMaxOnDiagonal() {
        System.out.println("Overriding");
        return super.getMaxOnDiagonal();
    }

    @Override
    public int sumEvenAboveDiagonal() {
        System.out.println("Overriding Even above numbers sum...");
        return super.sumEvenAboveDiagonal();
    }
}
