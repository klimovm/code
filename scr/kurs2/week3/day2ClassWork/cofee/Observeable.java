package scr.kurs2.week3.day2ClassWork.cofee;

/**
 * Created by miha on 14.06.2016.
 */
public interface Observeable {
    void addObserver(MyObserver observer);
    void removeObserver(MyObserver observer);
    void notifyObservers();

}
