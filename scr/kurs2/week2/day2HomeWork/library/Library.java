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


    //добавить читателя в список читателей
    public boolean addReader(Reader reader) {
        if (reader == null) return false;
        if (readers.contains(reader)) return false;
        return readers.add(reader);
    }

    //посмотреть список читателей
    public void showReaders() {
        Collections.sort(readers, new ComparatorSortByNameReader());
        for (int i = 0; i < readers.size(); i++) {
            System.out.println(readers.get(i));
        }
    }


    //добавить печатное издание в библиотеку
    public boolean addPrint(Print print) {
        if (print == null) return false;
        if (prints.contains(print)) {
            print.setCounterPrint(print.getCounterPrint() + 1);
            return true;
        } else
            print.setCounterPrint(print.getCounterPrint() + 1);
            return prints.add(print);

    }

    //посмотреть список доступных конкретных печатных изданий
    public void showPrints() {
        Collections.sort(prints, new ComparatorSortByNamePrints());
        for (int i = 0; i < prints.size(); i++) {
            System.out.println(prints.get(i));
        }
    }

    /**выдать печатное издание читателю (если книга есть в наличии)***/
    public boolean givePrintRider(Print print,Reader reader){
        if (print == null || reader == null) return false;
        if (reader.getCountPrint() > 3 || reader.isBlackList()) return false;

        reader.getPrints().add(print);
        reader.setCountPrint(reader.getCountPrint()+1);

        int index;
        index = prints.indexOf(print);
        if (prints.get(index).getCounterPrint() > 1) {
            prints.get(index).setCounterPrint(prints.get(index).getCounterPrint() - 1);
        } else if (prints.get(index).getCounterPrint() == 0) {
            prints.remove(index);
        }
        return false;
    }

    public void showIssueOfReader(Reader reader) {
        if (reader == null || !readers.contains(reader)) return;
        if (reader.getPrints().size() > 0) {
            System.out.println(reader.getName() + " :");
            for (int i = 0; i < reader.getPrints().size(); i++) {
                System.out.println(reader.getPrints().get(i));
            }
        } else
            System.out.println("Readers do not have prints");
    }



}
