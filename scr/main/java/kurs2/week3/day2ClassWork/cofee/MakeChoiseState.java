package kurs2.week3.day2ClassWork.cofee;

/**
 * Created by miha on 14.06.2016.
 */
public class MakeChoiseState implements State {

    CoffeeMachine coffeeMachine ;

    public MakeChoiseState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void moneyIn() {
        System.out.println("You've already put money");
    }

    @Override
    public void makeChoice() {
        System.out.println("Nice choice");
        System.out.println("Are you sure?");
    }

    @Override
    public void makeDrink() {
        System.out.println("Making drink");
        coffeeMachine.setCurrentState(coffeeMachine.getInProcess());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
        coffeeMachine.setCurrentState(coffeeMachine.getNoMoney());
    }

    @Override
    public void cancel() {
        System.out.println("make choice");
    }

    @Override
    public void giveMoney() {
        System.out.println("Take your money");
        coffeeMachine.setCurrentState(coffeeMachine.getNoMoney());
    }
}