package scr.kurs2.week1.day2.homeWork;

import java.util.Arrays;

/**
 * Created by miha on 27.05.2016.
 */
public class MyString {
    private char [] str;

    public char[] getStr() {
        return str;
    }

    public void setStr(char[] str) {
        this.str = str;
    }



    public void printString(char[]str){
        for (int i = 0; i <str.length ; i++) {
            System.out.println(str[i]);
        }
    }
}
