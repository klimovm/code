package scr.kurs2.week2.day1ClassWork.inheritence;

/**
 * Created by Mihail on 28.05.2016.
 */
public class QA extends Employee{
    private int extraMoney;

    public QA(int age, String name, String surname, int extraMoney) {
        super(age, name, surname);
        this.extraMoney = extraMoney;
    }

    public String asString(){
        return String.format("%s, bonus - %d", super.asString(), extraMoney);
    }

    @Override
    public void work(){
        System.out.println("I'm testing");
    }
}
