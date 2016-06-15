package scr.kurs2.week2.day2HomeWork.library;

import scr.kurs2.week2.day2HomeWork.library.comparators.ComparatorSortByNamePrints;
import scr.kurs2.week2.day2HomeWork.library.comparators.ComparatorSortByNameReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by miha on 14.06.2016.
 */
public class Library {
    private String name;
    private String adress;
    private List<Reader> readers;
    private List<Print> prints;

    /**
     * Конструктор класса
     **/
    public Library(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.prints = new ArrayList<>();
        this.readers = new ArrayList<>();
    }



  public boolean addReader(Reader reader) {
      if (reader == null) return false;
      if (readers.contains(reader)) return false;
      return readers.add(reader);
  }
    public void showReaders(){
        Collections.sort(readers,new ComparatorSortByNameReader());
        for (int i = 0; i <readers.size() ; i++) {
            System.out.println(readers.get(i));
        }
    }



    public boolean addPrints(Print print) {
        if (print == null) return false;
        if (prints.contains(print)) return false;
        return prints.add(print);
    }
    public void showPrints(){
        Collections.sort(prints,new ComparatorSortByNamePrints());
        for (int i = 0; i <prints.size() ; i++) {
            System.out.println(prints.get(i));
        }
    }




}