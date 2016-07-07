package kurs2.week5.time_counter;

import kurs2.utils.ArrayUtils;

import java.io.IOException;

/**
 * Created by miha on 29.06.2016.
 */
public class TestTime {
    public static void main(String[] args) throws IOException {
        TimeCounter bubleTime = new TimeCounter();
        final int[] array3 = ArrayUtils.createArray(10000);

        long bubleSort = bubleTime.count(new Action() {
            @Override
            public void run() {
                ArrayUtils.bubleSort(array3);
            }
        });
        System.out.println("bubleSort - " + bubleSort);



        TimeCounter insertTime = new TimeCounter();
        final int[] array2 = ArrayUtils.createArray(10000);

        long insertSort = insertTime.count(new Action() {
            @Override
            public void run() {
                ArrayUtils.insertSort(array2);
            }
        });
        System.out.println("insertSort - " + insertSort);



        TimeCounter selectTime = new TimeCounter();
        final int[] array1 = ArrayUtils.createArray(10000);

        long selectSort = selectTime.count(new Action() {
            @Override
            public void run() {
                ArrayUtils.selectSort(array1);
            }
        });
        System.out.println("selectSort - " + selectSort);
    }
}
