package kurs2.data_structures.binary_search_tree;

/**
 * Created by Mihail on 10.07.2016.
 */
public class TreeDeepShow {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.add("S");
        tree.add("M");
        tree.add("G");
        tree.add("W");
        tree.add("K");
        tree.add("I");
        tree.add("P");
        tree.add("A");
        tree.showTree();

    }
}
