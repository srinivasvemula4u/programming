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
public class Permutations {

    public static void permutationInOrder(String str) {
        permutationInOrder("", str);
    }

    private static void permutationInOrder(String prefix, String str) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int len = str.length();
        if (len == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < len; i++) {
            permutationInOrder(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, len));
        }
    }

    public static void permutationsInNotOrder(String str) {
        int len = str.length();
        char[] charArray = new char[len];
        for (int i = 0; i < len; i++) {
            charArray[i] = str.charAt(i);
        }
        permutationNotInOrder(charArray, len);
    }

    private static void permutationNotInOrder(char[] charArray, int len) {
        if(len == 1) {
            for(char c: charArray)
                System.out.print(c);
            System.out.println();
            return;
        }
        for(int i=0; i < len; i++) {
           swap(charArray,i,len-1);
            permutationNotInOrder(charArray, len-1);
           swap(charArray,i,len-1);
        }
    }
   private static void swap(char[] charArray, int i, int j) {
      char c = charArray[i];
      charArray[i] = charArray[j];
      charArray[j] = c;
    }
    public static void main(String args[]) {
        String str = "abc";
        permutationsInNotOrder(str);
    }

    
}
