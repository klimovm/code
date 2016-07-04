package kurs2.week5.time_counter;

import java.io.IOException;

/**
 * Created by miha on 29.06.2016.
 */
public class TimeCounter {
    public long count(Action action) throws IOException {
        long start = System.currentTimeMillis();
        action.run();
        long finish = System.currentTimeMillis();

        return finish - start;
    }
}
