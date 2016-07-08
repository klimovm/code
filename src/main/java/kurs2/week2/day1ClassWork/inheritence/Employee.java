package kurs2.week2.day1ClassWork.inheritence;

/**
 * Created by Mihail on 28.05.2016.
 */
public class Employee {
    private int age;
    private String name;
    private String surname;

    public Employee() {
    }

    public Employee(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public String asString(){
        return  String.format("Name - %s, surname - %s, age - %d",
                name, surname, age);
    }

    public void work(){
        System.out.println("I'm working (Employee)");
    }


}