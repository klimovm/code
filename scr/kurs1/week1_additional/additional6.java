package scr.kurs1.week1_additional;
import java.util.Scanner;

/**
 * Created by miha on 18.04.2016.
 */

//У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
public class additional6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Единицы измерения км/ч,км и час");
        System.out.println("Введите скорость");
        double v = scn.nextDouble();
        System.out.println("Введите растояние ");
        double s = scn.nextDouble();
        double t = s / v;
        System.out.println(t);
    }
}
