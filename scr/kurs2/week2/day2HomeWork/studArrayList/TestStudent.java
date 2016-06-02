package scr.kurs2.week2.day2HomeWork.studArrayList;


import scr.utils.Mydate;

/**
 * Created by miha on 02.06.2016.
 */
public class TestStudent {
    public static void main(String[] args) {
        /*************************создаем студентов***********************************/
        Student student1 = new Student("Саша", new Mydate(23, 04, 1988), 10.2, 180);
        Student student2 = new Student("Коля", new Mydate(24, 04, 1988), 11.2, 181);
        Student student3 = new Student("Олег", new Mydate(25, 04, 1988), 13.2, 182);
        Student student4 = new Student("Ваня", new Mydate(25, 04, 1988), 13.2, 182);
        Student student5 = new Student("Ваня", new Mydate(25, 04, 1988), 13.2, 182);

        /*************************создаем группу**************************************/
        Group aco13 = new Group("ACO13");
        /*************************добавляем студента  группу**************************/
        aco13.addStudent(student1);
        aco13.addStudent(student2);
        aco13.addStudent(student3);
        aco13.addStudent(student4);

        /*************************Показать группу*************************************/
        aco13.showGroup();



    }
}
