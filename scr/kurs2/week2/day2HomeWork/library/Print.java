package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Print {

    private String name;
    private int yearPrint;
    private int counterPrint;

    /**
     * Конструктор класса
     **/
    public Print(String name, int yearPrint, int counterPrint) {
        this.name = name;
        this.yearPrint = yearPrint;
        this.counterPrint = counterPrint;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s,%d", name, yearPrint);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == 0) return false;
        if (!(getClass() == obj.getClass())) return false;
        Print tmp = (Print) obj;
        return ((tmp.name == this.name) && (tmp.yearPrint == this.yearPrint));
    }
}
