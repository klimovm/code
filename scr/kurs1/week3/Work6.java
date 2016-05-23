package scr.kurs1.week3;

import scr.kurs1.week2.ArrayUtils;

import java.util.Arrays;
import java.util.zip.Inflater;

/**
 * Created by miha on 16.05.2016.
 */
/* Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
        Вход:
		10001101001
		Выход:
    	(2,4) - цепочка нулей
		(5,6) - цепочка единиц
*/
public class Work6 {
    public static void main(String[] args) {
        //012345678
        System.out.println("0 1 2 3 4 5 6 7");
        String num = "10010001";
        char[] mas = num.toCharArray();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int zeroCount = countZeroSeq(mas, 7);
        System.out.println(zeroCount);

        // Поиск максимальной последовательности нулей
        int maxZeroLink = 0;
        // Поиск максимальной последовательности единиц
        int maxOneLink = 0;
        // Поиск начального индекса с максимальной последовательности нулей
        int indexStartZero = 0;
        // Поиск начального индекса с максимальной последовательности единиц
        int indexStartOne = 0;
        //  System.out.println(indexStartZero +","+(indexStartZero + maxZeroLink) + " - цепочка нулей" );
        //   System.out.println(indexStartOne+","+ (indexStartOne+maxOneLink) + " - цепочка единиц" );


    }

    public static int countZeroSeq(char[] mas, int startPos) {
        int count = 0;

        if (mas[startPos] == '0') {
            int count0 = countSeqR(mas, startPos, '0');
            count = count0;
        } else if (mas[startPos] == '1') {
            int count1 = countSeqR(mas, startPos, '1');
            count = count1;
        }
        return count;
    }

    public static int countSeqR(char[] mas, int startPos, char sym) {
        int count = 0;

        for (int i = startPos; i < mas.length; i++) {
            if (mas[startPos] == sym && mas[startPos++] == sym)
                count++;
        }
        return count;
    }


}