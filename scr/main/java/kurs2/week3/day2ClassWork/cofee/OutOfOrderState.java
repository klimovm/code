package kurs2.week3.day2ClassWork.cofee;

/**
 * Created by miha on 14.06.2016.
 */
public class OutOfOrderState implements State {
    CoffeeMachine coffeeMachine;

    public OutOfOrderState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void moneyIn() {
        System.out.println("Sorry out of order");
    }

    @Override
    public void makeChoice() {
        System.out.println("Sorry out of order");

    }

    @Override
    public void makeDrink() {
        System.out.println("Sorry out of order");

    }

    @Override
    public void cancel() {
        System.out.println("Sorry out of order");

    }

    @Override
    public void giveMoney() {
        System.out.println("Sorry out of order");
    }
}