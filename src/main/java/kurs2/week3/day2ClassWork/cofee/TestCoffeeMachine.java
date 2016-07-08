package kurs2.week3.day2ClassWork.cofee;

/**
 * Created by miha on 14.06.2016.
 */
public class TestCoffeeMachine {
    public static void main(String[] args) {
        CoffeeCentre coffeeCentre = new CoffeeCentre();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeMachine coffeeMachine2 = new CoffeeMachine();

        coffeeCentre.addObserver(coffeeMachine);
        coffeeCentre.addObserver(coffeeMachine2);
        coffeeCentre.setCoffeePrice(20);
        coffeeCentre.setTeaPrice(10);

        System.out.println(coffeeMachine);
        System.out.println(coffeeMachine2);


        System.out.println(coffeeMachine);
        System.out.println(coffeeMachine2);

    }
}