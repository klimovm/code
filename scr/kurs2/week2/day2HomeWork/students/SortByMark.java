package scr.kurs2.week2.day2HomeWork.students;

import java.util.Comparator;

/**
 * Created by Mihail on 31.05.2016.
 */
public class SortByMark implements Comparator <Student> {
    public int compare(Student obj1, Student obj2) {
        if (obj1 == null && obj2 == null) return 0;
        if (obj1 != null && obj2 == null) return 1;
        if (obj1 == null && obj2 != null) return 1;


        double price1 = obj1.getAverageMark();
        double price2 = obj2.getAverageMark();


        if(price1 > price2) {
            return 1;
        }
        else if(price1 < price2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}


