package kurs2.week2.day2ClassWork.abstract_classes;

/**
 * Created by miha on 31.05.2016.
 */
public class Subzero extends Fighter{


    public int extraDamage;

    public Subzero(String name, int damage) {
        super(name, damage);
        extraDamage = (int)(Math.random() * 20);

    }

    @Override
    public void hit(Fighter fighter) {
        fighter.health -= damage + extraDamage;
        System.out.println(fighter.health);
    }
}