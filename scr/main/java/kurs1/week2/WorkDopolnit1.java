package kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 28.04.2016.
 */


//Инвертировать массив (без использования допольнительного массива)

public class WorkDopolnit1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int masRazmer = scn.nextInt();

        int[] masiv = new int[masRazmer];
        for (int i = 0; i < masiv.length; i++) {
            System.out.println("Введите " + (i + 1) + " елемент масива");
            masiv[i] = scn.nextInt();
        }

        ArrayUtils.printArr(masiv);

        for (int i = 0; i < masiv.length / 2; i++) {
            int tmp = masiv[i];
            masiv[i] = masiv[masiv.length - i - 1];
            masiv[masiv.length - i - 1] = tmp;
        }

        System.out.println();
        ArrayUtils.printArr(masiv);
    }
}

