package scr.kurs2.week2.day2HomeWork.myArrayList;

/**
 * Created by miha on 06.06.2016.
 */
public class Worker {
    private String name;
    private String surname;
    private int year;
    private  int experience;

    public Worker(String name, String surname, int year, int experience) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.experience = experience;
    }

    public String toString() {
        return String.format("имя - %s, фамилия - %s, год рождения - %d, стаж - %d",name,surname,year,experience);
    }
}
