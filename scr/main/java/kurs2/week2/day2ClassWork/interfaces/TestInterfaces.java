package kurs2.week2.day2ClassWork.interfaces;

/**
 * Created by miha on 31.05.2016.
 */
public class TestInterfaces {
    public static void main(String[] args) {


        Walkable ant = new Ant();
        Flyable bird = new Bird();
        Swimmable fish = new Fish();

        Duck duck = new Duck();


        Ocean ocean = new Ocean(fish);
        Earth earth = new Earth(duck);
        Sky sky = new Sky(duck);
    }
}
