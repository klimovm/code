package scr.kurs1.Week3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mihail on 09.05.2016.
 */

/*
Матрицы генерировать случайными числами и размер матрицы вводит юзер.
Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
*/
public class Work1 {
    public static void main(String[] args) {
        int [][] matrix = Utils.MatrixGenerate();

        String res = Utils.toString(matrix);
        System.out.println("Случайная матрица:");
        System.out.println(res);

        System.out.println();

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]%5==0){
                    matrix[i][j] = 8;
                }

            }

        }
        String res2 = Utils.toString(matrix);
        System.out.println("Преобразованая матрица:");
        System.out.println(res2);

    }
}
