package scr.kurs1.week1_additional;
import java.util.Scanner;

/**
 * Created by miha on 18.04.2016.
 */

//Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна пара равных
public class additional5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scn.nextInt();
        String a1 = Integer.toString(a);//преобразование числа в строку
        System.out.println("Введите второе число");
        int b = scn.nextInt();
        String b1 = Integer.toString(b);//преобразование числа в строку
        System.out.println("Введите третье число");
        int c = scn.nextInt();
        String c1 = Integer.toString(c);//преобразование числа в строку
        if (a1.equals(b1) || b1.equals(c1) || a1.equals(c1)) System.out.println("Пара имеется");
        else System.out.println("Нет совпадений");

    }
}
