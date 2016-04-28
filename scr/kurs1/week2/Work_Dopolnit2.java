package scr.kurs1.week2;

import java.util.Scanner;

/**
 * Created by miha on 28.04.2016.
 */

//Проверить или является число простым

public class Work_Dopolnit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if((n%i)==0){
                isPrime=false;
            }

        }
        if(isPrime) System.out.println(n+" Prostoe");
        else System.out.println("NE prostoe");
    }
}
