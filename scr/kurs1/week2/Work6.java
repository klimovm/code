package scr.kurs1.week2;

/**
 * Created by miha on 20.04.2016.
 */

//Найти среднее арифметическое массива

public class Work6 {
    public static void main(String[] args) {

        int[] masiv = {1, 2, 3, 4};
        int summa = 0;
        for (int i = 0; i < masiv.length; i++) {
            summa = (summa + masiv[i]);
        }
        int srednee = summa / masiv.length;


        System.out.println(masiv.length);
        System.out.println(srednee);

    }
}
