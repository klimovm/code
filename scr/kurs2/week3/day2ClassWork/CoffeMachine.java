package scr.kurs2.week3.day2ClassWork;

/**
 * Created by Mihail on 05.06.2016.
 */
public class CoffeMachine implements State {
    private State nomaney;
    private  State makeChois;
    private State outOfOrder;
    private State inProcces;
    private State curentState;

    private int coffePrise;

    public CoffeMachine(){
        this.nomaney = new NoMoney();
        this.makeChois= new MakingChois();
        this.outOfOrder = new OutOfOrder();
        this.inProcces = new InProcces();

        curentState = nomaney;
        coffePrise = 15;

    }

    @Override
    public void moneyIn() {
        curentState.makeChois();
    }

    @Override
    public void makeChois() {

    }

    @Override
    public void makeDrink() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public void giveRest() {

    }
}
