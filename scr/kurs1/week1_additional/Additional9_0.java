package scr.kurs1.week1_additional;

import java.util.Scanner;

/**
 * Created by miha on 19.04.2016.
 */

//Написать программу вычисления идеального веса пользователя (рост-100).
// Выдать рекомендации о необходимости поправиться либо похудеть.
public class Additional9_0 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите свой рост");
        int rost = scn.nextInt();

        System.out.println("Введите свой вес");
        int ves = scn.nextInt();

        int norma = rost - 100;

        if (ves > norma) {
            System.out.println("Вам нужно похужеть на " + (ves - norma) + "кг");
        }
        if (ves < norma) {
            System.out.println("Вам нужно поправиться на " + (norma - ves) + "кг");
        } else if (ves == norma) {
            System.out.println("Вы в идеальной форме");
        }


    }
}
