package kurs2.week6.day1.reccursion;

/**
 * Created by miha on 04.07.2016.
 */
public class RecursionIntro {
    public static void main(String[] args) {
        a(5);
    }

    private static void a(int i) {
        //while true
        if (i == 0) return;
        System.out.println(i);
        a(i -1);
        System.out.println(i);
    }
}
