package scr.kurs2.week2.day2HomeWork.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miha on 14.06.2016.
 */
public class Reader {
    private String name;
    private String surname;
    private int idCard;
    private long telNumber;
    private boolean blackList;
    private List<Print> prints;

    private int countPrint;

    /**
     * Конструктор класса
     **/
    public Reader(String name, String surname, int idCard, long telNumber) {
        this.name = name;
        this.surname = surname;
        this.idCard = idCard;
        this.telNumber = telNumber;
        this.prints = new ArrayList<>();
    }

    /**гетеры и сетеры***/

    public List<Print> getPrints() {
        return prints;
    }
    public boolean isBlackList() {
        return blackList;
    }


    public void setCountPrint(int countPrint) {
        this.countPrint = countPrint;
    }

    public int getCountPrint() {
        return countPrint;
    }

    public String getName() {
        return name;
    }




    @Override
    public String toString() {
        return String.format("%s,%s,%d,%d,", name, surname, idCard, telNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;

        Reader tmp = (Reader) obj;
        return ((tmp.name == this.name) && (tmp.surname == this.surname) && (tmp.idCard == this.idCard) &&
                (tmp.telNumber == this.telNumber) && (tmp.blackList == this.blackList) && (tmp.prints == this.prints));
    }

}

