package kurs2.week2.day1HomeWork.restourant;

/**
 * Created by Mihail on 28.05.2016.
 */
public class Waiter extends Stuff {
    private int idCard;

    public Waiter(String name, int age, String gender, int idCard) {
        super(name, age, gender);
        this.idCard = idCard;
    }

    public int getIdCard() {
        return idCard;
    }

    public void work(){
        System.out.println("я принимаю заказ");
    }

}
