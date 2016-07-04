package kurs1.week2.CodingBat;

/**
 * Created by miha on 06.05.2016.
 */
public class String2 {
    /*****************************************************************************************************************/

    public String doubleChar(String str) {
        /*Given a string, return a string where for every char in the original, there are two chars.
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
        */
        String s = "";
        for (int i=0; i<str.length(); i++) {
            s =s + str.substring(i, i+1) + str.substring(i, i+1);
        }
        return s;
    }
    /*****************************************************************************************************************/

}
