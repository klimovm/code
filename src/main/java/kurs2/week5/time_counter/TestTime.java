package kurs2.week5.time_counter;

import kurs2.utils.ArrayUtils;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by miha on 29.06.2016.
 */
public class TestTime {
    public static void main(String[] args) throws IOException {


        TimeCounter bubleTime = new TimeCounter();
        final int[] array3 = ArrayUtils.createArray(10000);
        Arrays.copyOf(array3, array3.length);
        long bubleSort = bubleTime.count(new Action() {
            @Override
            public void run() {
                ArrayUtils.bubleSort(Arrays.copyOf(array3, array3.length));
            }
        });
        System.out.println("bubleSort - " + bubleSort);


        TimeCounter insertTime = new TimeCounter();
        long insertSort = insertTime.count(new Action() {
            @Override
            public void run() {
                ArrayUtils.insertSort(Arrays.copyOf(array3, array3.length));
            }
        });
        System.out.println("insertSort - " + insertSort);


        TimeCounter selectTime = new TimeCounter();
        long selectSort = selectTime.count(new Action() {
            @Override
            public void run() {
                ArrayUtils.selectSort(Arrays.copyOf(array3, array3.length));
            }
        });
        System.out.println("selectSort - " + selectSort);
    }
}
