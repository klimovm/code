package kurs2.week1.day2;

import kurs2.utils.MyDate;

import java.util.Arrays;

/**
 * Created by Mihail on 22.05.2016.
 */
public class TestStudent {
    public static void main(String[] args) {

        Student st1 = new Student("Alex",
                new MyDate(1977, 12, 12),
                Gender.MALE);
        Student st2 = new Student("Johnny",
                new MyDate(1963, 12, 12),
                Gender.MALE);
        Student st3 = new Student("Anna",
                new MyDate(1999, 12, 12),
                Gender.FEMALE);
        Student st4 = new Student("Kate",
                new MyDate(2014, 12, 12),
                Gender.FEMALE);



        /*Student[] students = new Student[2];
        students[1] = st1;
        students[0] = st2;
        System.out.println(Arrays.toString(students));
        System.out.println(st1.equals(st2));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));*/

        Group aco13 = new Group("ACO13");

        aco13.addStudent(st1);
        aco13.addStudent(st2);
        aco13.addStudent(st3);
        aco13.addStudent(st4);

        aco13.showGroup();
        aco13.sort();
        System.out.println("-----age-----");
        aco13.showGroup();
        aco13.setComparator(new MarkComparator());
        aco13.sort();
        System.out.println("----mark------");
        aco13.showGroup();
        aco13.setComparator(new NameComparator());
        aco13.sort();
        System.out.println("-----name-----");
        aco13.showGroup();

//        System.out.println(st1.toString());
    }
}
