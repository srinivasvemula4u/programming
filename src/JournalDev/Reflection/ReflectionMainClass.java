/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Reflection;

/**
 *
 * @author srivemul
 */
public class ReflectionMainClass {

    /**
     * @param args the command line arguments
     */
    /*
    We can get Class of an object using three methods – through static variable class,
    using getClass() method of object and java.lang.Class.forName(String fullyClassifiedClassName). For primitive 
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Class<?> concreteClass = ConcreteClass.class;
        System.out.println(concreteClass.getCanonicalName());
        concreteClass = new ConcreteClass(10).getClass();
        System.out.println(concreteClass.getCanonicalName());
        concreteClass = Class.forName("JournalDev.Reflection.ConcreteClass");
        System.out.println(concreteClass.getCanonicalName());

        //for primitive types, wrapper classes and arrays
        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName()); // prints boolean
        
        Class<?> cDouble = Double.class;
        System.out.println(cDouble.getCanonicalName());
        cDouble = Double.TYPE;
         System.out.println(cDouble.getCanonicalName());
    }

}
