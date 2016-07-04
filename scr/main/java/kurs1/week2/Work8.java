package kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 26.04.2016.
 */

// Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
// который получается в результате суммы arr1[i] + arr2[i]

public class Work8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите размер масивов");
        int n = scn.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Введите елемент 1 массива " + (i + 1));
            arr1[i] = scn.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Введите елемент 2 массива " + (i + 1));
            arr2[i] = scn.nextInt();
        }

        System.out.println();
        System.out.print("массив3 = ");
        int[] mass3 = new int[n];
        for (int i = 0; i < mass3.length; i++) {
            mass3[i] = arr1[i] + arr2[i];
            System.out.print(mass3[i] + " ");
        }


    }
}
