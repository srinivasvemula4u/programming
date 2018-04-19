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
// Java program to illustrate Declaration of 
// local inner classes inside an if statement
public class InnerClassInsideIfBlock
{
    public int data = 10;
    public int getData()
    {
        return data;
    }
    public static void main(String[] args)
    {
        InnerClassInsideIfBlock outer = new InnerClassInsideIfBlock();
         
        if(outer.getData() < 20)
        {
            // Local inner class inside if clause
            class Inner
            {
                public int getValue()
                {
                    System.out.println("Inside Inner class");
                    return outer.data;
                }
            }
  
            Inner inner = new Inner();
            System.out.println(inner.getValue());
        }
        else
        {
            System.out.println("Inside Outer class");
        }
    }
}

