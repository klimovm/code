package scr.kurs2.week2.day2HomeWork.myArrayList;


import scr.kurs2.week2.day2HomeWork.studArrayList.Student;
import scr.utils.Mydate;

/**
 * Created by miha on 02.06.2016.
 */
public class TestStudent {
    public static void main(String[] args) {

        /************************создаем студентов**********************************/
        Student student1 = new Student("Саша", new Mydate(1989, 04, 20), 15.2, 180);
        Student student2 = new Student("Коля", new Mydate(1988, 04, 21), 11.2, 181);
        Student student3 = new Student("Олег", new Mydate(1988, 04, 22), 13.2, 182);
        Student student4 = new Student("Ваня", new Mydate(1988, 04, 23), 13.0, 182);
        Student student5 = new Student("Толя", new Mydate(1989, 04, 20), 10.2, 180);

        /************************создаем группу*************************************/
        Group aco13 = new Group("aco13");
        /************************добавляем студента  группу*************************/
        aco13.addStudent(student1);
        aco13.addStudent(student2);
        aco13.addStudent(student3);
        aco13.addStudent(student4);
        aco13.addStudent(student5);
        /************************добавляем студента  по индексу*************************/
       /* aco13.add(5,"Валентина");// ндексу у прупет метода добавления по ин
        aco13.add(5,"Ирина");
        aco13.add(5,"Катерина");*/
        /************************Смотрим что вышло*************************/
        aco13.showGroup();
        System.out.println();
        /************************Удаляем студента  по объекту*************************/
        aco13.delStudentObject(student1);
        /************************Удаляем студента  по индексу*************************/
        //aco13.remove(6); нет метода у групе удаления по индексу
        /************************Смотрим что вышло*************************/
        aco13.showGroup();
        System.out.println();
        /************ получения объекта по индексу*****************/
       /// System.out.println(aco13.(1)); либо пишем гетеры и сметеры либо public
        System.out.println();
        /********Заменяем объект новым объектом в позиции******/
        /*aco13.set(0,"Барак Обама");
        aco13.show();
        System.out.println();
        *//********Показываем сколько непустых елементов******//*
        System.out.println(aco13.size());
        System.out.println();
        *//********Проверяет есть ли объект в листе******//*
        System.out.println(aco13.contains("Слава"));
        System.out.println();
        *//********Очищаем массив(заполняем null******//*
        aco13.clear();
        aco13.show();*/


    }
}
