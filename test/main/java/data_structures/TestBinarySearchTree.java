package data_structures;


import kurs2.data_structures.binary_search_tree.BinarySearchTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Set;

/**
 * Created by miha on 04.07.2016.
 */
public class TestBinarySearchTree {
    private Set<String> set = new BinarySearchTree<>();
    @Before
    public void setUp(){
        this.set = new BinarySearchTree<>();
        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println("Before");
    }

    @After
    public void clean(){
        System.out.println("After");
        set.clear();
        set = null;
    }


    @Ignore

    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    } @Test
    public void test3(){
        System.out.println("test3");
    } @Test
    public void test4(){
        System.out.println("test4");
    } @Test
    public void test5(){
        System.out.println("test5");
    }

}
