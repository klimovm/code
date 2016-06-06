package scr.kurs2.week2.day2HomeWork.myArrayList;


/**
 * Created by miha on 03.06.2016.
 */
public class MyArrayList {


    private Object[] elements;
    private int size;//для изменения общего количества
    private static final int DEFAULT_SIZE = 10;
    private int counter;// количество занятых ячеек не null

    public MyArrayList() {
        elements = new Object[this.DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }


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

    /*********
     * Вывод на экран
     ************/
    public void show() {
        for (int i = 0; i < counter; i++) {
            System.out.println(elements[i]);
        }
    }

    /****************
     * Удаление объекта с листа
     ******/
    public boolean remove(Object obj) {

        for (int i = 0; i < counter; i++) {
            if (obj.equals(elements[i])) {
                System.arraycopy(elements, i +1 , elements, i, counter - i-1);
                counter--;
            }
        }
        return true;
    }


    public boolean removeInt(int index){
        int numMoved = size - index - 1;
        System.arraycopy(elements, index + 1, elements, index, numMoved);
        elements[--size] = null;
        counter--;
        return true;
    }
}


