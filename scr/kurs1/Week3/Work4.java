package scr.kurs1.Week3;

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
        //int [][] matrix = {{2,3,5},{4,2,7},{4,5,2}};
        int[][] matrix = Utils.MatrixGenerate();
        System.out.println("Наша матрица:");
        System.out.println(Utils.toString(matrix));
        int[] mass = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mass[i] = matrix[i][j];
                }
            }
        }
        System.out.println("Наш массив с диагонали:");
        for (int v : mass) {
            System.out.print(v + " ");
        }
    }
}
