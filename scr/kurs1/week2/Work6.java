package scr.kurs1.week2;

/**
 * Created by miha on 20.04.2016.
 */

//Найти среднее арифметическое массива

public class Work6 {

    public static void main(String[] args) {
        int[] maviv = {4, 4, 4, 4};
        int srednee = 0;

        for (int i = 0; i < maviv.length; i++) {
            srednee += maviv[i];
        }
        System.out.println(srednee / maviv.length);
    }
}
