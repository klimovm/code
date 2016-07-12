package kurs2.week1.day2;

import java.util.Comparator;

/**
 * Created by miha on 12.07.2016.
 */
public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getBirthDay().compareTo(s2.getBirthDay());
    }
}
