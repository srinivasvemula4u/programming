/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Enumerations;

/**
 *
 * @author srivemul
 */
// An enumeration of apple varieties.
enum Apple1 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2 {

    public static void main(String agrs[]) {
        Apple1 ap;
        System.out.println("Here are all Apple constants:");
// use values()
        Apple1 allapples[] = Apple1.values();
        for (Apple1 a : allapples) {
            System.out.println(a);
        }
        System.out.println();
// use valueOf()
        ap = Apple1.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
