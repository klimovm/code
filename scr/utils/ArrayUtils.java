package scr.utils;

/**
 * Created by miha on 29.06.2016.
 */
public class ArrayUtils {

    public static int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void selectSort(int[] array) {
        if (array == null || array.length <= 1) return;

        for (int i = 0; i < array.length; i++) {
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[idx]) {
                    idx = j;
                }
            }
            swap(array, i, idx);
        }
    }

    public static void insertSort(int[] array) {
        if (array == null || array.length <= 1) return;
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            int indexPrevious = i - 1;
            while (indexPrevious >= 0 && array[indexPrevious] > tmp) {
                array[indexPrevious + 1] = array[indexPrevious];
                indexPrevious--;
            }
            array[indexPrevious + 1] = tmp;
        }


    }

    public static void bubleSort(int[] array) {
        if (array == null || array.length <= 1) return;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }

    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}
