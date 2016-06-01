package scr.myTrening.comparator;

import java.util.Comparator;

/**
 * Created by miha on 31.05.2016.
 */
public class SortedByName implements Comparator<Product>{
    public int compare(Product obj1, Product obj2) {

        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
}
