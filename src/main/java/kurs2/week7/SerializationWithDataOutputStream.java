package kurs2.week7;

import kurs2.utils.MyDate;
import kurs2.week1.day2.Gender;
import kurs2.week1.day2.Student;

import java.io.*;

/**
 * Created by miha on 12.07.2016.
 */
public class SerializationWithDataOutputStream {
    public static void main(String[] args) throws IOException {
        Student st1 = new Student("Alex",
                new MyDate(1977, 12, 12),
                Gender.MALE);


        ObjectOutputStream dos = new ObjectOutputStream(
                new FileOutputStream(
                        "/home/gorobec/Java/development/Teaching/ArtCode/ACO13/src/resources/Student.txt"));

        dos.writeObject(st1);
        dos.flush();
        dos.close();
    }
}
