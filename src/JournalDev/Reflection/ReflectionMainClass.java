/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Reflection;

import java.util.Arrays;

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

        Class<?> cDoubleArray = Class.forName("[D");
        System.out.println(cDoubleArray.getCanonicalName()); //prints double[]
        cDoubleArray = Double[].class;
        System.out.println(cDoubleArray.getCanonicalName());

        Class<?> twoDStringArray = String[][].class;
        System.out.println(twoDStringArray.getCanonicalName()); // prints java.lang.String[][]
        twoDStringArray = String.class;
        System.out.println(twoDStringArray.getCanonicalName());

        Class<?> superClass = Class.forName("JournalDev.Reflection.ConcreteClass").getSuperclass();
        Class<?>[] interfaces = Class.forName("JournalDev.Reflection.ConcreteClass").getInterfaces();

        for (Class interfaceObj : interfaces) {
            System.out.println(interfaceObj.getCanonicalName());
        }
        System.out.println("**********************");
        Class<?>[] classes = Class.forName("JournalDev.Reflection.ConcreteClass").getClasses();
        for (Class classObj : classes) {
            System.out.println(classObj.getCanonicalName());
        }
        System.out.println("**********************");
        System.out.println(superClass); // prints "class com.journaldev.reflection.BaseClass"
        System.out.println(Object.class.getSuperclass()); // prints "null"
        System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"

        Class<?>[] classes1 = concreteClass.getClasses();
        //[class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicClass, 
        //class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicEnum, 
        //interface com.journaldev.reflection.ConcreteClass$ConcreteClassPublicInterface,
        //class com.journaldev.reflection.BaseClass$BaseClassInnerClass, 
        //class com.journaldev.reflection.BaseClass$BaseClassMemberEnum]
        System.out.println(Arrays.toString(classes1));

        //getting all of the classes, interfaces, and enums that are explicitly declared in ConcreteClass
        Class<?>[] explicitClasses = Class.forName("JournalDev.Reflection.ConcreteClass").getDeclaredClasses();
        //prints [class com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultClass, 
        //class com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultEnum, 
        //class com.journaldev.reflection.ConcreteClass$ConcreteClassPrivateClass, 
        //class com.journaldev.reflection.ConcreteClass$ConcreteClassProtectedClass, 
        //class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicClass, 
        //class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicEnum, 
        //interface com.journaldev.reflection.ConcreteClass$ConcreteClassPublicInterface]
        System.out.println(Arrays.toString(explicitClasses));

        /*
        getDeclaringClass() method returns the Class object representing the class in which it was declared.
         */
        Class<?> innerClass = Class.forName("JournalDev.Reflection.ConcreteClass$ConcreteClassDefaultClass");
        //prints com.journaldev.reflection.ConcreteClass
        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());
        /*
        getPackage() method returns the package for this class. The class loader of this class is used to find the package. 
        We can invoke getName() method of Package to get the name of the package.
         */
        //System.out.println(Class.forName("Journaldev.Reflection.BaseInterface").getPackage().getName());

    }

}
