package scr.kurs2.week2.day2HomeWork.students;

import scr.utils.Mydate;

import java.util.Arrays;

/**
 * Created by Mihail on 22.05.2016.
 */
public class TestStudent {
    public static void main(String[] args) {

        Student st1 = new Student("Alex",
                new Mydate(1986, 1, 3),
                'M',140);
        Student st2 = new Student("Jack",
                new Mydate(1986, 1, 1),
                'M',1.3);
        Student st3 = new Student("Anna",
                new Mydate(1986, 1, 3),
                'W',140);

        Student st4 = new Student("Jeniya",
                new Mydate(1986, 1, 2),
                'W',100);
        Student st5 = new Student("Alex",
                new Mydate(1986, 1, 3),
                'M',140);



        Group aco13 = new Group("ACO13");

        aco13.addStudent(st1);
        aco13.addStudent(st2);
        aco13.addStudent(st3);
        aco13.addStudent(st4);
        aco13.addStudent(st5);

        aco13.showGroup();
        System.out.println();
//        aco13.delStudent("Jack");
        Student[] expAfterDel = new Student[aco13.getStudents().length];
        expAfterDel[0] = st1;
        expAfterDel[1] = st3;
        expAfterDel[2] = st4;

        aco13.delStudentObject(st2);

        Boolean resultTest = true;
/*        for (int i = 0; i < aco13.getStudents().length; i++) {
            if (!(aco13.getStudents()[i].equals(expAfterDel[i]))){
                resultTest = false;
                break;}
        }*/
        resultTest = Arrays.equals(aco13.getStudents(),expAfterDel);
        System.out.println("результат проверки на удаление " + resultTest);
        //aco13.showGroup();

        System.out.println("Ожидался масив студентов");

        for (int i = 0; i < expAfterDel.length; i++) {
            if (expAfterDel[i] == null) {System.out.println("null");} else
            System.out.println(expAfterDel[i].toString());
        }

        System.out.println("получили масив студентов");

        for (int i = 0; i < aco13.getStudents().length; i++) {
            if (aco13.getStudents()[i] == null) {System.out.println("null");} else
                System.out.println(aco13.getStudents()[i].toString());
        }

        System.out.println("======================Сортирока по имени===============================");
        aco13.sortName();
        System.out.println("======================Сортирока по оценкам=============================");
        aco13.sortByMark();
        aco13.showGroup();
        System.out.println("======================Сортирока по дате рождения=======================");
        aco13.sortByBD();
        aco13.showGroup();
        System.out.println("======================Сравнение======================");
        System.out.println(st1.equals(st5));
    }
}
