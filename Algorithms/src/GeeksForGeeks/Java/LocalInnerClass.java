/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Java;

/**
 *
 * @author sv186040
 */
/*
Local Inner Classes are the inner classes that are defined inside a block. 
Generally, this block is a method body. Sometimes this block can be a for loop, 
or an if clause.Local Inner classes are not a member of any enclosing classes. 
They belong to the block they are defined within, due of which local inner classes 
cannot have any access modifiers associated with them. However, they can be marked 
as final or abstract. These class have access to the fields of the class enclosing it. 
Local inner class must be instantiated in the block they are defined in.
Rules of Local Inner Class:

The scope of local inner class is restricted to the block they are defined in.
Local inner class cannot be instantiated from outside the block where it is created in.
Till JDK 7,Local inner class can access only final local variable of the enclosing block.
However From JDK 8, it is possible to access the non-final local variable of enclosing block in local inner class.
A local class has access to the members of its enclosing class.
Local inner classes can extend an abstract class or can also implement an interface.
Declaring a Local Inner class: A local inner class can be declared within a block. This block can be either a method body, initialization block, for loop or even an if statement.
Accessing Members: A local inner class has access to fields of the class enclosing it as well as the fields of the block that it is defined within. These classes, however, can access the variables or parameters of the block that encloses it only if they are declared as final or are effectively final. A variable whose value is not changed once initialized is called as effectively final variable. A local inner class defined inside a method body, have access to it’s parameters.

What happens at compile time?

When a program containing a local inner class is compiled, the compiler generate two .
class files, one for the outer class and the other for the inner class that has 
the reference to the outer class. The two files are named by compiler as:



Outer.class
Outer$1Inner.class
 */
class Outer {

    public void getValue() {
        // Note that local variable(sum) must be final till JDK 7 
        // hence this code will work only in JDK 8
        int sum = 20;

        // Local inner Class inside method
        class Inner {

            public int divisor;
            public int remainder;

            public Inner() {
                divisor = 4;
                remainder = sum % divisor;
            }

            private int getDivisor() {
                return divisor;
            }

            private int getRemainder() {
                return sum % divisor;
            }

            private int getQuotient() {
                System.out.println("Inside inner class");
                return sum / divisor;
            }
        }

        Inner inner = new Inner();
        System.out.println("Divisor = " + inner.getDivisor());
        System.out.println("Remainder = " + inner.getRemainder());
        System.out.println("Quotient = " + inner.getQuotient());
    }
}

    public class LocalInnerClass {
       public static void main(String[] args)
    {
        Outer outer = new Outer();
        outer.getValue();
    }
 }
 
