package Classwork_8.Task_5;

import java.util.*;

public class ListMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> row1 = Arrays.asList(1, 2, 3);
        List<Integer> row2 = Arrays.asList(4, 5, 6);

        matrix.add(row1);
        matrix.add(row2);

        System.out.println(matrix);

    }
}
