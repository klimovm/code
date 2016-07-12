package kurs2.week2.day2HomeWork.studArrayList;

import kurs2.utils.MyDate;

/**
 * Created by miha on 02.06.2016.
 */
public class Student implements Comparable {

    private String name;
    private MyDate bd;
    private double middleMark;
    private int heidht;

    /********************************Конструктор класса*************************************/
    public Student(String name, MyDate bd, double middleMark, int heidht) {
        this.name = name;
        this.bd = bd;
        this.middleMark = middleMark;
        this.heidht = heidht;
    }

    /********************************Гетеры и Сетеры*************************************/
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public MyDate getBd() {return bd;}

    public void setBd(MyDate bd) {this.bd = bd;}

    public double getMiddleMark() {return middleMark;}

    public void setMiddleMark(double middleMark) {this.middleMark = middleMark;}

    public int getHeidht() {return heidht;}

    public void setHeidht(int heidht) {this.heidht = heidht;}


    /*****************************Метод возвращает строку**********************************/

    public String toString() {
        return String.format("%2$s, BD - %1$s, average mark - %3$.1f, height - %4$d",
                bd.asString(), name, middleMark, heidht);
    }



    /******************************Метод сравнения********************************************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;

        if(!(o instanceof Student)) return false;

        Student tmp = (Student) o;

        return this.name.equals(tmp.name)&& this.bd.equals(tmp.bd);

    }
    /******************************Сортировка********************************************/

    public int compareTo(Object o) {
        if (this == o) return 0;
        if(o != null && o instanceof Student) {
            Student tmp = (Student)o;

            return this.name.compareTo(tmp.name);
        }
        return -1;
    }


}
