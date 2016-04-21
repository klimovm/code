package scr.kurs1.week2;

import java.util.Scanner;


/**
 * Created by miha on 20.04.2016.
 */

//Найти минимальное и максимальное значения в массиве и вывести их на консоль

public class Work1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Введите число " + (i + 1));
            nums[i] = scn.nextInt();
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
            if (min > nums[i])
                min = nums[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min:" + min);
    }
}
