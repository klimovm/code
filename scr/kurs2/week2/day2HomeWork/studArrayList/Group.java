package scr.kurs2.week2.day2HomeWork.studArrayList;

import java.util.ArrayList;
import java.util.Arrays;


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
        for (int i = 0; i <counter ; i++) {
            if (student.equals(students.get(i))) return false;
        }
        students.add(counter,student);
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
