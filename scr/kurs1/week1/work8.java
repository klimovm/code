package kurs1.week1;

import java.util.Scanner;

/**
 * Created by Mihail on 17.04.2016.
 */

//Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
//        124    4    -   true
//        1456   567  -   false
//        1      2    -   false
//        18     98   -   true

public class Work8 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите первое число");
        int n1 = scr.nextInt();

        System.out.println("Введите второе число");
        int n2 = scr.nextInt();

        int num1 = n1 % 10;
        int num2 = n2 % 10;
        boolean a = (num1 == num2);

        System.out.println(a);

    }


}
