package kurs2.week5.sorts;

import kurs2.utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by miha on 29.06.2016.
 */
public class TestSelectSort {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(10);
        System.out.println("Данный масс " + Arrays.toString(array));
        ArrayUtils.selectSort(array);
        System.out.println("SelectSort: " + Arrays.toString(array));
        System.out.println();

        int[] array2 = ArrayUtils.createArray(10);
        System.out.println("Данный масс " + Arrays.toString(array2));
        ArrayUtils.insertSort(array2);
        System.out.println("InsertSort: " + Arrays.toString(array2));
        System.out.println();

        int[] array3 = ArrayUtils.createArray(10);
        System.out.println("Данный масс " + Arrays.toString(array3));
        ArrayUtils.bubleSort(array3);
        System.out.println("BubbleSort: " + Arrays.toString(array3));

    }
}
