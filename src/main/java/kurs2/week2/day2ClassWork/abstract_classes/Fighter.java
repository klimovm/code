package kurs2.week2.day2ClassWork.abstract_classes;

/**
 * Created by miha on 31.05.2016.
 */
public abstract class Fighter {
    public int health = 100;
    private String name;
    public int damage;

    public Fighter(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }



    public abstract void hit(Fighter fighter);

    public String asString() {
        return name;
    }
}
