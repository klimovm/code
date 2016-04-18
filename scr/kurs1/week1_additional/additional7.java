package scr.kurs1.week1_additional;
import java.util.Scanner;

/**
 * Created by Mihail on 18.04.2016.
 */

//Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о времени года.
// Если пользователь введет недопустимое число, программа должна выдать сообщение об ошибке.
public class additional7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scn.nextInt();
        if (month <1 || month>12){
            System.out.println("Не правильно ввели номер");
        }
        if (month > 2 && month < 6) {
            System.out.println("Весна");
        }
        if (month > 5 && month < 9) {
            System.out.println("Лето");
        }
        if (month > 8 && month < 12) {
            System.out.println("Осень");
        }
        else System.out.println("Зима");
    }
}
