package scr.kurs2.week2.day2HomeWork.students;


import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Mihail on 22.05.2016.
 */
public class Group {
    private static final int GROUP_SIZE = 3;
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
//               todo make resizeable(сделать изменения размера)
        if (counter >= students.length) {
            students = Arrays.copyOf(students, counter * 2);
        }

//               todo check if already present in group

        students[counter] = student;
        counter++;
        return true;
    }

    public void showGroup() {
        for (int i = 0; i < counter; i++) {
            System.out.println(students[i].toString());
        }
    }

    public Student search(String name) {
        for (int i = 0; i < counter; i++) {
            if (name.equals(students[i].getName())) {
                return students[i];
            }
        }
        return null;
    }

    public void sortName() {
//        todo ry to not repeat comparing of already sorted Students
        for (int j = 0; j < counter; j++) {
            for (int i = 0; i < counter - 1; i++) {
                int comparation = students[i].getName().compareTo(students[i + 1].getName());
                if (comparation > 0) {
                    Student tmp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = tmp;
                }
            }
        }
        showGroup();
    }

    public void sortByMark() {
        Arrays.sort(getStudents(), new ComparatorSortByMark());
    }

    public void sortByBD() {
        Arrays.sort(getStudents(), new ComparatorSortByBD());
    }

    public static int getGroupSize() {
        return GROUP_SIZE;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public boolean delStudent(String name) {
        if (name == null || name.isEmpty()) return false;

        for (int i = 0; i < counter; i++) {
            if (name.equals(students[i].getName())) {
                //  students[i] = null;

                for (int j = i; j < counter - 1; j++) {
                    students[j] = students[j + 1];
                }


                students[counter - 1] = null;

                counter--;
                return true;
            }
        }
        return false;
    }

    //    public boolean delStudent(String name){
//        if (name == null || name.isEmpty()) return false;
//
//        for (int i = 0; i < counter; i++){
//            if (name.equals(students[i].getName())){
//                System.arraycopy(students, i + 1, students, i, students.length - (i + 1));
//                counter--;
//                return true;
//            }
//        }
//
//        return false;
//    }
    public boolean delStudentObject(Student student) {
        if (student == null) return false;

        for (int i = 0; i < counter; i++) {
            if (student.equals(students[i])) {
                //  students[i] = null;

                for (int j = i; j < counter - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[counter - 1] = null;

                counter--;
                return true;
            }
        }
        return false;
    }


}