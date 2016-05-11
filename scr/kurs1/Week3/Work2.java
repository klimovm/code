package scr.kurs1.week3;

/**
 * Created by miha on 10.05.2016.
 */
/*Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.*/
public class Work2 {
    public static void main(String[] args) {
        boolean[][] matrix = new boolean[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = true;
                }
            }
        }

        String res2 = MatrixUtils.BooleantoString(matrix);
        System.out.println(res2);
    }
}
