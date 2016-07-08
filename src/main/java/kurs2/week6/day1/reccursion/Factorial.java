package kurs2.week6.day1.reccursion;

/**
 * Created by miha on 04.07.2016.
 */
public class Factorial {
    public static void main(String[] args) {
        // 5! = 1*2*3*4*5
        // 5! = 5*4!(4*3!(...))
        int factor = factorial(5);
        System.out.println(factor);
    }

    private static int factorial(int number) {
        if (number <= 1) return 1;
        int count = number * factorial(number -1);
        return count;
    }


}
