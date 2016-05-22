package scr.kurs2.week1.day2;

import scr.kurs2.week1.day1.Student;
import scr.utils.Mydate;

/**
 * Created by Mihail on 22.05.2016.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student("Aex", new Mydate(1989, 10, 11), 'M');
        System.out.println(st1.asString());
    }
}
