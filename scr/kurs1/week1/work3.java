package kurs1.week1;
import java.util.Scanner;

/**
 * Created by Mihail on 16.04.2016.
 */

//Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
public class work3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scr.nextInt();
        if (n%7 == 0) System.out.println(n*n);
        else System.out.println("Данное число не делиться на цело");

    }
}
