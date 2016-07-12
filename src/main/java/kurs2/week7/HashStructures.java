package kurs2.week7;

import kurs2.utils.Mydate;
import kurs2.week1.day2.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mihail on 09.07.2016.
 */
public class HashStructures {
    public static void main(String[] args) {
        Set<Student> set =new HashSet<>();
        Set<String> string =new HashSet<>();

        string.add("A");
        string.add("A");
        string.add("A");
        string.add("A");
        string.add("A");
        string.add("A");






        Student st1 = new Student("Alex",
                new Mydate(1989, 12, 12),
                'M');
        Student st2 = new Student("Jack",
                new Mydate(1989, 3, 13),
                'M');
        Student st3 = new Student("Anna",
                new Mydate(1988, 1, 3),
                'W');

        Student st4 = new Student("Jeniya",
                new Mydate(1988, 1, 3),
                'W');

        Student st5 = new Student("Jeniya",
                new Mydate(1988, 1, 3),
                'W');

        set.add(st1);
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);


        for (Student s:set ) {
            System.out.println(s);
        }
          //  System.out.println(set.contains(st5));


    }
}
