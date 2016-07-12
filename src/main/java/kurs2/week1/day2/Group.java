package kurs2.week1.day2;


import java.util.*;

/**
 * Created by Mihail on 22.05.2016.
 */
public class Group {
    private int counter;
    private String name;
    private List<Student> students;
    private transient Comparator<Student> comparator = new AgeComparator();

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public Group(String name, int groupSize) {
        this.name = name;
        this.students = new ArrayList<>(groupSize);
    }


    public boolean addStudent(Student student){
        if(student == null) return false;
//               todo check if already present in group
        if(!students.contains(student)){
            students.add(student);
            counter++;
            return true;
        }
        return false;

    }

    public void showGroup(){
        for (int i = 0; i < counter; i++) {
            System.out.println(students.get(i));
        }
    }

    public final Student search(final String name){
        return null;
    }

    public boolean delStudent(Student student){
        return false;
    }

    public void sort(){
        Collections.sort(students, comparator);
    }

    public void setComparator(Comparator<Student> comparator) {
        this.comparator = comparator;
    }

}