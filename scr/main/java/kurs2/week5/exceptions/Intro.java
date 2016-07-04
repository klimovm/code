package kurs2.week5.exceptions;
import java.sql.SQLException;

/**
 * Created by miha on 04.07.2016.
 */
public class Intro {
    public static void main(String[] args) {

        a();
    }

    private static void a() {
        try {
            b();
        } catch (MyCheckedException e){
//           NOP

        }  catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("finish a()");
    }

    private static void b() throws MyCheckedException, SQLException {

        c();
//        throw new SQLException();


    }

    private static void c() throws MyCheckedException {

        throw  new MyCheckedException();
    }
}
