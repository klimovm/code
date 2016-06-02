package scr.myTrening.arrayList;


import java.util.ArrayList;


/**
 * Created by miha on 02.06.2016.
 */
public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Саша");
        a1.add("1988");
        a1.add("Студент");
        System.out.println(a1.size());

        //Вывод ArrayList на консоль
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
        System.out.println();

        //заменяет по индексу
        a1.set(1, "Петров");
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
        System.out.println();

        //удаление ячеек по индексу со здвигом справа на лево
        a1.remove(1);
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
        System.out.println();

        //добавление ячейки по индексу со сдвигом вправо
        a1.add(1, "Трололо");
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
    }


}
