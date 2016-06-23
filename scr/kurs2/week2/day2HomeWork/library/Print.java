package scr.kurs2.week2.day2HomeWork.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miha on 14.06.2016.
 */
public class Print {

    private String name;
    private int yearPrint;
    private int counterPrint;
    List<Print> printList;


    /**
     * Конструктор класса
     **/
    public Print(String name, int yearPrint) {
        this.name = name;
        this.yearPrint = yearPrint;
        this.printList = new ArrayList<>();

    }

    public void setCounterPrint(int count) {
        this.counterPrint = count;
    }

    public int getCounterPrint() {
        return counterPrint;
    }

    public String getName() {
        return name;
    }

    public int getYearPrint() {
        return yearPrint;
    }

    @Override
    public String toString() {
        return String.format("Имя принта: %s,год:%d,к-во:%d", name, yearPrint,counterPrint);
    }




    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        Print tmp = (Print) obj;
        return ((tmp.name == this.name) && (tmp.yearPrint == this.yearPrint));
    }
}
