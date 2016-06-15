package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Prints {

    private String name;
    private int yearPrint;
    private int counterPrint;

    /**
     * Конструктор класса
     **/
    public Prints(String name, int yearPrint, int counterPrint) {
        this.name = name;
        this.yearPrint = yearPrint;
        this.counterPrint = counterPrint;
    }

    @Override
    public String toString() {
        return String.format("%s,%d", name, yearPrint);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == 0) return false;
        if (!(getClass() == obj.getClass())) return false;
        else {
            Prints tmp = (Prints) obj;
            if ((tmp.name == this.name) && (tmp.yearPrint == this.yearPrint)) return true;
            else return false;
        }
    }
}
