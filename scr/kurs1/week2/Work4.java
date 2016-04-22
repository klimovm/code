package scr.kurs1.week2;

import java.util.Scanner;
import java.util.Arrays;


/**
 * Created by miha on 20.04.2016.
 */

//Посчитать сколько цифр(цифра задается пользователем) в массиве
public class Work4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] mass = new int[5];

        for (int i = 0; i < mass.length; i++) {
            System.out.println("введите елемент массива " + (i + 1));
            mass[i] = scn.nextInt();

        }

        String arrStr = Arrays.toString(mass);  //преобразование в строку из массива
        String string2 = arrStr.replaceAll(" ", ""); //со старой строки убираем пробелы и создаем новую
        String string3 = string2.replaceAll(",", "");// с предедущей строки убираем запятые и создаем новую.
        System.out.println("Количество  цифр в массиве: " + (string3.length() - 2));   /* выводим на консоль длину новой строки
         "-2" это количество символов "[" и "]".Так как не знаю как убрать эти символы при замене символов.*/

    }
}






