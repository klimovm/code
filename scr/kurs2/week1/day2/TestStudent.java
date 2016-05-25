package scr.kurs2.week1.day2;

import scr.utils.MyDate;

import java.util.Scanner;

/**
 * Created by Mihail on 22.05.2016.
 */
public class TestStudent {
    public static void main(String[] args){

        Student st1 = new Student("Alex",
                new MyDate(1989, 12, 12),
                'M');
        Student st2 = new Student("Jack",
                new MyDate(1989, 3, 13),
                'M');
        Student st3 = new Student("Alisa",
                new MyDate(1988, 1, 3),
                'W');

        Group aco13 = new Group("ACO13");

        aco13.addStudent(st1);
        aco13.addStudent(st2);
        aco13.addStudent(st3);

        aco13.showGroup();
        System.out.println();

        aco13.search("Alisa");








    }
}
