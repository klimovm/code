package scr.kurs1.week2;

/**
 * Created by miha on 29.04.2016.
 */
public class Metod {

    public  static  int [] vozvratMasiv (int [] mas){
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
        for (int i = 0; i<mas.length; i++)
            if (max == mas[i]) {
                indexmax = i;
            }
        int indexmin = 0;
        for (int i = 0; i<mas.length; i++)
            if (min == mas[i]) {
                indexmin = i;
            }
        mas[indexmax] = min;
        mas[indexmin] = max;


        return mas;
    }












    public static int indexMin(int min,int[] mas) {
        int indexmin = 0;
        for (int i = 0; i<mas.length; i++)
            if (min == mas[i]) {
                indexmin = i;
            }
        return  indexmin;
    }
}
