package kurs1.week1;
import  java.util.Scanner;

/**
 * Created by Mihail on 16.04.2016.
 */
//Вводим два числа, вывести их суму,
// если она в диапазоне от 11 до 19
public class work6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите первое число");
        int n1 = scr.nextInt();
        System.out.println("Введите второе число");
        int n2 = scr.nextInt();
        int summa = n1 + n2;
        if (summa >= 11 && summa <= 19) System.out.println(summa);
        else System.out.println("не попало в диапазон");
    }
}
