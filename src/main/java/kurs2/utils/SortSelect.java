package kurs2.utils;

/**
 * Created by Mihail on 25.06.2016.
 */
public class SortSelect {

    public static void selectSort(int[] array) {
        if (array == null || array.length <= 1) return;
        for (int i = 0; i < array.length; i++) {
            int inx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[inx]) {
                    inx = j;
                }
            }
            int tmp = array[i];
            array [i] = array[inx];
            array[inx] = tmp;

        }

    }
}
