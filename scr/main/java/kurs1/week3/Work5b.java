package kurs1.week3;

import static kurs1.week3.Work5a.printMatrixString;

/**
 * Created by miha on 12.05.2016.
 */

//Поменять наибольший и наименьший столбик в двухмерном массиве.

public class Work5b {
    public static void main(String[] args) {
        String[][] mas = {
                {"1", "51"},
                {"22", "51"},
                {"333", "6"}
        };
        System.out.println("Размер матрицы:" + mas.length);
        System.out.println("Входящая матрица:");
        printMatrixString(mas);
        //int sum = count(mas);
        System.out.println(count(mas));

    }

    public static int count(String[][] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                count += mass[i][j].length();
            }
        }
        return count;
    }
}

