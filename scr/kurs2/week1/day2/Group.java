package scr.kurs2.week1.day2;


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
//               todo make resizeable(сделать изменения размера)
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

    public boolean delStudent(String name) {
        if (name == null || name.isEmpty()) return false;

        for (int i = 0; i < counter; i++) {
            if (name.equals(students[i].getName())) {
                students[i] = null;

                for (int j = i; j < counter; j++) {
                    students[j] = students[j + 1];
                }

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


}
