package scr.kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 28.04.2016.
 */

//Проверить или является число простым

public class Work_Dopolnit2 {

    public static boolean isPrime(int t) {
        for(int i = 2; i <= Math.sqrt(t) ; i++) {
            if(t%i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();


        if(n > 1) {
            if (isPrime(n)) {
                System.out.println("Вы ввели простое число");
            }
        }

    }
}
