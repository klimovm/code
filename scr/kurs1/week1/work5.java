package kurs1.week1;

import java.util.Scanner;

/**
 * Created by Mihail on 16.04.2016.
 */

//Вводим 2 числа. Если первое число больше второго то вывести
// на экран разницу чисел. Если второе больше, то выводим сумму.
public class Work5 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите первое число");
        int number1 = scr.nextInt();

        System.out.println("Введите второе число");
        int number2 = scr.nextInt();

        if (number1 > number2)
            System.out.println(number1 - number2);
        else if (number1 < number2)
            System.out.println(number1 + number2);
    }
}
