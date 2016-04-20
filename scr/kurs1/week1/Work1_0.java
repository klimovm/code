package kurs1.week1;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

//4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
//Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

/**
 * Created by Mihail on 16.04.2016.
 */
public class Work1_0 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите время от 0 до 24");
        int time = scr.nextInt();

        if (time >= 9 && time <= 18)
            System.out.println("Я на работе");
        else
            System.out.println("Я отдыхаю");

    }
}
