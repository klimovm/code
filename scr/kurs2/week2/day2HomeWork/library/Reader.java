package scr.kurs2.week2.day2HomeWork.library;

import java.util.ArrayList;

/**
 * Created by miha on 14.06.2016.
 */
public class Reader {
    private String name;
    private String surname;
    private int idCard;
    private long telNumber;
    private boolean blackList;
    private ArrayList<Prints> prints;

    public Reader(String name, String surname, int idCard, long telNumber, boolean blackList, ArrayList<Prints> prints) {
        this.name = name;
        this.surname = surname;
        this.idCard = idCard;
        this.telNumber = telNumber;
        this.blackList = blackList;
        this.prints = prints;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%d,",name,surname,idCard,telNumber);
    }
}
