package scr.kurs1.week2.CodingBat;

/**
 * Created by miha on 28.04.2016.
 */
public class Array1 {
    /******************************************************************************************************************/
    public boolean firstLast6(int[] nums) {

        /*
        Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false
        */
        {
            return (nums[0] == 6 || nums[nums.length - 1] == 6);
        }
        // или
        // if (nums [0] == 6 || nums [nums.length - 1] ==6){return true;}
        // else return false;


    }


    /******************************************************************************************************************/
    public boolean sameFirstLast(int[] nums) {
        /*Given an array of ints, return true if the array is length 1 or more,
        and the first element and the last element are equal.
        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true
        */

        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }


    /******************************************************************************************************************/

    //    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    //    makePi() → [3, 1, 4]
    public int[] makePi() {
        int[] result = {3, 1, 4};
        return result;
    }

    /*******************************************************************************************************************/
    public boolean commonEnd(int[] a, int[] b) {
        /*Given 2 arrays of ints, a and b, return true if they have the same first element or they have
        the same last element. Both arrays will be length 1 or more.
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
        */
        if (a[a.length - 1] == b[b.length - 1] || a[0] == b[0]) {
            return true;
        }
        return false;
    }

    /*******************************************************************************************************************/
    public int[] rotateLeft3(int[] nums) {
        /*
        Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
        rotateLeft3([1, 2, 3]) → [2, 3, 1]
        rotateLeft3([5, 11, 9]) → [11, 9, 5]
        rotateLeft3([7, 0, 0]) → [0, 0, 7]
         */

        int[] mass = {nums[1], nums[2], nums[0]};
        return mass;
    }

    /*****************************************************************************************************************/
    public int[] reverse3(int[] nums) {

        /*Given an array of ints length 3, return a new array with the elements
        in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
        reverse3([1, 2, 3]) → [3, 2, 1]
        reverse3([5, 11, 9]) → [9, 11, 5]
        reverse3([7, 0, 0]) → [0, 0, 7]
        */
        int[] masiv = {nums[2], nums[1], nums[0]};
        return masiv;
    }

    /*****************************************************************************************************************/
    public int[] maxEnd3(int[] nums) {
        /*
        Given an array of ints length 3, figure out which is larger between the first and last elements in the array,
        and set all the other elements to be that value. Return the changed array.
        maxEnd3([1, 2, 3]) → [3, 3, 3]
        maxEnd3([11, 5, 9]) → [11, 11, 11]
        maxEnd3([2, 11, 3]) → [3, 3, 3]
        */

        int[] mas = new int[3];
        mas[0] = nums[0];
        if (nums[2] >= mas[0])
            mas[0] = nums[2];
        mas[1] = mas[0];
        mas[2] = mas[0];
        return mas;
    }

    /*****************************************************************************************************************/

    public int sum2(int[] nums) {
        /*Given an array of ints, return the sum of the first 2 elements in the array.
        If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
        sum2([1, 2, 3]) → 3
        sum2([1, 1]) → 2
        sum2([1, 1, 1, 1]) → 2
        */
        int s = 0;
        if (nums.length > 1)
            s = nums[0] + nums[1];
        else if (nums.length == 1)
            s = nums[0];
        return s;

    }


}
