package kurs2.week5.clones;

import java.io.Serializable;

/**
 * Created by miha on 04.07.2016.
 */
public class Person implements Cloneable, Serializable{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age;
    }
}
