/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeFight;

/**
 *
 * @author sv186040
 */
class Super
    { 
        public int i = 0; 

        public Super(String text) /* Line 4 */
        {
            i = 1; 
        } 
    } 
    class PassS 
    {
        

        void start() 
        {
            String s1 = "sleep";
            String s2 = fix(s1);
            System.out.println(s1 + " " + s2);
        }

        String fix(String s1) 
        {
            s1 = s1 + "stream";
            System.out.print(s1 + " ");
            return "steem";
        }
    }
    class Sub extends Super
    {
        public Sub(String text)
        { super(text);
            i = 2; 
        } 

        
    }
class Base
    {
        static int x = 10;
    }
    class Derived extends Base
    {
        public static void fun()
        {
            //System.out.println(super.x);
        }
    }

public class Test {
   public Test() {
     int x = 5;
     //return x;
   }
  public static void main(String [] args) 
        {
            PassS p = new PassS();
            p.start();
        }
   
   
}
