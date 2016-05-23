package scr.myTrening;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by miha on 23.05.2016.
 */
public class SortStringArray {
    public static void main(String[] args) {
        String [] auto = {"BMW","Opel","Audi"};
        Ac(auto);

    }
    public static void Ac (String [] mas) {
        Arrays.sort(mas, Collections.<String>reverseOrder());
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " ");
        }
    }
}
