package scr.kurs1.week1_additional;

import java.util.Scanner;

/**
 * Created by miha on 19.04.2016.
 */

//Известны площади круга и квадрата. Определить:
// а) уместится ли круг в квадрат; б) уместится ли квадрат в круге.

public class Additional_15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите площадь квадрата");
        int kvadratS = scn.nextInt();
        double storonakvadrata = Math.sqrt(kvadratS);//находим сторону квадрата
        double diagonal = Math.sqrt(2 * kvadratS);


        System.out.println("Введите площадь круга");
        int krugS = scn.nextInt();
        Double radiusKruga2 = krugS / 3.14;
        double radius = Math.sqrt(radiusKruga2);
        double diametrKruga = radius * 2;

        if (storonakvadrata > diametrKruga) {
            System.out.println("Круг помещается в квадрат");
        } else if (diametrKruga > diagonal) {
            System.out.println("Квадрат помещается в круг");
        } else System.out.println("Пересекаются");
    }
}
