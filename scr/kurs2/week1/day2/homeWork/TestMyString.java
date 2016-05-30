package scr.kurs2.week1.day2.homeWork;

/**
 * Created by miha on 27.05.2016.
 */
public class TestMyString {
    public static void main(String[] args) {

        MyString myString = new MyString();

        char[] scr = {'a', 'b', 'c'};
        String a = "bla-bla";

        /*Запустил два медода для наглядной проверки*/
        myString.printString(a);
        System.out.println();

        myString.printStringChar(scr);
        System.out.println();


    }

}
