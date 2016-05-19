package scr.kurs1.week3;

import java.util.Scanner;

/**
 * Created by miha on 19.05.2016.
 */
public class wwww {
    public static void main(String[] args) {
        int a[] = {2, 2, 0, 0, 0, 0, 1, 1, 3, 0, 0} ;
        int b[] = new int[a.length];
        int c[] = new int[a.length];
        int ind = -1;
        int ans = 0;
        int sss = -1;
        int eee = 0;
        if(a[0] == 0) {
            b[0] = 1;
            ind = 0;
            sss = 0;
            ans = 1;
            eee = 0;
        }
        for(int i = 1; i < a.length; i++){
            if(a[i] == 0) {
                b[i] = b[i - 1] + 1;
                if(b[i] > ans){
                    ans = b[i];
                    ind = i - b[i] + 1;
                }
            }
        }
        System.out.println(ind);

        for(int i = 1; i < a.length; i++){
            if(a[i] == 1) {
                c[i] = c[i - 1] + 1;
                if(c[i] > eee){
                    eee = c[i];
                    sss = i - c[i] + 1;
                }
            }
        }
        System.out.println(sss);
        System.out.println(ans);
        System.out.println(eee);
    }
}

