package kurs2.week5.exceptions;

/**
 * Created by miha on 04.07.2016.
 */
public class MyCheckedException extends Exception{
    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }
}
