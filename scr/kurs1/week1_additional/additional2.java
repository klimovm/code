package scr.kurs1.week1_additional;

import java.util.Scanner;
import java.lang.*;

/**
 * Created by miha on 18.04.2016.
 */

//Ввести с клавиатуры три числа, положительные возвести в куб, а отрицательные заменить на 0.

public class Additional2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        int num1 = scan.nextInt();

        System.out.println("Введите второе число");
        int num2 = scan.nextInt();

        System.out.println("Введите третье число");
        int num3 = scan.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0) {
            System.out.println(num1 * num1);
            System.out.println(num2 * num2);
            System.out.println(num3 * num3);
        }
        if (num1 > 0 && num2 > 0 && num3 < 0) {
            System.out.println(num1 * num1);
            System.out.println(num2 * num2);
            System.out.println(num3 - num3);
        }
        if (num1 > 0 && num2 < 0 && num3 > 0) {
            System.out.println(num1 * num1);
            System.out.println(num2 * 0);
            System.out.println(num3 * num3);
        }
        if (num1 < 0 && num2 > 0 && num3 > 0) {
            System.out.println(num1 * 0);
            System.out.println(num2 * num2);
            System.out.println(num3 * num3);
        }
        if (num1 > 0 && num2 < 0 && num3 < 0) {
            System.out.println(num1 * num1);
            System.out.println(num2 * 0);
            System.out.println(num3 * 0);
        }
        if (num1 < 0 && num2 > 0 && num3 < 0) {
            System.out.println(num1 * 0);
            System.out.println(num2 * num2);
            System.out.println(num3 * 0);
        }
        if (num1 < 0 && num2 > 0 && num3 > 0) {
            System.out.println(num1 * 0);
            System.out.println(num2 * 0);
            System.out.println(num3 * num3);
        } else if (num1 < 0 && num2 < 0 && num3 < 0) {
            System.out.println(num1 * 0);
            System.out.println(num2 * 0);
            System.out.println(num3 * 0);
        }


    }
}
