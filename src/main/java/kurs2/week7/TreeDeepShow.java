package kurs2.week7;

import kurs2.data_structures.binary_search_tree.BinarySearchTree;

/**
 * Created by miha on 12.07.2016.
 */
public class TreeDeepShow {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.add("S");
        tree.add("G");
        tree.add("M");
        tree.add("A");
        tree.add("R");
        tree.add("U");
        tree.add("B");
        tree.add("I");


        tree.showTree();
    }
}
