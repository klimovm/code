package scr.kurs2.week2.day2HomeWork.myArrayList;


/**
 * Created by miha on 03.06.2016.
 */
public class MyArrayList {


    private Object[] elements;
    private int size;
    private static final int DEFAULT_SIZE = 10;
    private int counter;


    public MyArrayList() {
        elements = new Object[this.DEFAULT_SIZE];
    }

    /********************
     * Добавление обїекта в ArrayList
     ***************/
    public boolean add(Object obj) {
        if (obj == null) return false;
        else if (counter < size) {
            elements[counter++] = obj;
        } else {
            int sizeNew = size * 2;
            Object[] elementsNew = new Object[sizeNew];
            System.arraycopy(elements, 0, elementsNew, 0, size);
            elements = elementsNew;
            size = sizeNew;
            counter++;
        }
        return true;
    }
}


