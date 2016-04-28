package scr.kurs1.week2;

/**
 * Created by miha on 20.04.2016.
 */

//Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй

public class Work3 {
    public static void main(String[] args) {

        int[] masiv1 = {9, 2, 6, 5, 7};
        System.out.print("первый массив  ");

        for (int v : masiv1) {
            System.out.print(v + " ");
        }

        System.out.println("   ");

        int[] masiv2 = new int[5];
        System.out.print("Второй массив  ");

        for (int d : masiv2) {
            System.out.print(d + " ");
        }


        System.out.println(" ");
        System.out.print("данные из первого массива во второй  ");
        for (int i = 0; i < masiv1.length; i++) {
            masiv2[i] = masiv1[i];
        }
//        masiv2[0]=masiv1[0];
//        masiv2[1]=masiv1[1];
//        masiv2[2]=masiv1[2];
//        masiv2[3]=masiv1[3];
//        masiv2[4]=masiv1[4];
        for (int c : masiv2) {
            System.out.print(c + " ");
        }


    }
}
