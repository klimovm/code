package scr.kurs2.week2.day2ClassWork.abstract_classes;

/**
 * Created by miha on 31.05.2016.
 */
public class LukKang extends Fighter{

    public LukKang(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void hit(Fighter fighter) {
        fighter.health -= damage;
        System.out.println(fighter.health);
    }
}