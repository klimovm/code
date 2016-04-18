package kurs1.week1;
import  java.util.Scanner;

/**
 * Created by Mihail on 17.04.2016.
 */
//Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления
// (целую часть от деления  и остачу)в другом случае выводим false и показываем результат деления
// (целую часть от деления  и остачу)
public class work7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("input number 1");
        double n1 = scr.nextInt();
        System.out.println("input number 2");
        double n2 = scr.nextInt();
        double res = n1 / n2;
        boolean a =  (n1 % n2 == 0 );
        System.out.println(res);
        System.out.println(a);


    }
}
