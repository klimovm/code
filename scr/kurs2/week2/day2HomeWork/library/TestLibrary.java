package scr.kurs2.week2.day2HomeWork.library;

import java.util.ArrayList;

/**
 * Created by miha on 15.06.2016.
 */
public class TestLibrary {
    public static void main(String[] args) {

        Author author1 = new Author("Федор","Достоевский");
        Author author2 = new Author("Лев","Толстой");
        Author author3 = new Author("Михаил","Булгаков");
        Author author4 = new Author("Николай","Гоголь");

        Reader reader1 = new Reader("Саша","Петров",1,2222222);
        Reader reader2 = new Reader("Коля","Иванов",2,3333333);
        Reader reader3 = new Reader("Игорь","Сидоров",3,4444444);
        Reader reader4 = new Reader("Вася","Филимонов",2,5555555);

        Print book1 = new Book("Идиот", 1869,3,author1);
        Print book2 = new Book("Анна Каренина", 1877,5,author2);



    }
}
