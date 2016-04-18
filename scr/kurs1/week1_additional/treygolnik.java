package scr.kurs1.week1_additional;
import java.util.*;

/**
 * Created by miha on 18.04.2016.
 */
//1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
//        лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
public class treygolnik {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первую сторону");
        int a = scn.nextInt();
        System.out.println("Введите вторую сторону");
        int b = scn.nextInt();
        System.out.println("Введите третью сторону");
        int c = scn.nextInt();
        if (((a + b) > c) && ((b + c) >a) && ((a + c)) > b) {
            System.out.println("Это трехугольник");
        }
        else {
            System.out.println("Это не трехугольник");
        }




    }
}
