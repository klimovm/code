package scr.kurs2.week2.day2HomeWork.myArrayList;

import java.util.ArrayList;

/**
 * Created by miha on 03.06.2016.
 */
public class TestMyArrayList {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Саша","Петров",1988,1);
        Worker worker2 = new Worker("Коля","Иванов",1989,2);
        Worker worker3 = new Worker("Катя","Жукова",1986,4);

        String a = "22";

        MyArrayList list = new MyArrayList();

        list.add(a);
        System.out.println(list.toString());
        }


    }