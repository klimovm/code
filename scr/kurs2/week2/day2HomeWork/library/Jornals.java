package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Jornals extends Prints {

    private int number;

    /**
     * Конструктор класса
     **/
    public Jornals(String name, int yearPrint, int counterPrint, int number) {
        super(name, yearPrint, counterPrint);
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", super.toString(), number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        if (!super.equals(obj)) return false;
        else {
            Jornals tmp = (Jornals) obj;
            if (tmp.number == this.number) return true;
            else return false;
        }
    }
}
