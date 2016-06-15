package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Author {
    private String name;
    private String surname;

    /**
     * Конструктор класса
     **/
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        /* obj ссылается на null */
        if (obj == null) return false;
        /* Удостоверимся, что ссылки имеют тот же самый тип */
        if (!(getClass() == obj.getClass())) return false;

        Author tmp = (Author) obj;
        return ((tmp.name == this.name) && (tmp.surname == this.surname));
    }
}

