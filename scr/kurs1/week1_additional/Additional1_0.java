package scr.kurs1.week1_additional;

import java.util.Scanner;

/**
 * Created by miha on 18.04.2016.
 */
public class Additional1_0 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите первую сторону");
        int a = scn.nextInt();

        System.out.println("Введите вторую сторону");
        int b = scn.nextInt();

        System.out.println("Введите третью сторону");
        int c = scn.nextInt();

        if (((a + b) > c) && ((b + c) > a) && ((a + c)) > b) {
            System.out.println("Это трехугольник");
        } else {
            System.out.println("Это не трехугольник");
        }
    }
}
