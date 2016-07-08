package kurs2.week2.day2HomeWork.students;

import kurs2.utils.Mydate;

/**
 * Created by miha on 23.05.2016.
 */
public class TDD {
    public static void main(String[] args) {
        Group group = new Group("ACO13");
        Student st1 = new Student("Aex", new Mydate(1989, 10, 11), 'M',1.1);

        boolean expected = true;
        boolean actual = group.addStudent(st1);

        System.out.printf("Metod name - %s, result - %s," +
                          "expected -%s, actual - %s\n", "addStudent"
                          , expected == actual,expected,actual);

        boolean expected1 = true;

        boolean actual1 = group.delStudent("name");

        System.out.printf("Metod name - %s, result - %s," +
                        "expected -%s, actual - %s\n", "delStudent"
                , expected1 == actual1,expected1,actual1);

    }


}
