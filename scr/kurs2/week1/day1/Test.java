package scr.kurs2.week1.day1;

/**
 * Created by Mihail on 21.05.2016.
 */
public class Test {
    public static void main(String[] args) {
        Human person = new Human();
        person.init("Vasia", 12, "M", 100, 180);

        System.out.println(person.getName());

        person.init("Kolia", 12, "M", 100, 180);
        person.setName("Vasia");


        System.out.println(person.asString());
    }

}
