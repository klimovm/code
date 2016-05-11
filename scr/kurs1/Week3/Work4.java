package scr.kurs1.week3;

import scr.kurs1.week2.ArrayUtils;

/**
 * Created by miha on 10.05.2016.
 */
/*
        Создать массив, который будет состоять из диагонали матрици
		1 3 5
		4 5 7  -  1 5 6
		4 5 6
		*/
public class Work4 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.MatrixGenerate();
        System.out.println("Наша матрица:");
        System.out.println(MatrixUtils.toString(matrix));
        int[] mass = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mass[i] = matrix[i][j];
                }
            }
        }
        System.out.println("Наш массив с диагонали:");
        ArrayUtils.printArr(mass);
        }
}

