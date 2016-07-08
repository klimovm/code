package kurs2.week4.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by miha on 29.06.2016.
 */
public class _03TypeErasure {
    public static void main(String[] args) {

        List<Object> letters = new ArrayList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");

        print(letters);


    }

    public static void print(Collection collection){
        for (Object o : collection) {
            System.out.println(o);
        }
    }

    public static void print(List<Integer> list){
        for (Object o : list) {
           // int get = integer;
            System.out.println(o);
        }
    }
}
