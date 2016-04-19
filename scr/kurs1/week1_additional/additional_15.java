package scr.kurs1.week1_additional;
import java.util.Scanner;

/**
 * Created by miha on 19.04.2016.
 */

//Известны площади круга и квадрата. Определить:
// а) уместится ли круг в квадрат; б) уместится ли квадрат в круге.

public class additional_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите площадь квадрата");
        int kvadrat = scn.nextInt();
        System.out.println("Введите площадь круга");
        int krug = scn.nextInt();
    }
}
