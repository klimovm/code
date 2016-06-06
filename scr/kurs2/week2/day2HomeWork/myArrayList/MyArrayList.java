package scr.kurs2.week2.day2HomeWork.myArrayList;



/**
 * Created by miha on 03.06.2016.
 */
public class MyArrayList {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_SIZE = 10;



    public MyArrayList(Object[] elements) {
        size = 0 ;
        this.elements = elements;
    }

    public boolean add (Object o){
        if (o == null) return false;

        return true;

    }



}
