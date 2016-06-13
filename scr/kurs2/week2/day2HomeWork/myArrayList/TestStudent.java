package scr.kurs2.week2.day2HomeWork.myArrayList;


import scr.kurs2.week2.day2HomeWork.studArrayList.Student;
import scr.utils.Mydate;

/**
 * Created by miha on 02.06.2016.
 */
public class TestStudent {
    public static void main(String[] args) {
        /*************************создаем студентов***********************************/
        Student student1 = new Student("Саша", new Mydate(1989, 04, 20), 15.2, 180);
        Student student2 = new Student("Коля", new Mydate(1988, 04, 21), 11.2, 181);
        Student student3 = new Student("Олег", new Mydate(1988, 04, 22), 13.2, 182);
        Student student4 = new Student("Ваня", new Mydate(1988, 04, 23), 13.0, 182);
        Student student5 = new Student("Толя", new Mydate(1989, 04, 20), 10.2, 180);

        /*************************создаем группу**************************************/
        MyArrayList aco13 = new MyArrayList();
        /*************************добавляем студента  группу**************************/

        aco13.add(student3);
        aco13.add(student4);
        aco13.add(student5);









    }
}
