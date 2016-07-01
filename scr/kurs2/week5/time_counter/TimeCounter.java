package scr.kurs2.week5.time_counter;

/**
 * Created by miha on 29.06.2016.
 */
public class TimeCounter {
    public long count(Action action){
        long start = System.currentTimeMillis();
        action.run();
        long finish = System.currentTimeMillis();

        return finish - start;
    }
}
