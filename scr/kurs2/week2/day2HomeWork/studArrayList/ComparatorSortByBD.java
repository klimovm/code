package scr.kurs2.week2.day2HomeWork.studArrayList;


import scr.utils.Mydate;

import java.util.Comparator;

/**
 * Created by miha on 01.06.2016.
 */
public class ComparatorSortByBD implements Comparator <Student> {

    @Override
    public int compare(Student obj1, Student obj2) {
       /* if (obj1 == null && obj2 == null) return 0;
        if (obj1 != null  && obj2 == null) return -1;
        if (obj1 == null && obj2 != null) return 1;*/

        Mydate date1 = obj1.getBd();
        Mydate date2 = obj2.getBd();

        return date1.compareTo(date2);
    }
    public boolean equalsBD(){
        return true;
    }
}
