package scr.kurs1.week1_additional;

import java.util.Scanner;

/**
 * Created by miha on 19.04.2016.
 */

//Написать программу, которая в зависимости от характера ветра выдает сообщение
// о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -умеренный (2);
// от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
public class additional_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите скорость ветра");
        int skorost = scn.nextInt();
        if (skorost > 0 && skorost <5){
            System.out.println("Слабый ветер");
        }
        if (skorost > 4 && skorost <11){
            System.out.println("Умеренный ветер ");
        }
        if (skorost > 10 && skorost <18){
            System.out.println("Сильный ветер");
        }
        else if (skorost > 19){
            System.out.println("Ураганный ветер");
        }
    }

}
