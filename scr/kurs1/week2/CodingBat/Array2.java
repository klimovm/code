package scr.kurs1.week2.CodingBat;

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

}
