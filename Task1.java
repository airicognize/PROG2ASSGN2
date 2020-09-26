import java.util.Arrays;
import static java.util.Arrays.copyOfRange;

/**
 * This class contains 5 methods that use 5 different ways to manipulate an array.
 */

public class Task1 {

    /**
     * Method that calculates the sum of all the elements in the array.
     * @param nums Array which contains double elements.
     * @return The sum of all the elements in the array.
     */

    public static double sum(double[] nums) {
        double finalSum = 0;

        for (double num : nums) {
            finalSum += num;
        }

        return finalSum;
    }

    /**
     * Method that calculates the average of all the elements inside the array.
     * @param nums Array which contains double elements.
     * @return The avagerage of all elements inside the array.
     */

    public static double avg(double[] nums) {
        double finalSum = 0;

        for (double num : nums) {
            finalSum += num;
        }

        return finalSum / nums.length;
    }

    /**
     * Method that outputs the smallest element in the array.
     * @param nums Array which contains double elements.
     * @return The smallest element in the array.
     */

    public static double min(double[] nums) {
        Arrays.sort(nums);

        return nums[0];

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < minVal) {
//                minVal = nums[i];
//            }
//        }

        //return minVal;
    }

    /**
     * Method that increases each element by the amount given by the user in value.
     * @param nums Array that contains double elements.
     * @param value The amount in which we should increase elements by.
     */

    public static void increaseValue(double[] nums, double value) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + value;
        }
    }

    /**
     * Method that will delete an element from the array and output a new array
     * with the same elements from the previous array without the deleted element.
     * @param nums Array that contains double elements.
     * @param idx Chooses which element is to be removed.
     * @return A new array with the same elements from the previous array without
     * the deleted ements.
     */

    public static double[] delete(double[] nums, int idx) {
        double[] finalArr = new double[nums.length - 1];
        double[] afterIdxArr = Arrays.copyOfRange(nums, idx + 1, nums.length);

        for (int i = 0; i < idx; i++) {
            finalArr[i] = nums[i];
        }

        for (int i = 0; i < afterIdxArr.length; i++) {
            finalArr[i + idx] = afterIdxArr[i];
        }

        return finalArr;
   }
}
