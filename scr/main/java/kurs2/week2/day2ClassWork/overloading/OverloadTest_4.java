package kurs2.week2.day2ClassWork.overloading;

/**
 * Created by miha on 31.05.2016.
 */
public class OverloadTest_4 {
    public static void main(String[] args) {
        process("asd");
        process("asd", "asd");
        process("asd", "asd", "asd");
    }
    public static void process(String... s) {
        System.out.print("*");
    }
    public static void process(String s) {
        System.out.print("1");
    }
    public static void process(String s, String a) {
        System.out.print("2");
    }
    /*public static void process(String s, String... a) {
        System.out.print("3");
    }*/
}
