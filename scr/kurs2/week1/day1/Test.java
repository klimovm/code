package scr.kurs2.week1.day1;

/**
 * Created by Mihail on 21.05.2016.
 */
public class Test {
    public static void main(String[] args) {
        Human person = new Human();
        Student student = new Student();

        person.init("Vasia", 12, "M", 100, 180);
        student.parametr("Tania", 22,"НТУ",2);

//        String personInfo = person.asString();
//        System.out.println(personInfo);
        System.out.println(person.asString());
        System.out.println(student.inLine());
    }

}
