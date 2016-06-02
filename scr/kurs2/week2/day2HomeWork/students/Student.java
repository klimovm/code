package scr.kurs2.week2.day2HomeWork.students;

import scr.utils.Mydate;

/**
 * Created by Mihail on 22.05.2016.
 */
public class Student implements Comparable  {

    private String name;
    private Mydate birthDay;
    private double averageMark;
    private char gender;

    public Student(String name, Mydate birthDay, char gender, double averageMark) {
        this.birthDay = birthDay;
        this.name = name;
        this.gender = gender;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public Mydate getBirthDay() {
        return birthDay;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public char getGender() {
        return gender;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void setBirthDay(Mydate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;

        if(!(o instanceof Student)) return false;

        Student tmp = (Student) o;

        return this.name.equals(tmp.name)&& this.birthDay.equals(tmp.birthDay);

    }

    public String toString(){
        return String.format("%2$s, BD - %1$s, average mark - %3$.1f",  birthDay.asString(), name, averageMark);
    }


    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if(o != null && o instanceof Student) {
            Student tmp = (Student)o;

            return this.name.compareTo(tmp.name);
        }

        return -1;
    }

    /******************************************************************************************************************/



}
