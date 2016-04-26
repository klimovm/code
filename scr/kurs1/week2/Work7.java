package scr.kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 20.04.2016.
 */

//Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
public class Work7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] masiv = new int[6];
        for (int i = 0; i < masiv.length; i++) {
            System.out.println("Введите " + (i + 1) + "-й елемент массива");
            masiv[i] = scn.nextInt();
        }

        int summa1 = 0;
        for (int i = 0; i < (masiv.length / 2); i++) {
            summa1 += masiv[i];
        }
        int srednee1 = summa1 / (masiv.length / 2);

        int summa2 = 0;
        for (int i = masiv.length - 1; i > (masiv.length / 2) - 1; i--) {
            summa2 += masiv[i];
        }
        int srednee2 = summa2 / (masiv.length / 2);

        if (srednee1 > srednee2) {
            System.out.println(srednee1);
        } else if (srednee2 > srednee1) {
            System.out.println(srednee2);
        }

    }
}
