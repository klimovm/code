package kurs2.utils;

import java.io.Serializable;

/**
 * Created by Mihail on 22.05.2016.
 */
public class MyDate implements Comparable<MyDate>, Serializable{
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;

    public MyDate(int yearBirth, int monthBirth, int dayBirth) {
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDate myDate = (MyDate) o;

        if (yearBirth != myDate.yearBirth) return false;
        if (monthBirth != myDate.monthBirth) return false;
        return dayBirth == myDate.dayBirth;

    }

    @Override
    public int hashCode(){
        int result = 17;

        result = 31 * result + yearBirth;
        result = 31 * result + monthBirth;
        result = 31 * result + dayBirth;

        return result;
    }


    public String asString(){
        return String.format("%d.%d.%d", dayBirth, monthBirth, yearBirth);
    }

    @Override
    public int compareTo(MyDate o) {
        return this.yearBirth - o.yearBirth;
    }
}
