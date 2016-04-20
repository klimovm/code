package scr.kurs1.week1_additional;

import java.util.Scanner;

/**
 * Created by miha on 19.04.2016.
 */

//Написать программу, которая при вводе числа в диапазоне от 1 до 99
// добавляет к нему слово "копейка" в правильной форме.
// Например, 1копейка, 5 копеек, 42 копейки .

public class Additional_11_ {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от 1 до 99");
        int kop = scn.nextInt();

        switch (kop % 10) {
            case 1: {
                System.out.println(kop + " копейка");
            }
            break;

            case 2: {
                System.out.println(kop + " копейки");
            }
            break;

            case 3: {
                System.out.println(kop + " копейки");
            }
            break;

            case 4: {
                System.out.println(kop + " копейки");
            }
            break;

            case 5: {
                System.out.println(kop + " копеек");
            }
            break;

            case 6: {
                System.out.println(kop + " копеек");
            }
            break;

            case 7: {
                System.out.println(kop + " копеек");
            }
            break;

            case 8: {
                System.out.println(kop + " копеек");
            }
            break;

            case 9: {
                System.out.println(kop + " копеек");
            }
            break;

            case 0: {
                System.out.println(kop + " копеек");
            }
            break;
        }


    }
}
