package scr.kurs1.Week3;

import java.util.Scanner;

/**
 * Created by miha on 10.05.2016.
 */
public class Work3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String stroka = in.next();
        System.out.println( Utils.PaliandrMetod(stroka));
    }
}
