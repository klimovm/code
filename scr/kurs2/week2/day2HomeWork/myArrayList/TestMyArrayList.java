package scr.kurs2.week2.day2HomeWork.myArrayList;

import scr.kurs2.week2.day2HomeWork.studArrayList.Group;

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

        /***Добавляем в список по объекту в конец списка ****/
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(worker3);
        list.add(worker2);
        list.add(worker1);


        System.out.println("==========Показываем изначальный список==========");
        list.show();
        System.out.println("Размер листа: " + list.getSize());
        System.out.println("К-во непустых елементов в листе: " + list.getCounter());


        System.out.println("========Добавляем в список объект в заданый индекс ============");
        list.add(10,777);
        list.add(3,4444);
        list.show();
        System.out.println("Размер листа: " + list.getSize());
        System.out.println("К-во непустых елементов в листе: " + list.getCounter());


        System.out.println("==========Удаление елемента по индексу==========");
        list.remove(0);
        list.show();
        System.out.println("Размер листа: " + list.getSize());
        System.out.println("К-во непустых елементов в листе: " + list.getCounter());


        System.out.println("==========Удаление елемента по объекту==========");
        list.remove(worker1);
        list.show();
        System.out.println("Размер листа: " + list.getSize());
        System.out.println("К-во непустых елементов в листе: " + list.getCounter());


        System.out.println("========get============");
        System.out.println(list.get(9));

        System.out.println("========set============");
        list.set(1,888);
        list.show();


        System.out.println("========Contains=======");
        System.out.println(list.contains(worker2));

        System.out.println("========clear=======");
        list.clear();
        list.show();

    }
}