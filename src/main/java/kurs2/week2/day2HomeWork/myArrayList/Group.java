package kurs2.week2.day2HomeWork.myArrayList;



import kurs2.week2.day2HomeWork.studArrayList.Student;


/**
 * Created by miha on 02.06.2016.
 */
public class Group  {

    private String name;
    private MyArrayList students = new MyArrayList();


    /*************************Метод создает новую группу*****************************/
    public Group(String name) {
        this.name = name;
        this.students = new MyArrayList();
    }

    /***********************Метод добавление студента в группу*******************/
    public boolean addStudent(Student student) {

        if (student == null) return false;
        if (students.contains(student)) return false;
        return students.add(student);
    }

    /************************Метод вывода группы на консоль***********************/
    public void showGroup() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

    /*******************************Сортировка по имени*************************//*
    public void sortName() {
        Collections.sort(students);

    }


   *//*******************************Сортировка по дате*************************//*
    public void sortBD() {
        Collections.sort(students,new ComparatorSortByBD());

    }

    *//******************************** Сортировка по среднему балу*************************//*
    public void sortMark() {
        Collections.sort(students,new ComparatorSortByMark());

    }*/
    /********************************* Удаление объекта**************************/
    public boolean delStudentObject( Student student) {

        return students.remove(student);
    }
}
