package scr.kurs2.week1.day2;


import java.util.Arrays;

/**
 * Created by Mihail on 22.05.2016.
 */
public class Group {
    private static final int GROUP_SIZE = 20;
    private int counter;
    private String name;
    private Student[] students;

    public Group(String name) {
        this.name = name;
        this.students = new Student[GROUP_SIZE];
    }

    public Group(String name, int groupSize) {
        this.name = name;
        this.students = new Student[groupSize];
    }

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if (student == null) return false;
        if (counter >= students.length) return false;

//               todo check if already present in group

        students[counter] = student;
        counter++;
        return true;
    }

    public void showGroup() {
        for (int i = 0; i < counter; i++) {
            System.out.println(students[i].asString());
        }
    }

    public Student search(String name) {
        return null;
    }

    public boolean delStudent(Student student) {
        return true;
    }

    public void sortName() {
        for (int i = students.length - 1; i > 0; i--) {
            System.out.println(students[i]);
        }

    }


}
