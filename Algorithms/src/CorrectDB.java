/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 */
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
// Department Interface
interface Department {
    public abstract void  setName(String name);
    public abstract void display();
    
}
// ProblemSetter class
class ProblemSetter implements Department {
    String name;
    public void setName(String name) {
         this.name = name;
    }
    public void display() {
        System.out.println("ProblemSetter");
        System.out.println("Name :"+ this.name);
    }
}
// Sales class
class Sales implements Department {
    String name;
    public void setName(String name) {
         this.name = name;
    }
    public void display() {
        System.out.println("Sales");
        System.out.println("Name :"+ this.name);
    }
}

// Developer class
class Developer implements Department {
    String name;
    public void setName(String name) {
         this.name = name;
    }
    public void display() {
        System.out.println("Developer");
        System.out.println("Name :"+ this.name);
    }
}

class CorrectDB {
    private static Department getReference(String name) {
        if("ProblemSetter".equals(name)) {
            return new ProblemSetter();
        } else if("Developer".equals(name)) {
            return new Developer();
        } else if("Sales".equals(name)) {
            return new Sales();
        }
        return null;
    }
    private static String removeSpecialChar(String inp) {
        String[] str = inp.split("[$#&]");
        String res = "";
        for(String s : str) {
            res += s;
        }
        return res;
    }
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        for(int i =0; i < N; i++) {
        String dept = s.next();
        String empName = s.next();
         Department dep = getReference(dept);
         dep.setName(removeSpecialChar(empName));
         dep.display();
        }
        // Write your code here

    }
}

