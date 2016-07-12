package kurs2.week1.day2;

import java.util.Comparator;

/**
 * Created by miha on 12.07.2016.
 */
public class MarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getAverageMark() - o2.getAverageMark());
    }
}
