package scr.kurs2.week2.day2HomeWork.library;

import java.util.ArrayList;

/**
 * Created by miha on 14.06.2016.
 */
public class Lybrary {
    private String name;
    private String adress;
    private ArrayList<Reader> reader;
    private ArrayList<Prints> prints;


    public Lybrary(String name, String adress, ArrayList<Reader> reader, ArrayList<Prints> prints) {
        this.name = name;
        this.adress = adress;
        this.reader = reader;
        this.prints = prints;
    }


}
