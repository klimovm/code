package scr.kurs2.week2.day2HomeWork.studArrayList;

import java.util.ArrayList;


/**
 * Created by miha on 02.06.2016.
 */
public class Group {

    private int counter;
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    /*************************Метод создает новую группу*****************************/
    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }


    /************************Метод добавление студента в группу********************/
    public boolean addStudent(Student student) {
       /* if (student == null) return false;
        for (int i = 0; i <counter ; i++) {
            if (student.equals(students.get(i))) return false;
        }
        students.add(counter,student);
        counter++;
        return true;*/
        //ВТОРОЙ ВАРИАНТ РЕАЛИЗАЦИИ без цикла на проверку есть ли обьект в ArrayList
        if (student == null) return false;
        if (students.contains(student)) return false;
        students.add(counter, student);
        counter++;
        return true;
    }

    /*************************Метод вывода группы на консоль************************/
    public void showGroup() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
        //System.out.println(students.toString());//выводит в одну строчку

    }

    /********************************Сортировка по имени**************************/
    public void sortName() {
        for (int i = 0; i < counter; i++) {
            for (int j = i + 1; j < counter; j++) {
                if (students.get(i).getName().compareTo(students.get(j).getName()) > 0) {
                    Student tmp = students.get(j);
                    students.set(j, students.get(i));
                    students.set(i, tmp);
                }
            }
        }

    }

    /********************************Сортировка по дате**************************/
    public void sortBD() {
        for (int i = 0; i < counter; i++) {
            for (int j = i + 1; j < counter; j++) {
                if (students.get(i).getBd().compareTo(students.get(j).getBd()) > 0) {
                    Student tmp = students.get(j);
                    students.set(j, students.get(i));
                    students.set(i, tmp);
                }
            }
        }
    }

    /********************************* Сортировка по среднему балу**************************/
    public void sortMark() {
        for (int i = 0; i < counter; i++) {
            for (int j = i + 1; j < counter; j++) {
                if (students.get(i).getMiddleMark()>(students.get(j).getMiddleMark()) ) {
                    Student tmp = students.get(j);
                    students.set(j, students.get(i));
                    students.set(i, tmp);
                }
            }
        }
    }
    /********************************* Удаление объекта**************************/
    public boolean delStudentObject( Student student) {
        if (student == null) return false;
        students.remove(student);
        return true;
    }
}
