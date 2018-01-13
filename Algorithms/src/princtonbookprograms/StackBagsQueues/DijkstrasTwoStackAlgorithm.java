/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.StackBagsQueues;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author srivemul
 */
public class DijkstrasTwoStackAlgorithm {
    
    public static void main(String args[])
    {
        Stack<Double> vals = new  Stack<>();
        Stack<String> ops = new  Stack<>();
        while(!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if(s.equals("("));
            else if(s.equals("+")) ops.push(s);
            else if(s.equals("-")) ops.push(s);
            else if(s.equals("*")) ops.push(s);
            else if(s.equals("/")) ops.push(s);
            else if(s.equals("sqrt")) ops.push(s);
            else if(s.equals(")"))
            {
               double v = vals.pop();
               String op = ops.pop();
               if(op.equals("+")) v = vals.pop() + v;
               else if(op.equals("-")) v= vals.pop() - v;
               else if(op.equals("*")) v = vals.pop() * v;
               else if(op.equals("/")) v = vals.pop() / v;
               else if (op.equals("sqrt")) v = Math.sqrt(v);
               vals.push(v);
            }
            else
            {
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
        ABC obj = new ABC();
    }
}

class ABC
{
    public ABC()
    {
        
    }
}
