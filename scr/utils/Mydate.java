package scr.utils;

import java.util.Objects;

/**
 * Created by Mihail on 22.05.2016.
 */
public class Mydate implements Comparable {

    private int yearBirth;
    private int monthBirth;
    private int dayBirth;

    public Mydate(int yearBirth, int monthBirth, int dayBirth) {
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
    }

    public String asString() {
        return String.format("%d.%d.%d", dayBirth, monthBirth, yearBirth);
    }


    @Override
    public int compareTo(Object o) {
        if (this.yearBirth != yearBirth) {
            return this.yearBirth - yearBirth;
        }
        if (this.monthBirth != monthBirth) {
            return this.monthBirth - monthBirth;
        }
        if (this.dayBirth != dayBirth) {
            return this.dayBirth - dayBirth;
        }
        return 0;
    }


    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(int dayBirth) {
        this.dayBirth = dayBirth;
    }


}
