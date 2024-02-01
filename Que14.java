package Test.ClgAssgn;

public class Que14{
    public static double calculateProbability() {
        // Total number of possible outcomes
        int totalOutcomes = (int) Math.pow(2, 3);

        // Number of favorable outcomes (all ants choose the same direction)
        int favorableOutcomes = 2;

        // Probability calculation
        double probability = (double) favorableOutcomes / totalOutcomes;

        // Round off to two decimal places
        probability = Math.round(probability * 100.0) / 100.0;

        return probability;
    }

    public static void main(String[] args) {
        double probability = calculateProbability();
        System.out.println("The probability that the ants don't collide: " + probability);
    }
}

