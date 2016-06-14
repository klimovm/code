package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 14.06.2016.
 */
public class Book extends Prints {

    private String nameAuthor;
    private String surnameAuthor;

    public Book(String name, int yearPrint, int counterPrint, String nameAuthor, String surnameAuthor) {
        super(name, yearPrint, counterPrint);
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s",super.toString(),nameAuthor,surnameAuthor);
    }
}
