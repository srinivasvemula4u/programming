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
*/
public class LocalInnerClass {
    
}
