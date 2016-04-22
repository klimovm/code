package scr.kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 20.04.2016.
 */

//Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные

public class Work5 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            // generate number and put into arr
            arr[i] = (int) (Math.random() * 100);
        }

    }
}
