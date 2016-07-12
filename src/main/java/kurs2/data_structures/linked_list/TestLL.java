package kurs2.data_structures.linked_list;


import java.util.List;

/**
 * Created by miha on 29.06.2016.
 */
public class TestLL {
    public static void main(String[] args) {


        MyLinkedList list = new MyLinkedList();


        list.add(5);


        int expected = 1;
        int actual = list.size();
        boolean result = actual == expected;

        System.out.printf("Metod add, result %s, actual - %d, expected %d\n", result, actual, expected);

        list.add(15);
        list.add(25);

        for (Object o : list) {
            System.out.println(o);
        }

        /***************************************************************************************************/

        MyLinkedList list3 = new MyLinkedList();
        list3.add(4);
        list3.add(5);
        list3.add(6);

        MyLinkedList list4 = new MyLinkedList();
        MyLinkedList list66 = new MyLinkedList();
        list4.add(4);
        list4.add(5);
        list4.add(6);

        /***************************************************************************************************/
        list.addAll(list3);
        actual = list.size();
        expected = 6;
        result = actual == expected;
        System.out.printf("Metod addAll(collection), result %s, actual - %d, expected %d\n", result, actual, expected);
        /***************************************************************************************************/


        boolean actualBool = list.removeAll(list3);
        boolean expectedBool = false;
        boolean resultBool = actualBool = expectedBool;
        System.out.printf("Metod removeAll(collection), resultBool %s, actualBool - %s, expectedBool %s\n", resultBool, actualBool, expectedBool);
        /***************************************************************************************************/

        list.addAll(0,list4);
        actual = list.size();
        expected = 9;
        result = actual == expected;
        System.out.printf("Metod addAll(index,collection), result %s, actual - %d, expected %d\n", result, actual, expected);

        /***************************************************************************************************/


        list.removeAll(list4);
        actual = list.size();
        expected = 6;
        result = actual == expected;
        System.out.printf("Metod removeAll(Collection c), result %s, actual - %d, expected %d\n", result, actual, expected);list.removeAll(list4);

        /***************************************************************************************************/

        expected = 5;
        actual = list.lastIndexOf((int) 25);
        result = actual == expected;

        System.out.printf("Metod lastIndexOf, result %s, actual - %d, expected %d\n", result, actual, expected);



        /***************************************************************************************************/

        expected = 2;
        actual = list.indexOf(25);
        result = actual == expected;

        System.out.printf("Metod indexOf, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 2;
        actual = list.size();
        result = actual == expected;

        System.out.printf("Metod add, result %s, actual - %d, expected %d\n", result, actual, expected);


        expected = 5;
        actual = (Integer) list.get(0);
        result = actual == expected;

        System.out.printf("Metod get, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 5;
        actual = (Integer) list.remove(0);
        result = actual == expected;

        System.out.printf("Metod get, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 25;
        actual = (Integer) list.remove(1);
        result = actual == expected;

        System.out.printf("Metod remove, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 15;
        actual = (Integer) list.remove(0);
        result = actual == expected;

        System.out.printf("Metod remove, result %s, actual - %d, expected %d\n", result, actual, expected);

        /***************************************************************************************************/
        list.clear();
        actual = list.size();
        expected = 0;
        result = actual == expected;
        System.out.printf("Metod clear, result %s, actual - %d, expected %d\n", result, actual, expected);

        // TODO: 07.07.2016  findNode переспросить
        // TODO: 07.07.2016  set переспросить



    }
}
