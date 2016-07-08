package kurs2.week4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miha on 29.06.2016.
 */
public class _01GenericAreHelpful {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add("Ddd");
//      ClassCastException
        String s = (String)list.get(0);
    }
}
