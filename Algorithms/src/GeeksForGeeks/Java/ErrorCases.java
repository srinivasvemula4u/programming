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
// Java code to demonstrate that inner
// classes cannot be declared as static
/*public class ErrorCases
{
   private int getValue(int data)
    {
        static class Inner
        {
            private int getData()
            {
                System.out.println("Inside inner class");
                if(data < 10)
                {
                    return 5;
                }
                else
                {
                    return 15;
                }
            }
        }
         
        Inner inner = new Inner();
        return inner.getData();
    }
     
    public static void main(String[] args)
    {
        ErrorCases outer = new ErrorCases();
        System.out.println(outer.getValue(10));
    }
}*/

/*
Output:

Compilation error
Explanation: The above program causes compilation error because the inner class cannot be declared
as static. Inner classes are associated with the block they are defined within and not with the external class(Outer in this case).

// Java code to demonstrate
// the scope of inner class
public class Outer
{
    private void myMethod()
    {
        class Inner
        {
            private void innerMethod()
            {
                System.out.println("Inside inner class");
            }
        }
    }
     
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        Inner inner = new Inner();
        System.out.println(inner.innerMethod());
    }
}
Run on IDE
Output:

Compilation error
Explanation: The above program causes compilation error because the scope of inner classes are restricted to the block they are defined in.
*/
    

