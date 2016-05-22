package scr.kurs2.week1.day1;

/**
 * Created by Mihail on 22.05.2016.
 */
public class Student {
    String name;
    int age;
    String univer;
    int kurs;

    public void parametr(String name, int age, String univer, int kurs) {
        this.name = name;
        this.age = age;
        this.univer = univer;
        this.kurs = kurs;
    }

    public String inLine() {
        return String.format("Name - %s, age - %d,univer - %s,kurs - %s", name, age, univer, kurs);

    }

}
