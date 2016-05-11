package scr.kurs1.week3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mihail on 09.05.2016.
 */
public class MatrixUtils {
    public static int[][] MatrixGenerate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число строк");
        int strok = in.nextInt();
        System.out.println("Введите количестко столбцов");
        int stolb = in.nextInt();
        int[][] matrix = new int[strok][stolb];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = random.nextInt(100);
        }
        return matrix;
    }

    /******************************************************************************************************************/


    public static String toString(int[][] mat) {
        if (mat == null) {
            return "wrong argument, mat is null";
        }

        if (mat.length == 0) {
            return "empty matrix";
        }

        String matRes = "";

        // row
        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                int col = mat[i][j];
                matRes += col + " ";
            }

            matRes += "\n";
        }

        return matRes;
    }

    /******************************************************************************************************************/

    public static int[][] RandomMatrix(int[][] matrix, int a, int b) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 5 == 0) {
                    matrix[i][j] = (int) Math.random();
                }
            }
        }
        return matrix;
    }

    /******************************************************************************************************************/
    public static String BooleantoString(boolean[][] mat) {
        if (mat == null) {
            return "wrong argument, mat is null";
        }

        if (mat.length == 0) {
            return "empty matrix";
        }

        String matRes = "";

        // row
        for (int i = 0; i < mat.length; i++) {
            boolean[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                boolean col = mat[i][j];
                matRes += col + " ";
            }

            matRes += "\n";
        }

        return matRes;
    }

    /******************************************************************************************************************/
    public static boolean PaliandrMetod(String stroka) {
        for (int i = 0, j = stroka.length() - 1; i < stroka.length() && j > 0; i++, j--) {
            if (stroka.charAt(i) != stroka.charAt(j)) return false;

        }
        return true;
    }
    /******************************************************************************************************************/


}
