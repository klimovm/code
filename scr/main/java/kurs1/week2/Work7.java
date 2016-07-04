package kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 20.04.2016.
 */

//алгоритм:
//1)Вводим данные масива(масив из 4х елементов).
//2)Считаем сумму первых двух елементов.
//3)считаем сумму последних двух елементов.
//4)Суммы делем на количество елементов каждой половине массива
//5)Сравниваем и выводим на



//Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
public class Work7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] masiv = new int[4];

        for (int i = 0; i < masiv.length; i++){
            System.out.println("Введите число " + (i+1));
             masiv[i] = scn.nextInt();
        }

        System.out.print("Наш масив: ");
        for (int i=0; i<masiv.length;i++){
        System.out.print(masiv[i] + " ");}

        int summa1 = 0;
        for (int i = 0; i < masiv.length/2; i++) {
            summa1 = (summa1 + masiv[i]);
        }
        int srednee1 = summa1 / (masiv.length/2);

        int summa2 = 0;
        for (int i =masiv.length /2 ; i <(masiv.length); i++) {
            summa2 = (summa2 + masiv[i]);
        }
        int srednee2 = (masiv.length/2);
        System.out.println();
        if (srednee1 > srednee2){
            System.out.println(masiv[0]+" "+masiv[1]);
        }
        else System.out.println(masiv[2]+" "+masiv[3]);

    }
}

