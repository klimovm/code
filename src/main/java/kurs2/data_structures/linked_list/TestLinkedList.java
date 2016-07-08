package kurs2.data_structures.linked_list;


import kurs2.week2.day2HomeWork.library.Author;

import java.util.ArrayList;

/**
 * Created by miha on 29.06.2016.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        Author author1 = new Author("Вася", "1111");
        Author author2 = new Author("Саша", "2222");
        Author author3 = new Author("Витя", "3333");

        MyLinkedList list = new MyLinkedList();
        list.add( author1);
        list.add( author2);
        list.add( author3);

        MyLinkedList list2 = new MyLinkedList();
        list2.add("Man");
        list2.add("Woman");
        list2.add("Child");

        MyLinkedList list3 = new MyLinkedList();
        list3.add("M");
        list3.add("W");
        list3.add("C");

        showList(list);
        showList(list2);

        list.addAll(list2);
        showList(list);

        System.out.println("==========containsAllCollection======");
        System.out.println(list.containsAll(list2));

        System.out.println("==========removeAllCollection======");
        list.removeAll(list2);
        showList(list);
        System.out.println(list.size());


        System.out.println("==========containsObj=====");
        System.out.println(list.contains(author1));

        System.out.println("++++++++++++++");
        list.addAll(list2);
        list.retainAll(list2);
        showList(list);

        System.out.println("==========clear======");
        list.clear();

        list.add(0,222);
        list.addAll(1,list2);
        showList(list);

        System.out.println(list.removeAll(list3));
        showList(list);







       /* System.out.println("==========IndexOf======");
        System.out.println(list.indexOf(author2));
        System.out.println("===========================");

        System.out.println("==========lastIndexOf======");
        System.out.println(list.lastIndexOf(author1));
        System.out.println("===========================");

        System.out.println("========contains============");
        System.out.println(list.contains(11111));
        System.out.println("============================");


        System.out.println("===========toArray==============");
        list.toArray();
        System.out.println("============================");

        list.set(1,"Катя");
        showList(list);

        System.out.println(list.get(1));
        System.out.println();


        list.remove(author3);
        showList(list);

        System.out.println("==========add index node======");
        list.add(2,"Новая нода");
        showList(list);


        System.out.println("==========Подсписок======");
        showList((MyLinkedList) list.subList(0,2));



        System.out.println("==========Удаление по объекту======");
        list.remove(author1);
        showList(list);



        System.out.println("==========to array======");


        System.out.println("==========clear======");
        list.clear();
        showList(list);*/

    }

    private static void showList(MyLinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
