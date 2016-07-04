package kurs1.week2;

/**
 * Created by miha on 20.04.2016.
 */

//Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй

public class Work3 {
    public static void main(String[] args) {

        int[] masiv1 = {9, 2, 6, 5, 7};

        System.out.print("первый массив  ");
        ArrayUtils.printArr(masiv1);
        System.out.println();

        int[] masiv2 = new int[5];
        System.out.print("Второй массив  ");
        ArrayUtils.printArr(masiv2);
        System.out.println();

        System.out.print("данные из первого массива во второй  ");
        for (int i = 0; i < masiv1.length; i++) {
            masiv2[i] = masiv1[i];
        }
        ArrayUtils.printArr(masiv2);

    }
}
