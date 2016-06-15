package scr.kurs2.week2.day2HomeWork.library.comparators;

import scr.kurs2.week2.day2HomeWork.library.Print;
import scr.kurs2.week2.day2HomeWork.library.Reader;

import java.util.Comparator;

/**
 * Created by miha on 15.06.2016.
 */
public class ComparatorSortByNamePrints implements Comparator <Print>{


    @Override
    public int compare(Print o1, Print o2) {
        return o1.getName().compareTo(o2.getName());
    }
}