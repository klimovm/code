package scr.kurs2.week2.day2HomeWork.myArrayList;

import java.util.ArrayList;

/**
 * Created by miha on 03.06.2016.
 */
public class TestMyArrayList {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Саша", "Петров", 1988, 1);
        Worker worker2 = new Worker("Коля", "Иванов", 1989, 2);
        Worker worker3 = new Worker("Катя", "Жукова", 1986, 4);

        MyArrayList list = new MyArrayList();

        list.add(worker1);
        list.add(worker2);
        list.add(worker1);
        list.add(worker3);
        list.add(worker1);
        list.add(worker1);
        list.add(worker1);

        list.show();
        System.out.println("Размер листа с null: " + list.getSize());
        System.out.println("Размер листа реальных значений: " + list.getCounter());

        System.out.println("======Удаление по индексу==========");
        list.removeInt(1);
        list.show();
        System.out.println("Размер листа с null: " + list.getSize());
        System.out.println("Размер листа реальных значений: " + list.getCounter());

        System.out.println("======Удаление по объекту==========");
        list.remove(worker1);
        list.show();
        System.out.println("Размер листа с null: " + list.getSize());
        System.out.println("Размер листа реальных значений: " + list.getCounter());

    }
}