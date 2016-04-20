package kurs1.week1;

import java.util.Scanner;

/**
 * Created by Mihail on 16.04.2016.
 */

//Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

public class Work4_0 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите число с плавающей точкой");
        double n = scr.nextDouble();

        if (n >= 0 && n < 1)
            System.out.println(true);
        else
            System.out.println(false);

    }


}
