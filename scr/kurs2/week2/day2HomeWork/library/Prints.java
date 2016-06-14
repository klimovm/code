package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Prints {

    private String name;
    private int yearPrint;
    private int counterPrint;

    public Prints(String name, int yearPrint, int counterPrint) {
        this.name = name;
        this.yearPrint = yearPrint;
        this.counterPrint = counterPrint;
    }

    @Override
    public String toString() {
        return String.format("%s,%d",name,yearPrint);
    }
}
