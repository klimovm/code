package scr.kurs2.week2.day2HomeWork.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miha on 14.06.2016.
 */
public class Lybrary {
    private String name;
    private String adress;
    private List<Reader> readers;
    private List<Print> prints;

    /**Конструктор класса**/
    public Lybrary(String name, String adress, ArrayList<Reader> reader, ArrayList<Print> prints) {
        this.name = name;
        this.adress = adress;
        this.readers = reader;
        this.prints = prints;
    }


}
