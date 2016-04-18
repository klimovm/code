package scr.kurs1.week1_additional;
import java.util.Scanner;

/**
 * Created by Mihail on 18.04.2016.
 */

//Вычислить стоимость покупки с учетом скидки.
// Скидка в 10% предос-тавляется, если сумма покупки превышает 1000 гривен.

public class additional8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите стоимость покупки");
        int prise = scn.nextInt();
        int minimum = 1000;
        if (prise >= minimum){
            double bonus = prise *0.1;

            System.out.println("Стоимость покупки: "+ (prise - bonus));
        }
        else System.out.println("Бонуса нет.Стоимость покупки: " + prise);

    }
}
