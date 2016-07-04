package kurs2.week2.day1HomeWork.restourant;

/**
 * Created by Mihail on 28.05.2016.
 */
public class Stuff {
    private  String name;
    private  int age;
    private String gender;



    public Stuff(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public  String asString(){
        return String.format("Name -%s,age -%d,gender - %s",name,age,gender);
    }
    public void work(){
        System.out.println("I am working");
    }
}
