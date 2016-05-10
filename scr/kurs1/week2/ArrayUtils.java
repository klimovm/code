package scr.kurs1.week2;

/**
 * Created by miha on 29.04.2016.
 */

public class ArrayUtils {
    /******************************************************************************************************************/
    public static int findMin(int[] mas) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (min > mas[i]) {
                min = mas[i];
            }
        }
        return min;
    }

    /******************************************************************************************************************/
    public static int findMAx(int[] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (max < mas[i])
                max = mas[i];
        }
        return max;
    }

    /******************************************************************************************************************/
    public static int findIndexMax(int max, int[] mas) {
        int indexmax = 0;
        for (int i = 0; i < mas.length; i++)
            if (max == mas[i]) {
                indexmax = i;
            }
        return indexmax;
    }

    /******************************************************************************************************************/
    public static int findIndexMin(int min, int[] mas) {
        int indexmin = 0;
        for (int i = 0; i < mas.length; i++)
            if (min == mas[i]) {
                indexmin = i;
            }
        return indexmin;
    }

    /******************************************************************************************************************/
    public static void printArr(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
    /******************************************************************************************************************/
    public static int massivRandom (int[] mass ){
        int parnost = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 25 + (int) (Math.random() * ((75 - 25) + 1));
            if (mass[i] % 2 == 0) {
                parnost++;
            }
            System.out.print(mass[i] + " ");
        }
        return parnost;
    }
}

