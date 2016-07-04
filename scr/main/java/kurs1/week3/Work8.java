package kurs1.week3;

import java.util.Scanner;



/**
 * Created by miha on 13.05.2016.
 */
/*
        Напишите программу, которая позволяет пользователю ввести в консоли строку,
		переводит первый символ слов в верхний регистр и результат выводит в консоль
		Вход:
		иван васильевич
		Выход:
		Иван Васильевич
*/
public class Work8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input stream");
        String stream = in.nextLine();
        System.out.println("Our stream:"+stream);

        int indexProbel = stream.indexOf(" ");

        String a1 =stream.substring(0,1);
        String aA1 = a1.toUpperCase();

        String a2 =stream.substring(indexProbel+1,(indexProbel+2));
        String aA2 = a2.toUpperCase();

        String d1 =stream.replaceAll(a1,aA1);
        String d2 = d1.replaceAll(a2,aA2);
        System.out.println(d2);




    }
}
