package scr.kurs1.week1_additional;

import java.util.Scanner;

/**
 * Created by miha on 19.04.2016.
 */

//Определить, является ли шестизначное число "счастливым"
// (сумма первых трех цифр равна сумме последних трех цифр).

public class Additional_14_ {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ввелите шестизначное число");
        String number = scn.next();

        String n1 = number.substring(0, 1);// Ищем подстроку в строке
        Integer N1 = new Integer(n1); //Преобразование подстроки в число

        String n2 = number.substring(1, 2);
        Integer N2 = new Integer(n2);

        String n3 = number.substring(2, 3);
        Integer N3 = new Integer(n3);

        String n4 = number.substring(3, 4);
        Integer N4 = new Integer(n4);

        String n5 = number.substring(4, 5);
        Integer N5 = new Integer(n5);

        String n6 = number.substring(5, 6);
        Integer N6 = new Integer(n6);

        if ((N1 + N2 + N3 == N4 + N5 + N6))
            System.out.println("Число счастливое");
        else
            System.out.println("Число хреновое");
    }
}
