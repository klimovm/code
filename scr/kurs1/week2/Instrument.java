package scr.kurs1.week2;

/**
 * Created by miha on 10.05.2016.
 */
public class Instrument {
    public static int[] returnMas(int[] mas) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (min > mas[i]) {
                min = mas[i];
            }
        }
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (max < mas[i])
                max = mas[i];
        }
        int indexmax = 0;
        for (int i = 0; i < mas.length; i++)
            if (max == mas[i]) {
                indexmax = i;
            }
        int indexmin = 0;
        for (int i = 0; i < mas.length; i++)
            if (min == mas[i]) {
                indexmin = i;
            }
        mas[indexmax] = min;
        mas[indexmin] = max;

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");

        }
        return mas;
    }
}
