package scr.kurs2.week2.day2HomeWork.myArrayList;


/**
 * Created by miha on 03.06.2016.
 */
public class MyArrayList {


    private Object[] elements;

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getDefaultSize() {
        return DEFAULT_SIZE;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    private int size;
    private static final int DEFAULT_SIZE = 10;
    private int counter;


    public MyArrayList() {
        elements = new Object[this.DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    /********************
     * Добавление объекта в ArrayList
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
            elements[counter++] = obj;
            size = sizeNew;
        }
        return true;
    }

    public void show(){
        for (int i = 0; i <elements.size(); i++) {
            System.out.println(elements.get(i));
        }
    }



}


