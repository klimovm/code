package scr.kurs2.week1.day2.homeWork;

/**
 * Created by miha on 27.05.2016.
 */
public class TestMyString {
    public static void main(String[] args) {

        MyString myString = new MyString();

        char[] name = {'c', 'а', 'ш', 'а'};
        char[] surname = {'п', 'е', 'т', 'р', 'о', 'в'};

        myString.printStringChar(name);
        System.out.println();

        myString.printStringChar(surname);
        System.out.println();

        //Конкатенация
        myString.printString(myString.concatString(name, surname));

        //регистр
        System.out.println();
        System.out.println("регистры");
        myString.printString(myString.lowCase(name));

        //Подстроки
        System.out.println();
        myString.printString(myString.subString(surname, 0, 4));

        //поиск елемента по индексу
        System.out.println();
        System.out.println(myString.searchElement(name,2));


    }

}
