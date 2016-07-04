package kurs2.week2.day1HomeWork.restourant;

/**
 * Created by Mihail on 28.05.2016.
 */
public class Bartender extends Stuff {
    private int idCard;

    public Bartender(java.lang.String name, int age, java.lang.String gender, int idCard, int power) {
        super(name, age, gender);
        this.idCard = idCard;
        this.power = power;
    }

    private int power;



}
