package kurs2.week6.day1.reccursion;

/**
 * Created by miha on 11.07.2016.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(2));
    }

    private static int fibonacci(int i) {
    if (i<2) return i;
        return fibonacci(i-1)+fibonacci(i-2);
    }

}
