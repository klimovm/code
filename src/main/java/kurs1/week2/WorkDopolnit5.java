package kurs1.week2;

/**
 * Created by miha on 04.05.2016.
 */

//Заменить в строке все символы 'a' на '@' и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"

public class WorkDopolnit5 {
    public static void main(String[] args) {

        String string1 = "array is a data type";
        String string2 = string1.replaceAll("a", "@");
        System.out.println(string2);

    }
}
