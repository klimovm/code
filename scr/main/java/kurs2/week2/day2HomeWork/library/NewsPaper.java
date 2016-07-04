package kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class NewsPaper extends Print {

    private int number;

    /**
     * Конструктор класса
     **/
    public NewsPaper(String name, int yearPrint, int counterPrint, int number) {
        super(name, yearPrint);
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s,номер выпуска: %d", super.toString(), number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        if (!super.equals(obj)) return false;

        NewsPaper tmp = (NewsPaper) obj;
        return (tmp.number == this.number);
    }


}
