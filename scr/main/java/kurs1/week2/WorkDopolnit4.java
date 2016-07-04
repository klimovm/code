package kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 04.05.2016.
 */

//Сдвинуть массив на заданное количество позиций
// {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
// Количество позиций и массив указывает пользователь

public class WorkDopolnit4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scn.nextInt();
        int[] massiv = new int[n];
        int[] massiv2 = new int[massiv.length];

        for (int i = 0; i < massiv.length; i++) {
            System.out.println("Введите " + (i + 1) + "-й елемент массива:");
            massiv[i] = scn.nextInt();
        }

        ArrayUtils.printArr(massiv);

        System.out.println();

        System.out.println("Введдите количество позиций для сдвига от 0 до " + (massiv.length - 1));
        int sdvig = scn.nextInt();
        if (sdvig > (massiv.length - 1) || sdvig < 0) {
            System.out.println("Вы ввели неверное число");
        } else {
            Sdvig(massiv,massiv2, sdvig);
            ArrayUtils.printArr(massiv2);
        }

    }

    public static void Sdvig(int[] massiv, int [] massiv2,int sdvig) {
        for (int i = massiv.length-1; i >= 0; i--) {
            if(i+sdvig >= massiv.length){
                massiv2[i+sdvig-massiv.length] = massiv[i];
            }
            else{
                massiv2[i+sdvig] = massiv[i];
            }
        }
    }
}
