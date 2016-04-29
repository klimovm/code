package scr.kurs1.week2.CodingBat;

/**
 * Created by miha on 28.04.2016.
 */
public class Array1 {
    /*******************************************************************************/
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
    }


    /*******************************************************************************/
    public boolean sameFirstLast(int[] nums) {
        /*Given an array of ints, return true if the array is length 1 or more,
        and the first element and the last element are equal.
        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true
        */

        if (  nums.length >= 1 &&nums[0] == nums[nums.length - 1])
        {return true;}
        return false;
    }

    /*******************************************************************************/

    public int[] rotateLeft3(int[] nums) {
        /*
        Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
        rotateLeft3([1, 2, 3]) → [2, 3, 1]
        rotateLeft3([5, 11, 9]) → [11, 9, 5]
        rotateLeft3([7, 0, 0]) → [0, 0, 7]
         */

        int []bb={nums[1],nums[2],nums[0]};
        return bb;
     /*******************************************************************************/
    }
}
