/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer a = null;
        //int b = a;
        //System.out.println(b);
        String o1 = new String("hello");
        String o2 = new String("hello");
        String s1 = o1 == o2 ? "T" : "F";
        String s2 = o1.equals(o2) ? "T" : "F";
        String s3 = o1.hashCode() == o2.hashCode() ? "T" : "F";
        System.out.println(s1 + s2 + s3);
        try {
            int c = 1 / 0;
        } catch (Exception e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
    }
}
