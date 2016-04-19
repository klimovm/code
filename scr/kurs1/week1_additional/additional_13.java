package scr.kurs1.week1_additional;
import java.util.Scanner;

/**
 * Created by miha on 19.04.2016.
 */

//Даны три числа A,B,C. Увеличить числа в два раза,
// если A+B+C>0, в противном случае заменить на нули.

public class additional_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int A = scn.nextInt();
        System.out.println("Введите втророе число");
        int B = scn.nextInt();
        System.out.println("Введите третье число");
        int C = scn.nextInt();
        if ((A + B + C) >0 ){
            System.out.println(2*A + "  " + 2*B + "  " + 2*C);
        }
        else
        {
            System.out.println(0*A + "  " + 0*B + "  " + 0*C);
        }
    }
}
