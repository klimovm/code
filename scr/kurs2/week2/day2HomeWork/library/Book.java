package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Book extends Prints {

    private String nameAuthor;
    private String surnameAuthor;

    /**Конструктор класса**/
    public Book(String name, int yearPrint, int counterPrint, String nameAuthor, String surnameAuthor) {
        super(name, yearPrint, counterPrint);
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s",super.toString(),nameAuthor,surnameAuthor);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(getClass() == obj.getClass())) return false;
        if (!super.equals(obj)) return false;
        else {
            Book tmp = (Book) obj;
            if ((tmp.nameAuthor == this.nameAuthor) && (tmp.surnameAuthor == this.surnameAuthor)) return true;
            else return false;
        }
    }
}
