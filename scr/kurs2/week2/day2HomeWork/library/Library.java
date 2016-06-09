package scr.kurs2.week2.day2HomeWork.library;

import scr.utils.Mydate;



/**
 * Created by miha on 09.06.2016.
 */
public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Саша","Петров",new Mydate(1981,1,1),1);
        Reader reader2 = new Reader("Коля","Петров",new Mydate(1982,2,2),2);
        Reader reader3 = new Reader("Толя","Петров",new Mydate(1983,3,3),3);
        Reader reader4 = new Reader("Витя","Петров",new Mydate(1984,4,4),4);
        Reader reader5 = new Reader("Дима","Петров",new Mydate(1985,5,5),5);
        Reader reader6 = new Reader("Вася","Петров",new Mydate(1986,6,6),6);

        GroupLibrary readGroup = new GroupLibrary("readGroup");






    }
}
