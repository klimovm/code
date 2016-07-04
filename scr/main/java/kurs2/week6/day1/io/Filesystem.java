package kurs2.week6.day1.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by miha on 04.07.2016.
 */
public class Filesystem {
    public static void main(String[] args) throws IOException {
        File file = new File("/");

        //System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath() + "$");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String path = bf.readLine();

        File newFile = new File(path);
        System.out.println(newFile.getAbsolutePath() + "$");

        //ls
        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();

            if (file.length() > 0) {
                for (File file1 : files) {
                    if (!file1.isHidden())
                    System.out.printf("%s %d \n",file1.getName(),file1.length(),file1.isHidden());
                }
            }

        }
    }
}
