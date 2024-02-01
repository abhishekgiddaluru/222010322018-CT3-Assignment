package Test.ClgAssgn;

public class Que13{
    public static String convertToTitle(int A) {
        StringBuilder result = new StringBuilder();

        while (A > 0) {
            A--;  // Adjusting to 0-based index
            char ch = (char) ('A' + A % 26);
            result.insert(0, ch);
            A /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 28;

        System.out.println(convertToTitle(input1));  // Output: "A"
        System.out.println(convertToTitle(input2));  // Output: "AB"
    }
}

