package scr.kurs2.week2.day2HomeWork.library;

import java.util.List;

/**
 * Created by miha on 14.06.2016.
 */
public class Book extends Print {


    private Author author;

    /**
     * Конструктор класса
     **/
    public Book(String name, int yearPrint, Author author) {
        super(name, yearPrint);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(),author);
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        if (!super.equals(obj)) return false;
        Book tmp =(Book) obj;
        return (tmp.author == this.author);
    }
}
