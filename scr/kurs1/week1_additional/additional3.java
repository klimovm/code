package scr.kurs1.week1_additional;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

/**
 * Created by miha on 18.04.2016.
 */

//Дано трехзначное число. Определить: а) верно ли, что все его цифры одинаковые;
// б) есть ли среди его цифр одинаковые.
public class Additional3 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите трехзначное число");
        String x = scr.next();

        String s1 = x.substring(0, 1);
        String s2 = x.substring(1, 2);
        String s3 = x.substring(2, 3);

        if (s1.equals(s2) && s1.equals(s3)) {
            System.out.println("все его цифры одинаковые");
        } else if (s1.equals(s2) || s1.equals(s3) || s2.equals(s3)) {
            System.out.println("есть одинаковые цифры");
        }

    }

}
