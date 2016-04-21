package scr.kurs1.week2;

import java.util.Arrays;

/**
 * Created by miha on 20.04.2016.
 */

//Поменять местами наибольший и наименьший элементы в массиве

public class Work2 {
    public static void main(String[] args) {
        int[] mas = {2, 6, 8, 10, 3};

        System.out.print("Входящий массив:  ");
        for (int v : mas)
            System.out.print(v + "  ");
        System.out.println(" ");


        int min = mas[0];
        int max = mas[0];

        for (int i = 0; i < mas.length; i++) {

            if (min > mas[i])
                min = mas[i];
            if (max < mas[i])
                max = mas[i];
        }

        System.out.println("Минимум " + min);
        System.out.println("Максимум " + max);
        System.out.print("исходящий массив:  ");

        if (min != max)
            for (int i = 0; i < mas.length; i++)
                if (mas[i] == max)
                    mas[i] = min;
                else if (mas[i] == min)
                    mas[i] = max;
        for (int i = 0; i < mas.length; i++)

            System.out.print(mas[i] + "  ");
        System.out.println();

    }
}

