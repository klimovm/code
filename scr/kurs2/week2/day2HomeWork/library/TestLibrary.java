package scr.kurs2.week2.day2HomeWork.library;

import java.util.ArrayList;

/**
 * Created by miha on 15.06.2016.
 */
public class TestLibrary {
    public static void main(String[] args) {

        Author a1 = new Author("Федор","Достоевский");
        Author a2 = new Author("Лев","Толстой");
        Author a3 = new Author("Михаил","Булгаков");
        Author a4 = new Author("Николай","Гоголь");

        Reader r1 = new Reader("Саша","Петров",1,2222222);
        Reader r2 = new Reader("Коля","Иванов",2,3333333);
        Reader r3 = new Reader("Игорь","Сидоров",3,4444444);
        Reader r4 = new Reader("Вася","Филимонов",2,5555555);


    }
}
