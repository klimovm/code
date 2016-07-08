package kurs2.week3.day2ClassWork.cofee;

/**
 * Created by miha on 14.06.2016.
 */
public class NoMoneyState implements State {
    CoffeeMachine coffeeMachine ;

    public NoMoneyState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void moneyIn() {
        System.out.println("Make your choice");
        coffeeMachine.setCurrentState(coffeeMachine.getMakeChoice());
    }

    @Override
    public void makeChoice() {
        System.out.println("Put money first");
    }

    @Override
    public void makeDrink() {
        System.out.println("Put money first");
    }

    @Override
    public void cancel() {
        System.out.println("Put money first");
    }

    @Override
    public void giveMoney() {
        System.out.println("Put money first");
    }
}