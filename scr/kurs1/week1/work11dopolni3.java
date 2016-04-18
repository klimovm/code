package kurs1.week1;
import java.util.Scanner;

/**
 * Created by Mihail on 17.04.2016.
 */

// Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
//        5678  -   1
//        5889  -   2
//        8888  -   4
//        989990  - 1

public class work11dopolni3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число");
        String n = scr.next();
        int     cnt = 0;
        for(int i = 0; i < n.length(); i++) {
            if( n.charAt(i) == '8')
                cnt++;
        }
        System.out.print(cnt);


    }
}
