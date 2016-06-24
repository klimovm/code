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

    /**
     * выдать печатное издание читателю (если книга есть в наличии)
     ***/
    public boolean givePrintRider(Print print, Reader reader) {
        if (print == null || reader == null) return false;
        if (reader.getCountPrint() >= 3 || reader.isBlackList() || reader.getPrints().contains(print)) return false;
        if (!prints.contains(print)) return false;

        reader.getPrints().add(print);
        print.setCounterPrint(print.getCounterPrint() - 1);
        reader.setCountPrint(reader.getCountPrint() + 1);
        if (print.getCounterPrint() == 0) prints.remove(prints.indexOf(print));

        return true;
    }

    public void showPrintReader(Reader reader) {
        if (reader == null || !readers.contains(reader)) return;
        if (reader.getPrints().size() > 0) {

            System.out.println(reader.getName() + " " + reader.getSurname() + ":");
            Collections.sort(reader.getPrints(), new ComparatorSortByNamePrints());
            for (int i = 0; i < reader.getPrints().size(); i++) {
                System.out.println(reader.getPrints().get(i));
            }
        } else
            System.out.println(reader.getName() + " " + reader.getSurname() + " не имеет на руках изданий");
    }


    public void showPrintsReaders() {
        for (Reader reader : readers) {
            if (reader.getCountPrint() > 0) {
                showPrintReader(reader);
            }
        }
    }

    public boolean addBlackListReader(Reader reader) {
        if (reader == null) return false;
        if (readers.contains(reader))
            reader.setBlackList(true);
        return true;
    }

    public void showBlackList() {
        for (Reader reader : readers) {
            System.out.println(reader + " " + reader.isBlackList());
        }
    }

    //посмотреть печатные издания конкретного года
    public void showPrintYear(int year) {
        List<Print> tmp = new ArrayList<>();
        for (int i = 0; i < prints.size(); i++) {
            if (prints.get(i).getYearPrint() == year) {
                tmp.add(prints.get(i));
            }
        }
        for (int i = 0; i < tmp.size(); i++) {
            System.out.println(tmp.get(i));
        }
    }


    //найти печатное издание по названию (ключевым словам)
    public void showPrintName(String name) {
        List<Print> tmp = new ArrayList<>();
        for (int i = 0; i < prints.size(); i++) {
            if (prints.get(i).getName() == name) {
                tmp.add(prints.get(i));
            }
        }
        for (int i = 0; i < tmp.size(); i++) {
            System.out.println(tmp.get(i));
        }
    }

    //посмотреть печатные издания конкретного автора
    public void showAuthorPrint(Object author) {
        List<Print> authorPrints = new ArrayList<>();
        for (int i = 0; i < prints.size(); i++) {
            if ( (prints instanceof Book) && ((Book) prints).getAuthor() == (author)) {
                authorPrints.add(prints.get(i));
            }
        }
        for (int i = 0; i < authorPrints.size(); i++) {
            System.out.println(authorPrints.get(i));
        }
    }
}
