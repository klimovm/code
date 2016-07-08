package kurs2.week6.day1.io;

import java.io.*;

/**
 * Created by miha on 04.07.2016.
 */
public class IOReadWriter {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream("C:\\JAVA\\code\\home\\week1.txt"));


       /* int readByte;
        while ((readByte = is.read())  != -1){
            System.out.print((char)readByte);
        }*/

        Reader reader = new BufferedReader(new FileReader("C:\\JAVA\\code\\home\\week1.txt"));

        int readChar;
        while ((readChar = reader.read()) != -1) {
            System.out.print((char) readChar);
        }


    }
}
