package scr.kurs2.week2.day2HomeWork.studArrayList;



import java.util.Comparator;

/**
 * Created by Mihail on 31.05.2016.
 */
public class ComparatorSortByMark implements Comparator <Student> {
    public int compare(Student obj1, Student obj2) {
        if (obj1 == null && obj2 == null) return 0;
        if (obj1 != null && obj2 == null) return 1;
        if (obj1 == null && obj2 != null) return 1;


        double mark1 = obj1.getMiddleMark();
        double mark2 = obj2.getMiddleMark();

        if(mark1 > mark2) {
            return 1;
        }
        else if(mark1 < mark2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}


