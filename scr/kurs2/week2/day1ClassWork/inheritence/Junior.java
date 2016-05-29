package scr.kurs2.week2.day1ClassWork.inheritence;

/**
 * Created by Mihail on 28.05.2016.
 */
public class Junior extends Coder {


    public Junior(int age, String name, String surname, String programmingLanguage) {
        super(age, name, surname, programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I'm only trying to make art");
    }
}
