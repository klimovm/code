package scr.kurs2.week2.day1ClassWork.inheritence;

/**
 * Created by Mihail on 28.05.2016.
 */
public class Middle extends Coder {

    /**Конструктор класса**/
    public Middle(int age, String name, String surname, String programmingLanguage) {
        super(age, name, surname, programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I can make art better than junior");
    }
}
