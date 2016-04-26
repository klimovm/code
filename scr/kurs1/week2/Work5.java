package scr.kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 20.04.2016.
 */

//Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные

public class Work5 {

    public static void main(String[] args) {

        int[] mas = new int[6];
        int random = 0;

        for (int i = 0; i < mas.length; i++) {
            random = (int) (Math.random() * 50);
            if (i == 0 || i % 2 == 0) {

                // todo use ternary operator
                if (random % 2 == 0) {
                    mas[i] = random;
                } else {
                    mas[i] = random + 1;
                }

            } else {

                //todo use ternary operator
                if (random % 2 != 0) {
                    mas[i] = random;
                } else {
                    mas[i] = random + 1;
                }
            }
            System.out.print(mas[i] + "  ");
        }
    }
}