package kurs2.week1.day2;

import kurs2.utils.MyDate;

import java.io.Serializable;

/**
 * Created by Mihail on 22.05.2016.
 */
public class Student implements Comparable, Serializable {

    private final int scolarship;
    private String name;
    private MyDate birthDay;
    private transient double averageMark;
    private Gender gender;

    public Student(String name, MyDate birthDay, Gender gender) {
        this.birthDay = birthDay;
        this.name = name;
        this.gender = gender;
        scolarship = 500;
    }


    public String getName() {
        return name;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Gender getGender() {
        return gender;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (!(o instanceof Student)) return false;

        Student tmp = (Student) o;

        return this.name.equals(tmp.name) && this.birthDay.equals(tmp.birthDay);

    }


    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (birthDay != null ? birthDay.hashCode() : 0);

        return result;
    }

    public String toString() {
        return String.format("%2$s, BD - %1$s, average mark - %3$.1f", birthDay.asString(), name, averageMark);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o != null && o instanceof Student) {
            Student tmp = (Student) o;

            return this.name.compareTo(tmp.name);
        }

        return -1;
    }
}
