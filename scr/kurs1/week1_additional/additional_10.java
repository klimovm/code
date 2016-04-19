package scr.kurs1.week1_additional;
import java.util.Scanner;

/**
 * Created by miha on 19.04.2016.
 */

//Написать программу вычисления стоимости переговоров, если по субботам и воскресеньям
// предоставляется 20% скидка.Ввести продолжительность разговора и день недели (цифра от 1 до 7)

public class additional_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите номер дня недели(1,2,3,4,5,6 либо 7");
        int day = scn.nextInt();
        System.out.println("Введите продолжительность разговора в минутах");
        int time = scn.nextInt();
        double tsena = 1.0;
        double sale = tsena * 0.2;
        switch (day){
            case 1:
            {
                System.out.println("В понедельник вы наговорили на " + time * tsena + " грн.");
            }
            break;
            case 2:
            {
                System.out.println("Во вторник вы наговорили на " + time * tsena + " грн.");
            }
            break;
            case 3:
            {
                System.out.println("В среду вы наговорили на " + time * tsena + " грн.");
            }
            break;
            case 4:
            {
                System.out.println("В четверг вы наговорили на " + time * tsena + " грн.");
            }
            break;
            case 5:
            {
                System.out.println("В пятницу вы наговорили на " + time * tsena + " грн.");
            }
            break;
            case 6:
            {
                System.out.println("В субботу вы наговорили на " + ((time *tsena) - time*sale) + " грн.");
            }
            break;
            case 7:
            {
                System.out.println("В воскресенье вы наговорили на " + ((time *tsena) - time*sale) + " грн.");
            }
            break;
        }

    }
}
