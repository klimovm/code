package scr.kurs2.week2.day2HomeWork.myArrayList;


import java.util.Arrays;

import java.util.Objects;

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
        size = DEFAULT_SIZE;
    }

    public int getSize() {
        return size;
    }

    public int getCounter() {
        return counter;
    }




    /*********Вывод листа на консоль******/
    public void show() {
        for (int i = 0; i < counter; i++) {
            System.out.println(elements[i]);
        }
    }

    /*********Добавление объекта в ArrayList*****/
    public boolean add(Object obj) {
        if (obj == null) return false;
        ensureCapacity();
        elements[counter++] = obj;
        return true;
    }
    /****************************************************/

    public void ensureCapacity(){
        if (counter >= size) {
            elements = Arrays.copyOf(elements, size * 2);
            size = size * 2;
        }
    }

    /*********Добавление объекта в ArrayList по индексу******/
    public boolean add(int index, Object obj) {
        if (index > counter || index < 0) {
            return false;
        }
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, counter - index);
        elements[index] = obj;
        counter++;
        return true;
    }

    /*********Удаление объекта в ArrayList*******/
    public boolean remove(Object obj) {
        for (int i = 0; i < counter; i++) {
            if (obj.equals(elements[i])) {
                System.arraycopy(elements, i + 1, elements, i, counter - i - 1);
                elements[--counter] = null;
                return true;
            }
        }
        return false;
    }

    /*********Удаление объекта в ArrayList по индексу******/

    public Object remove(int index) {
        if (index < counter && index >= 0) {
            int numForCopy = counter - index - 1;        //какое количество элементов надо скопировать
            System.arraycopy(elements, index + 1, elements, index, numForCopy);
            elements[--counter] = null;                 //уменьшаем размер массива и забываем про последний элемент
            return elements[index];
        } else return false;
    }

    /*************Метод получения объекта по индексу******************/
    public Object get(int index) {
        if (index >= 0 && index < counter) {
            return elements[index];
        }
        return null;
    }

    /*********Метод Set.Заменяем объект новым объектом в позиции*******/
    public Object set(int index, Object obj) {
        if (index < counter && index >= 0) {
            Object oldValue = elements;
            elements[index] = obj;
            return oldValue;
        }
        return false;
    }
    /*********Метод size.Показываем сколько непустых елементов*******/
    public int size() {
        return counter;
    }

    /*********Метод Contains.Проверяет есть ли объект в листе*******/
    public boolean contains(Object obj) {
        if (obj == null) return false;
        for (int i = 0; i < counter; i++) {
            if (obj.equals(elements[i]))
                return true;
        }
        return false;
    }
    /*********Метод Clear.Очищаем массив(заполняем null*******/
    public boolean clear() {
        for (int i = 0; i < counter; i++) {
            elements[i] = null;
        }
        return true;
    }

}


