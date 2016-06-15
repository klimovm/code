package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Book extends Print {


    /**
     * Конструктор класса
     **/
    public Book(String name, int yearPrint, int counterPrint, Author author) {
        super(name, yearPrint, counterPrint,author);
    }

    @Override
    public String toString() {
        return String.format("%s,", super.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        return super.equals(obj);
    }
}
