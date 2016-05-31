package scr.kurs2.week2.day2ClassWork.overloading;

/**
 * Created by miha on 31.05.2016.
 */
public class OverloadTest_2 {
    public static void main(String[] args) {
        print((byte) 1);
        print(1);
    }
    public static void print(short n) {
        System.out.println(n);
    }

    public static void print(Integer n) {
        System.out.println(n);
    }
}
