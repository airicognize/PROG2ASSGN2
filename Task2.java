import java.util.Arrays;

/**
 * A class that contains one method.
 */

public class Task2 {

    /**
     * A method that generates a new array with uniform distributed numbers.
     * @param startNum The first element from the array we want to make.
     * @param endNum It is the last element from the array we want to make.
     * @param amount The amount of elements we want to have between startNum and EndNum.
     * @return An array with our conditions.
     */

    public static double[] generateUniformDistributionNum(double startNum,
        double endNum, int amount) {
        double[] finalArr = new double[amount];

        if (startNum > endNum) {
            if (amount <= 2) {
            finalArr = new double[]{endNum, startNum};

            return finalArr;
            }

            double total = endNum;
            finalArr[0] = endNum;
            finalArr[finalArr.length - 1] = startNum;

            for (int i = 1; i < finalArr.length - 1; i++) {
                finalArr[i] += (startNum - endNum)/ (amount - 1);
                total += finalArr[i];
                finalArr[i] = total;
            }
        } else {
            double total = startNum;
            finalArr[0] = startNum;
            finalArr[finalArr.length - 1] = endNum;

            for (int i = 1; i < finalArr.length - 1; i++) {
                finalArr[i] += (endNum - startNum) / (amount - 1);
                total += finalArr[i];
                finalArr[i] = total;
            }
        }
        return finalArr;
    }
}
