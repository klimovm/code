package scr.kurs2.week3.day2ClassWork.cofee;

/**
 * Created by miha on 14.06.2016.
 */
public class InProcessState implements State {

    CoffeeMachine coffeeMachine;

    public InProcessState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void moneyIn() {
        System.out.println("You've already put money");
    }

    @Override
    public void makeChoice() {
        System.out.println("You've already make choice");

    }

    @Override
    public void makeDrink() {
        System.out.println("Drink is already making");


    }

    @Override
    public void cancel() {
        System.out.println("Drink is already making");
    }

    @Override
    public void giveMoney() {
    }
}