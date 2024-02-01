package Test.ClgAssgn;

import java.util.ArrayList;
import java.util.List;

public class Que9{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0) {
            return result;
        }

        // First row
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(i - 1);

            // First element of each row is always 1
            row.add(1);

            // Calculate the rest of the elements using the formula A'[C] = A'[C] + A'[C-1]
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j) + prevRow.get(j - 1));
            }

            // Last element of each row is always 1
            row.add(1);

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        Que9 solution = new Que9();
        int numRows = 5;
        List<List<Integer>> pascalsTriangle = solution.generate(numRows);

        // Displaying the generated Pascal's Triangle
        for (List<Integer> row : pascalsTriangle) {
            System.out.println(row);
        }
    }
}

