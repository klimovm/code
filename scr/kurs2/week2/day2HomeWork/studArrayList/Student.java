package scr.kurs2.week2.day2HomeWork.studArrayList;

import scr.utils.Mydate;

/**
 * Created by miha on 02.06.2016.
 */
public class Student {

    private String name;
    private Mydate bd;
    private double middleMark;
    private int heidht;

    /********************************Конструктор класса*************************************/
    public Student(String name, Mydate bd, double middleMark, int heidht) {
        this.name = name;
        this.bd = bd;
        this.middleMark = middleMark;
        this.heidht = heidht;
    }

    /********************************Гетеры и Сетеры*************************************/
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Mydate getBd() {return bd;}

    public void setBd(Mydate bd) {this.bd = bd;}

    public double getMiddleMark() {return middleMark;}

    public void setMiddleMark(double middleMark) {this.middleMark = middleMark;}

    public int getHeidht() {return heidht;}

    public void setHeidht(int heidht) {this.heidht = heidht;}


    /*****************************Метод возвращает строку**********************************/

    public String toString() {
        return String.format("%2$s, BD - %1$s, average mark - %3$.1f, height - %4$d",
                bd.asString(), name, middleMark, heidht);
    }
    /************************************************************************************/


}
