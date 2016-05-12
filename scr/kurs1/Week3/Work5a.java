package scr.kurs1.week3;

import scr.kurs1.week2.ArrayUtils;

import java.util.Arrays;

/**
 * Created by miha on 10.05.2016.
 */
//а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)

public class Work5a {
    public static void main(String[] args) {
        String[][] matrix = {{"Олег", "Ян", "Витя1"},
                             {"Катя1111", "Даша11", "Настя11", "Соня1"},
                             {"Кот", "Пес2"}};
        System.out.println("Входящая матрица:");
        printMatrixString(matrix);

        String[] max = matrix[0];
        String[] min = matrix[0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }

        }

        System.out.println(matrix.length);
        //  System.out.println(Arrays.toString(max));
        //  System.out.println(Arrays.toString(min));

    }


    /******************************************************************************************************************/
    public static void printMatrixString(String[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
    }

    /******************************************************************************************************************/
    public static int count(String[] masiv) {
        String line = "";
        for (int i = 0; i < masiv.length; i++) {
            line += masiv[i].toString();
        }
        int count = line.length();
        return count;
    }
}

