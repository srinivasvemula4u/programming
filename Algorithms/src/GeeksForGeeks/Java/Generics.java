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
Generics in Java is similar to templates in C++. The idea is to allow type (Integer, String, … etc and user defined types) to be a parameter to methods, classes and interfaces. For example, classes like HashSet, ArrayList, HashMap, etc use generics very well. We can use them for any type.

 

Generic Class

Like C++, we use <> to specify parameter types in generic class creation. To create objects of generic class, we use following syntax.
// To create an instance of generic class 
BaseType <Type> obj = new BaseType <Type>()

Note: In Parameter type we can not use primitives like 
      'int','char' or 'double'.
 */
// A Simple Java program to show working of user defined
// Generic classes
// We use < > to specify Parameter type
class Test<T> {

    // An object of type T is declared
    T obj;

    Test(T obj) {
        this.obj = obj;
    }  // constructor

    public T getObject() {
        return this.obj;
    }
}

//We can also pass multiple Type parameters in Generic classes.
// A Simple Java program to show multiple
// type parameters in Java Generics
// We use < > to specify Parameter type
class Test1<T, U> {

    T obj1;  // An object of type T
    U obj2;  // An object of type U

    // constructor
    Test1(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class Generics {

    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj
                = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());

        Test1<String, Integer> obj
                = new Test1("GfG", 15);

        obj.print();
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }

    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }
}
