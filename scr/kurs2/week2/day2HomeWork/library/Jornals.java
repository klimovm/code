package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Jornals extends Prints {

    private int number;

    public Jornals(String name, int yearPrint, int counterPrint, int number) {
        super(name, yearPrint, counterPrint);
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", super.toString(),number);
    }

}
