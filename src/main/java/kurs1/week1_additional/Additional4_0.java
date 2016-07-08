package kurs1.week1_additional;

import java.util.Scanner;

/**
 * Created by miha on 18.04.2016.
 */

//Известны две скорости, одна в километрах в час, другая в метрах в секунду. Какая из них больше?
public class Additional4_0 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите скорость в км/ч");
        double a = scn.nextDouble();

        System.out.println("Введите скорость в м/c");
        double b = scn.nextDouble();

        double c = (b * 3600) / 1000;

        if (a > c)
            System.out.println("скорость в км/ч больше скорости скорость в м/c ");
        if (a < c)
            System.out.println("скорость в км/ч меньше скорости скорость в м/c ");
        else if (a == c)
            System.out.println("скорости равны ");

    }
}
