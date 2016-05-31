package scr.kurs2.week2.day2HomeWork.students;

import scr.utils.MyDate;

import java.util.Arrays;

/**
 * Created by Mihail on 22.05.2016.
 */
public class TestStudent {
    public static void main(String[] args) {

        Student st1 = new Student("Alex",
                new MyDate(1989, 12, 12),
                'M',200);
        Student st2 = new Student("Jack",
                new MyDate(1989, 3, 13),
                'M',1.3);
        Student st3 = new Student("Anna",
                new MyDate(1988, 1, 3),
                'W',1.4);

        Student st4 = new Student("Jeniya",
                new MyDate(1988, 1, 3),
                'W',100);

        Group aco13 = new Group("ACO13");

        aco13.addStudent(st1);
        aco13.addStudent(st2);
        aco13.addStudent(st3);
        aco13.addStudent(st4);

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

        System.out.println("======================Сортирока по имени==============================");
        aco13.sortName();
        System.out.println("======================Сортирока по оценкам==============================");
        Arrays.sort(aco13.getStudents(),new SortByMark());
        aco13.showGroup();



    }
}
