package MFinalExamPractice.Task_1;

public class MatrixCalculation {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 2},
                {1, 2, 2},
                {2, 2, 3}
        };

        MatrixOverriding processor = new MatrixOverriding(matrix);

        System.out.println("მაქსიმალური რიცხვი დიაგონალში: " + processor.getMaxOnDiagonal());
        System.out.println("მაქსიმალური რიცხვი დიაგონალში: " + processor.sumEvenAboveDiagonal());

    }
}
