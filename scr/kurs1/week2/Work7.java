package scr.kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 20.04.2016.
 */

//Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
public class Work7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] masiv = new int[4];
        for (int i = 0; i < masiv.length; i++ ){
            System.out.println("Введите "+ (i + 1) + "-й елемент массива");
            masiv[i] = scn.nextInt();
        }

    }
}
