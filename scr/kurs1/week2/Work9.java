package scr.kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 26.04.2016.
 */
//Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.

public class Work9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Задаем размер наших масивов через консоль
        System.out.println("Введите размер массивов");
        int n = scn.nextInt();

        //заполняем рандомом первый масив размером "n"
        int[] massiv1 = new int[n];
        int parnost1 = ArrayUtils.massivRandom(massiv1);
        System.out.println(" ");

        //заполняем рандомом второй масив размером "n"
        int[] massiv2 = new int[n];
        int parnost2 = ArrayUtils.massivRandom(massiv2);
        System.out.println(" ");

        if (parnost1 > parnost2) {
            System.out.println("В первом масиве больше парных елементов ");
        } else if (parnost2 > parnost1) {
            System.out.println("Во втором масиве больше парных елементов ");
        } else {
            System.out.println("одинаково парных елементов ");
        }
    }
}
