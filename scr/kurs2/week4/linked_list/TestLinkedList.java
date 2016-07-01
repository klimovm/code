package scr.kurs2.week4.linked_list;


import scr.kurs2.week2.day2HomeWork.library.Author;

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
        showList(list);

        list.set(1,"Трололо");
        showList(list);

        System.out.println(list.get(1));
        System.out.println();


        list.remove(author3);
        showList(list);

//dgkl;dfkgl;dfkgl;dfkgl;kdf




    }

    private static void showList(MyLinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
