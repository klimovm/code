package kurs2.week6.day1.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by miha on 04.07.2016.
 */
public class BufRead {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

       // sc.nextInt();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println(s);

    }
}
