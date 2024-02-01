package Test.ClgAssgn;

import java.util.ArrayList;
import java.util.List;

public class Que4{
    public static List<Integer> getRow(int k) {
        List<Integer> result = new ArrayList<>();
        // Initialize the result list with the first element
        result.add(1);
        // Generate the next row using the previous row
        for (int i = 1; i <= k; i++) {
            // Calculate the next element using the formula A'[C] = A'[C] + A'[C-1]
            result.add(result.get(i - 1) * (k - i + 1) / i);
        }
        return result;
    }
    public static void main(String[] args) {
        int k = 3;
        System.out.println(getRow(k));
    }
}
