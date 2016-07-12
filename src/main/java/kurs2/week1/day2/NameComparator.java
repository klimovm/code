package kurs2.week1.day2;

import java.util.Comparator;

/**
 * Created by miha on 12.07.2016.
 */
public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getName().compareTo(o2.getName()));
    }
}
