package kurs1.week1;
import  java.util.Scanner;

/**
 * Created by Mihail on 17.04.2016.
 */

//Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

public class work9dopolnit1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scr.nextInt();
        String b = Integer.toBinaryString(num);
       // String res = String.format("%x", num);
        System.out.println("В двоичной: "+ b );
        System.out.println("В десятичной: "+Integer.parseInt(b,2));


    }
}
