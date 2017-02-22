/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.StringMatchingAlgorithms;

/**
 *
 * @author srivemul
 */
public class TSTClass {

    private static TSTNode Mainroot;

    public static TSTNode getMainRoot() {
        return Mainroot;
    }

    public static TSTNode insertInTST(TSTNode root, String word, int position) {
        if (root == null) {
            if (word.length() <= position) {
                return root;
            }
            root = new TSTNode();
            System.out.println(word.charAt(position));
            root.setData(word.charAt(position));
            root.setLeft(null);
            root.setRight(null);
            root.setEq(null);
            if (word.length() - 1 == position) {
                root.setMarker(true);
            } else {
                insertInTST(root, word, position + 1);
            }
        } else if (root.getData() < word.charAt(position)) {
            insertInTST(root.getLeft(), word, position);
        } else if (root.getData() == word.charAt(position)) {
            if (word.length() - 1 > position) {
                insertInTST(root.getEq(), word, position);
            } else {
                root.setMarker(true);
            }
        } else {
            insertInTST(root.getRight(), word, position);
        }
        return root;
    }

    public static boolean SearchInTSTRecursive(TSTNode root, String word, int position) {
        if (root == null) {
            return false;
        }
        if (root.getData() < word.charAt(position)) {
            return SearchInTSTRecursive(root.getLeft(), word, position);
        } else if (root.getData() > word.charAt(position)) {
            return SearchInTSTRecursive(root.getRight(), word, position);
        } else {
            if (root.isMarker() && word.length() == position) {
                return true;
            }
            return SearchInTSTRecursive(root.getEq(), word, position + 1);
        }

    }

    public static boolean SearchInTSTIterative(TSTNode root, String word, int position) {
        while (root != null) {
            if (root.getData() < word.charAt(position)) {
                root = root.getLeft();
            } else if (root.getData() == word.charAt(position)) {
                if (root.isMarker() && word.length() - 1 == position) {
                    return true;
                }
                position++;
                root = root.getEq();
            } else {
                root = root.getRight();
            }
        }
        return false;
    }
    private static StringBuilder word = new StringBuilder();
    private static int i = 0;

    public static void displayAllWords(TSTNode root) {
        if (root == null) {
            return;
        }
        displayAllWords(root.getLeft());
        word.charAt(root.getData());
        if (root.isMarker()) {
            System.out.println(word.toString());
        }
        i++;
        displayAllWords(root.getEq());
        i--;
        displayAllWords(root.getRight());
    }

    public static void main(String args[]) {
          TSTNode node = insertInTST(null,"How",0);
         // insertInTST(node,"HowAreYou",0);
          System.out.println(SearchInTSTRecursive(node, "How", 0));
    }
}
