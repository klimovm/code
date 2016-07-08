package kurs1.week2.CodingBat;

/**
 * Created by miha on 05.05.2016.
 */
public class Array2 {
    /*****************************************************************************************************************/
    public int countEvens(int[] nums) {
     /*Return the number of even ints in the given array. Note: the % "mod"
     operator computes the remainder, e.g. 5 % 2 is 1.
     countEvens([2, 1, 2, 3, 4]) → 3
     countEvens([2, 2, 0]) → 3
     countEvens([1, 3, 5]) → 0*/

        int random = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0)
                random++;
        }
        return random;
    }
    /*****************************************************************************************************************/
    public int bigDiff(int[] nums) {
        /*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
        Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
        bigDiff([10, 3, 5, 6]) → 7
        bigDiff([7, 2, 10, 9]) → 8
        bigDiff([2, 10, 7, 2]) → 8
        */
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (min > nums[i])
                min = nums[i];
            if (max < nums[i])
                max = nums[i];
        }
        return (max-min);
    }
    /*****************************************************************************************************************/
    public int centeredAverage(int[] nums) {
        /*
        Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
        except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
        ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
        You may assume that the array is length 3 or more.
        centeredAverage([1, 2, 3, 4, 100]) → 3
        centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
        centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
        */
        int sum = nums[0];
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {sum +=nums[i];};


        for (int i = 0; i < nums.length; i++) {

            if (min > nums[i])
                min = nums[i];
            else if (max < nums[i])
                max = nums[i];
        }
        return (sum - min - max)/(nums.length -2);
    }
    /*****************************************************************************************************************/
    public int sum13(int[] nums) {
        /*Return the sum of the numbers in the array, returning 0 for an empty array.
        Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6
        */

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) i++;
            else  count += nums[i];}
        return count;

    }
    /*****************************************************************************************************************/











    /*****************************************************************************************************************/

    public boolean has22(int[] nums) {
        /*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
        has22([1, 2, 2]) → true
        has22([1, 2, 1, 2]) → false
        has22([2, 1, 2]) → false
        */
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2)
                return true;

        }
        return false;

    }
    /*****************************************************************************************************************/
    public boolean lucky13(int[] nums) {
        /*Given an array of ints, return true if the array contains no 1's and no 3's.
        lucky13([0, 2, 4]) → true
        lucky13([1, 2, 3]) → false
        lucky13([1, 2, 4]) → false
        */
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3)
                return false;}
        return true;
    }
    /*****************************************************************************************************************/
    public boolean sum28(int[] nums) {
        /*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
        sum28([2, 3, 2, 2, 4, 2]) → true
        sum28([2, 3, 2, 2, 4, 2, 2]) → false
        sum28([1, 2, 3, 4]) → false
        */
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)count+=2;}
        int n = 8;
        if(n == count) return true;
        return false;
    }
    /*****************************************************************************************************************/












    /*****************************************************************************************************************/


}
