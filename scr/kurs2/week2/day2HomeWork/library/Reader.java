package scr.kurs2.week2.day2HomeWork.library;

import scr.utils.Mydate;

/**
 * Created by miha on 09.06.2016.
 */
public class Reader implements Comparable {
    public String name;
    public String surname;
    public Mydate bd;
    public int id;


    public Reader(String name, String surname, Mydate bd, int id) {
        this.name = name;
        this.surname = surname;
        this.bd = bd;
        this.id = id;
    }
    public String toString(){
        return String.format("%s,%s,%s,%d",name,surname,bd,id);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
