package kurs2.week6.day1.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by miha on 04.07.2016.
 */
public class FileCreatot {
    public static void main(String[] args) throws IOException {
        /*File file = new File("C:\\JAVA\\code\\home\\test.txt");
        File file1 = new File("C:\\JAVA\\code\\home\\test1.txt");

        System.out.println(file.createNewFile());
        System.out.println(file1.createNewFile());

        System.out.println(file.delete());*/

        //удаление папки
        File dir = new File("C:\\JAVA\\code\\home\\dir1");
        deleteFile(dir.getAbsolutePath());

    }
    private static void deleteFile(String path){
        File file = new File(path);
        if (file.isFile()){
            file.delete();
        } else {
            File [] files =file.listFiles();
            for (File file1 : files) {
                deleteFile(file1.getAbsolutePath());
            }
            file.delete();
        }
    }
}
