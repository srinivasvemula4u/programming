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
enum Apple {
    Jonathan,
    GoldenDel,
    RedDel,
    Winesap,
    Cortland
}

public class EnumerationDemo {

    public static void main(String args[]) {
        Apple ap;
        ap = Apple.RedDel;
// Output an enum value.
        System.out.println("Value of ap: " + ap);
        System.out.println(Apple.GoldenDel.ordinal());
        System.out.println();
        ap = Apple.GoldenDel;
// Compare two enum values.
        if (ap == Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel.\n");
        }
        // Use an enum to control a switch statement.
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }

    }
}
