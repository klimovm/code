package scr.kurs2.week2.day1HomeWork.restourant;

/**
 * Created by Mihail on 28.05.2016.
 */
public class Administrator extends Stuff {
    private  Stuff [] stuffs;

    public Administrator(String name, int age, String gender, Stuff[] stuffs) {
        super(name, age, gender);
        this.stuffs = stuffs;
    }

    @Override
    public String asString (){
        return String.format("Name-%s,age - %d,gender - %s",super.asString());
    }

    @Override
    public void work() {
        System.out.println("I am working");
    }
     public void clouseTable(){
         System.out.println("I closed table");
     }



}
