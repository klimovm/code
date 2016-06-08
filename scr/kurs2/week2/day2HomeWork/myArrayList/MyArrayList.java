package scr.kurs2.week2.day2HomeWork.myArrayList;


import java.util.Objects;

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

    /*********Добавление объекта в ArrayList*******/
    public void show() {
        for (int i = 0; i < counter; i++) {
            System.out.println(elements[i]);
        }
    }

    /*********Добавление объекта в ArrayList******/
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

    /*********Добавление объекта в ArrayList по индексу*******/
    public boolean addIndex(int index,Object obj) {
        if (counter < size) {
            if (index < counter && index >= 0) {
                System.arraycopy(elements, index, elements, index + 1, counter - index);
                elements[index] = obj;
                counter++;
            }
            return true;
        }
        else {
            int sizeNew = size * 2;
            Object[] elementsNew =  new Object[sizeNew];
            System.arraycopy(elements, 0, elementsNew, 0, counter);
            elements = elementsNew;
            System.arraycopy(elementsNew, index, elementsNew, index + 1, counter - index);
            elementsNew[index] = obj;
            counter++;
            size = sizeNew;

        }
        return true;
    }

    /*********Удаление объекта в ArrayList*******/
    public boolean remove(Object obj) {
        for (int i = 0; i < counter; i++) {
            if (elements[i].equals(obj)) {
                System.arraycopy(elements, i + 1, elements, i, counter - i - 1);
                elements[--counter] = null;
                return true;
            }
        }
        return false;
    }

    /*********Удаление объекта в ArrayList по индексу*******/
    public boolean removeIndex(int index) {
        if (index < counter && index >= 0) {
            int numForCopy = counter - index - 1;        //какое количество элементов надо скопировать
            System.arraycopy(elements, index + 1, elements, index, numForCopy);
            elements[--counter] = null;                 //уменьшаем размер массива и забываем про последний элемент
            return true;
        } else return false;
    }

    /*************Метод получения объекта по индексу********************/
    public Object get(int index) {
        if (index >= 0 && index < counter) {
            return elements[index];
        }
        return null;
    }

    /*********Метод Set.Заменяем объект новым объектом в позиции*******/
    public boolean satIndex(int index,Object obj) {
        if (index < counter && index >= 0){
            elements[index] = obj;
            return true;
        }
        return false;
    }

}


