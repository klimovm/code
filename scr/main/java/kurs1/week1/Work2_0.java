package kurs1.week1;

import java.util.Scanner;

/**
 * Created by Mihail on 16.04.2016.
 */

//Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
public class Work2_0 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите первое число");
        int n1 = scr.nextInt();

        System.out.println("Введите второе число");
        int n2 = scr.nextInt();

        System.out.println("Введите третье число");
        int n3 = scr.nextInt();

        if (n1 > n2 && n2 > n3) System.out.println("Найбольшое: " + n1 + "\n" + "Найменшое: " + n3);
        else if (n1 > n3 && n3 > n2) System.out.println("Найбольшое: " + n1 + "\n" + "Найменшое: " + n2);
        else if (n2 > n1 && n1 > n3) System.out.println("Найбольшое: " + n2 + "\n" + "Найменшое: " + n3);
        else if (n2 > n3 && n3 > n1) System.out.println("Найбольшое: " + n2 + "\n" + "Найменшое: " + n1);
        else if (n3 > n1 && n1 > n2) System.out.println("Найбольшое: " + n3 + "\n" + "Найменшое: " + n2);
        else if (n3 > n2 && n2 > n1) System.out.println("Найбольшое: " + n3 + "\n" + "Найменшое: " + n1);


    }
}
