/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Practice.Generics;

/**
 *
 * @author srivemul
 */
public class Generics {

    public static <T extends Comparable<T>> T findMax(T a, T b) {
        int result = a.compareTo(b);
        if (result < 0) {
            return b;
        }
        return a;
    }

    public static void main(String args[]) {
       System.out.println(findMax(2, 3));
       
    }
}
