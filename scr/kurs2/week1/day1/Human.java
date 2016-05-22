package scr.kurs2.week1.day1;

/**
 * Created by Mihail on 21.05.2016.
 */
public class Human {
    //fields
    String name;
    int age;
    String sex;
    int height;
    int weight;

    public void init(String name, int age, String sex, int weight, int height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }


    public String asString() {
        return String.format("Name - %s, age - %d, height - %d,sex - %s,", name, age, height, sex);

    }
}
