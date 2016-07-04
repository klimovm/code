package kurs2.utils;

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


    /******************************************************************************************************************/
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Mydate)) {
            return false;
        }
        Mydate obj1 = (Mydate) obj;
        // TODO: изучить и проработать этот метод.Сравнить поля екземпляра класса
        return yearBirth ==(obj1.getYearBirth())
                && monthBirth == (obj1.getMonthBirth())
                && dayBirth == (obj1.getDayBirth());
    }

    /******************************************************************************************************************/
    @Override
    public int compareTo(Object o) {

        Mydate date = (Mydate) o;

        if (this.yearBirth != date.getYearBirth()) {
            return this.yearBirth - date.getYearBirth();
        }
        if (this.monthBirth != date.getMonthBirth()) {
            return this.monthBirth - date.getMonthBirth();
        }
        if (this.dayBirth != date.getDayBirth()) {
            return this.dayBirth - date.dayBirth;
        }
        return 0;
    }

    /******************************************************************************************************************/

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
