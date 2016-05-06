package scr.kurs1.week2.CodingBat;

/**
 * Created by miha on 06.05.2016.
 */
public class String1 {
    /*****************************************************************************************************************/
    public String helloName(String name) {
        /*
        Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        helloName("Bob") → "Hello Bob!"
        helloName("Alice") → "Hello Alice!"
        helloName("X") → "Hello X!"
        */
        String q = "Hello ";
        String w = "!";
        return (q + name + w);
    }

    /*****************************************************************************************************************/
    public String makeAbba(String a, String b) {
        /*
        Given two strings, a and b, return the result of putting them together in the order abba, e.g.
        "Hi" and "Bye" returns "HiByeByeHi".
        makeAbba("Hi", "Bye") → "HiByeByeHi"
        makeAbba("Yo", "Alice") → "YoAliceAliceYo"
        makeAbba("What", "Up") → "WhatUpUpWhat"
        */
        return a + b + b + a;
    }

    /*****************************************************************************************************************/
    public String makeTags(String tag, String word) {
        /*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i"
        tag makes <i> and </i> which surround the word "Yay". Given tag and word strings,
        create the HTML string with tags around the word, e.g. "<i>Yay</i>".
        makeTags("i", "Yay") → "<i>Yay</i>"
        makeTags("i", "Hello") → "<i>Hello</i>"
        makeTags("cite", "Yay") → "<cite>Yay</cite>"
        */
        String slovo = "<" + tag + ">" + word + "</" + tag + ">";
        return slovo;
    }

    /*****************************************************************************************************************/
    public String makeOutWord(String out, String word) {
        /*Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in
        the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting
        at index i and going up to but not including index j.
        makeOutWord("<<>>", "Yay") → "<<Yay>>"
        makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
        makeOutWord("[[]]", "word") → "[[word]]"
        */
        String s = out.substring(0, 2);
        String d = out.substring(2, 4);
        String slovo = s + word + d;
        return slovo;
    }

    /*****************************************************************************************************************/
    public String extraEnd(String str) {

        /*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
        extraEnd("Hello") → "lololo"
        extraEnd("ab") → "ababab"
        extraEnd("Hi") → "HiHiHi"*/
        String a = str.substring(str.length() - 2, str.length());
        return a + a + a;
    }

    /*****************************************************************************************************************/
    public String firstTwo(String str) {
        /*Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
        If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty
        string "" yields the empty string "". Note that str.length() returns the length of a string.
        firstTwo("Hello") → "He"
        firstTwo("abcdefg") → "ab"
        firstTwo("ab") → "ab"
        */
        if (str.length() > 2) {
            String a = str.substring(0, 2);
            return a;
        }
        return str;
    }

    /*****************************************************************************************************************/
    public String firstHalf(String str) {
        /*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        firstHalf("WooHoo") → "Woo"
        firstHalf("HelloThere") → "Hello"
        firstHalf("abcdef") → "abc"
        */
        String a = str.substring(0, (str.length() / 2));
        return a;
    }

    /*****************************************************************************************************************/
    public String withoutEnd(String str) {
        /*Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
        withoutEnd("Hello") → "ell"
        withoutEnd("java") → "av"
        withoutEnd("coding") → "odin"
        */
        String a = str.substring(1, str.length() - 1);
        return a;
    }

    /*****************************************************************************************************************/

    public String comboString(String a, String b) {
        /*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside
        and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
        comboString("Hello", "hi") → "hiHellohi"
        comboString("hi", "Hello") → "hiHellohi"
        comboString("aaa", "b") → "baaab"
        */
        String c = null;
        if (a.length() >= b.length())
            c = b + a + b;
        if (a.length() < b.length())
            c = a + b + a;
        return c;

    }
    /*****************************************************************************************************************/

}
