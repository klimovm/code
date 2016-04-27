package scr.kurs1.week2;

/**
 * Created by miha on 26.04.2016.
 */

// обрезать массив по границам start и end

public class Work10 {
    public static void main(String[] args) {

        int[] mass1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int end = mass1[mass1.length - 2];
        int start = mass1[0];
        int[] mass2 = new int[end - start];

        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = mass1[start + i];
            System.out.print(mass2[i] + " ");
        }

        System.out.println(" ");
        System.out.println(mass1.length);
        System.out.println(mass2.length);


    }
}
