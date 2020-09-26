import java.util.Arrays;

/**
 * A class which contains 3 methods.
 */

public class Task3 {

    /**
     * A method that calculates the final score of an athlete.
     * @param scores Array that has double elements.
     * @return the final score of the athlete.
     */

    public static double calcFinalScore(double[] scores) {
    double finalScore = 0;

    for (double score : scores) {
        finalScore += score;
    }

    return (((finalScore) - max(scores)) - min(scores))  / (scores.length - 2);
}

    /**
     * Method that gives the smallest element in the array.
     * @param score Array that has double elements.
     * @return The smallest element in the array.
     */
    static double min(double[] score) {
        Arrays.sort(score);

        return score[0];
    }

    /**
     * Method that gives the biggest element in the array.
     * @param score Array that has double elements.
     * @return The biggest element in the array
     */

    static double max(double[] score) {
        Arrays.sort(score);

        return score[score.length - 1];
    }
}
