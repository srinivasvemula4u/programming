/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.inputoutput;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 *
 * @author srivemul
 */
public class PrinctonInputOutput {

    public static void main(String args[]) {
        String[] arg = {"C:\\Users\\srivemul.ORADEV\\Desktop\\in1.txt", "C:\\Users\\srivemul.ORADEV\\Desktop\\in2.txt", "C:\\Users\\srivemul.ORADEV\\Desktop\\out.txt"};
        Out out = new Out(arg[arg.length - 1]);
        for (int i = 0; i < arg.length - 1; i++) {
            In in = new In(arg[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
