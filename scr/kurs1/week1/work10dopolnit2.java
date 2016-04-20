package kurs1.week1;

import java.util.Scanner;

/**
 * Created by Mihail on 17.04.2016.
 */
//Вычислить факториал числа.

public class Work10dopolnit2 {


    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Введите число");
        int k = scr.nextInt();

        int factorial = 1;

        for (int i = 2; i <= k; i++)
            factorial *= i;

        System.out.println(factorial);
    }


}
