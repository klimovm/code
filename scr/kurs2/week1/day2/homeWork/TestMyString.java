package scr.kurs2.week1.day2.homeWork;

/**
 * Created by miha on 27.05.2016.
 */
public class TestMyString {
    public static void main(String[] args) {

        MyString myString = new MyString();

        char[] name = {'с', 'а', 'ш','а'};
        char[] surname = {'п', 'е', 'т','р','о','в'};

        myString.printString(myString.charToString(name));
        System.out.println();

        myString.printStringChar(surname);
        System.out.println();


    }

}
