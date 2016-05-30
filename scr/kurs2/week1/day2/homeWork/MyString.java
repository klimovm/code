package scr.kurs2.week1.day2.homeWork;

import scr.kurs1.week2.ArrayUtils;

import java.util.Arrays;

/**
 * Created by miha on 27.05.2016.
 */
public class MyString {
    private char[] strokaChar;


    /******************************************************************************************************************/
    /*Из масива чаров в стринг*/
    public String charToString(char[] a) {
        return String.copyValueOf(a);
    }

    /******************************************************************************************************************/
/*              ВЫВОД НА ЭКРАН.
  написал два метода что бы лучше запоминалось*/
    public void printString(String a) {
        System.out.print(a);
    }

    public void printStringChar(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    /******************************************************************************************************************/
    /* КОНКАТЕНАЦИЯ*/
    public String concatString(char[] a, char[] b) {
        if (a == null) return charToString(b);
        if (b == null) return charToString(a);
        char[] c = new char[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return charToString(c);
    }
    /******************************************************************************************************************/
    /* ПОНИЖЕНИЕ РЕГИСТРА*/
    public void lowCase(char[] a){
        for (char d:a ) {
            if (Character.isLowerCase(d))
                d = Character.toUpperCase(d);
            else  d =Character.toLowerCase(d);
        }
    }





}
