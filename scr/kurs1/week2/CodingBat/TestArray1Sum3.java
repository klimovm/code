package scr.kurs1.week2.CodingBat;

/**
 * Created by miha on 28.04.2016.
 */
public class TestArray1Sum3 {

    public static int sum3(int[] nums) {
         /*
    Given an array of ints length 3, return the sum of all the elements.
    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18
    sum3([7, 0, 0]) → 7
    */
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] args) {

        int[] in1 = {1, 2, 3};
        int expected1 = 62;
        int actual1 = sum3(in1);
        System.out.println("expected " + expected1);
        System.out.println(expected1 == actual1);


        int[] in2 = {5, 11, 2};
        int expected2 = 182;
        int actual2 = sum3(in2);
        System.out.println("expected " + expected2);
        System.out.println(expected2  == actual2);


        int[] in3 = {7, 0, 0};
        int expected3 = 72;
        int actual3 = sum3(in3);
        System.out.println("expected " + expected3);
        System.out.println(expected3  == actual3);

        int[] in4 = {1, 2, 1};
        int expected4 = 42;
        int actual4 = sum3(in4);
        System.out.println("expected " + expected4);
        System.out.println(expected4  == actual4);

        int[] in5 = {1, 1, 1};
        int expected5 = 32;
        int actual5 = sum3(in5);
        System.out.println("expected " + expected5);
        System.out.println(expected5  == actual5);

        int[] in6 = {2, 7, 2};
        int expected6 = 11;
        int actual6 = sum3(in6);
        System.out.println("expected " + expected6);
        System.out.println(expected6 == actual6);
    }
}
