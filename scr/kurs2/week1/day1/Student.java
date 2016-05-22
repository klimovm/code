package scr.kurs2.week1.day1;

import scr.utils.Mydate;

/**
 * Created by Mihail on 22.05.2016.
 */
public class Student {
    private String name;
    private Mydate birthday;
    private double avareMark;
    private char gender;


    public Student(String name, Mydate birthday, char gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public double getAvareMark() {
        return avareMark;
    }

    public char getGender() {
        return gender;
    }

    public void setAvareMark(double avareMark) {
        this.avareMark = avareMark;
    }
    // // TODO: добавить
    public  String asString(){
    return  String.format("%2$s,BD = %1$s,average mark - %3$.1f",birthday,avareMark);
    }


}
