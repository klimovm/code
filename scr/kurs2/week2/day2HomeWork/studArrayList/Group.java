package scr.kurs2.week2.day2HomeWork.studArrayList;

import java.util.ArrayList;


/**
 * Created by miha on 02.06.2016.
 */
public class Group {

    private int counter;
    private String name;
    private ArrayList <Student> students = new ArrayList<>();

    /***********************Метод создает новую группу*****************************/
    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }


    /***********************Метод добавление студента в группу********************/
    public boolean addStudent(Student student) {

        if (student == null) return false;
        counter++;
        return true;
    }

    /***********************Метод вывода группы на консоль************************/
    public void showGroup() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }

    }


}
