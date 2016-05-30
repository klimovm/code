package scr.kurs2.week1.day2.homeWork;

import java.util.Arrays;

/**
 * Created by miha on 27.05.2016.
 */
public class MyString {
    private char[] strokaChar;
    private String strokaString;

/********************************************************************************************************************/
/*написал два метода что бы лучше запоминалось*/
    public void printString(String a) {
            System.out.print(a);
        }
    public void  printStringChar(char [] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }

}
