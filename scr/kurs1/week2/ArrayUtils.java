package scr.kurs1.week2;

/**
 * Created by miha on 29.04.2016.
 */
public class ArrayUtils {
    public static int minMassiv(int[] mas) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (min > mas[i]) {
                min = mas[i];
            }
        }
        return min;
    }

    public static int maxMassiv(int[] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (max < mas[i])
                max = mas[i];
        }
        return max;
    }


    public static int indexMax(int max,int[] mas) {
        int indexmax = 0;
        for (int i = 0; i<mas.length; i++)
            if (max == mas[i]) {
                indexmax = i;
            }
        return  indexmax;
    }

    public static int indexMin(int min,int[] mas) {
        int indexmin = 0;
        for (int i = 0; i<mas.length; i++)
            if (min == mas[i]) {
                indexmin = i;
            }
        return  indexmin;
    }

    public static void printArr(int [] mas){
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

}

