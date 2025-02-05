package MFinalExamPractice.Task_1;

public class Matrix {
    protected int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getMaxOnDiagonal() {
        int n = matrix.length;
        int max = matrix[0][0];
        for (int i = 0; i < n; i++) {
            if(matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public int getMaxInFirstRow() {
        int n = matrix[0].length;
        int max = matrix[0][0];

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] > max) {
                max = matrix[0][j];
            }
        }
        return max;
    }

    public int sumEvenAboveDiagonal() {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int getMaxOnSecondDiagonal() {
        int n = matrix.length;
        int max = matrix[0][n - 1];

        for (int i = 0; i < n; i++) {
            if (matrix[i][n - 1 - i] > max) {
                max = matrix[i][n - 1 - i];
            }
        }
        return max;
    }

    public int sumBelowDiagonal() {
        int n = matrix.length;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
