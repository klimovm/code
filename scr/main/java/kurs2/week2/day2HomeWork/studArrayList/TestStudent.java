package kurs2.week2.day2HomeWork.studArrayList;


import kurs2.utils.Mydate;

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
        Group aco13 = new Group("ACO13");
        /*************************добавляем студента  группу**************************/
        aco13.addStudent(student1);
        aco13.addStudent(student2);
        aco13.addStudent(student3);
        aco13.addStudent(student4);
        aco13.addStudent(student5);

        System.out.println("================Показать нашу группу===================");
        aco13.showGroup();

        System.out.println("===============Сортировка по имени=====================");
        aco13.sortName();
        aco13.showGroup();


        System.out.println("===============Сортировка по дате======================");
        aco13.sortBD();
        aco13.showGroup();

        System.out.println("===============Сортировка по среднему балу=============");
        aco13.sortMark();
        aco13.showGroup();

        System.out.println("===============Удаление студента=======================");
        aco13.delStudentObject(student3);
        aco13.showGroup();

        System.out.println("===============Сравнение студента=======================");
        System.out.println(student1.equals(student4));





    }
}
