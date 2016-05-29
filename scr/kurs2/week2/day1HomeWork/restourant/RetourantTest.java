package scr.kurs2.week2.day1HomeWork.restourant;

import scr.kurs2.week2.day1ClassWork.inheritence.Coder;
import scr.kurs2.week2.day1ClassWork.inheritence.QA;

/**
 * Created by Mihail on 28.05.2016.
 */
public class RetourantTest {
    public RetourantTest() {
    }

    public static void main(String[] args) {

        Stuff weiter = new Waiter("Vika",21,"W",1122);
        Stuff bartender = new Bartender("Oleg",33,"M",3322,20);

        weiter.work();
    }
}
