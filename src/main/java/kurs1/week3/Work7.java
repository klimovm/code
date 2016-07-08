package kurs1.week3;

import java.util.Scanner;

/**
 * Created by miha on 13.05.2016.
 */
//Найти самое длинное слово в строке(разделенное одним пробелом)
public class Work7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Input stream");
        String line = in.nextLine();

        int indexProbel = line.indexOf(" ");

        String beforeProbel=line.substring(0,indexProbel);

        String afterProbel =line.substring(indexProbel+1,line.length());

        if (beforeProbel.length() > afterProbel.length()){
            System.out.println(beforeProbel);
        }
        if (beforeProbel.length() <afterProbel.length()){
            System.out.println(afterProbel);
        }
        else if (beforeProbel.length() == afterProbel.length()){
            System.out.println("слова равны");
        }


    }
}

