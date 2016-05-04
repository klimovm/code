package scr.kurs1.week2;

import java.util.Arrays;
import java.util.Scanner;

/*Алгоритм
1)Объявляем метод сканер
2)Вводим с консоли строку
3)Объявляем переменную  типа char со значением  "а"
4)Преобразовуем строку в массив "Чаров"

* */

/**
 * Created by miha on 04.05.2016.
 */

//Посчитать колличество букв 'a' в строке (искомый символ может быть разным)

public class Work_Dopolnit3 {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Введите какой то текст: ");
//        String text = scn.next();
//        char a = 'a';
//        char [] massiv = text.toCharArray();
//        System.out.println(massiv);

        Scanner scn = new Scanner(System.in);
        String[] mass = new String[3];

        for (int i = 0; i < mass.length; i++) {
            System.out.println("введите елемент массива " + (i + 1));
            mass[i] = scn.next();
        }
        String string1 = Arrays.toString(mass);
        String string2 = string1.replaceAll("а", "");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println("колличество букв 'a' в строке = " + (string1.length() - string2.length()));
    }
}
