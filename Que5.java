package Test.ClgAssgn;

import java.util.ArrayList;
import java.util.List;

public class Que5{
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long n = A.size();
        long sumOfN = (n * (n + 1)) / 2;
        long sumOfSquaresN = (n * (n + 1) * (2 * n + 1)) / 6;

        long actualSum = 0;
        long actualSumOfSquares = 0;

        for (int num : A) {
            long numLong = (long) num;
            actualSum += numLong;
            actualSumOfSquares += numLong * numLong;
        }

        long diffSum = sumOfN - actualSum;
        long diffSumOfSquares = sumOfSquaresN - actualSumOfSquares;

        long sum = diffSumOfSquares / diffSum;
        int repeated = (int) ((sum - diffSum) / 2);
        int missing = (int) (sum + diffSum) / 2;

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeated);
        result.add(missing);

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(List.of(3, 1, 2, 5, 3));
        System.out.println(repeatedNumber(input)); 
    }
}
