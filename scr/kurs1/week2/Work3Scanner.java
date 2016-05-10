package scr.kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 22.04.2016.
 */
public class Work3Scanner {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите первый массив");
        int[] masiv1 = new int[2];
        for (int i = 0; i < masiv1.length; i++) {
            System.out.println("Введите число " + (i + 1));
            masiv1[i] = scn.nextInt();
        }

        System.out.println("Введите второй массив");
        int[] masiv2 = new int[2];
        for (int i = 0; i < masiv2.length; i++) {
            System.out.println("Введите число " + (i + 1));
            masiv2[i] = scn.nextInt();
        }

        System.out.print("первый массив  ");

        for (int v : masiv1) {
            System.out.print(v + " ");
        }
        System.out.println(" ");

        System.out.print("второй массив  ");

        for (int v : masiv2) {
            System.out.print(v + " ");
        }
        System.out.println(" ");

        System.out.print("данные из первого массива во второй  ");
        for (int i = 0; i < masiv1.length; i++) {
            masiv2[i] = masiv1[i];
        }
        for (int c : masiv2) {
            System.out.print(c + " ");
        }


    }
}
