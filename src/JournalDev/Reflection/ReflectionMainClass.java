/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
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
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
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
        System.out.println("\n\n");
        /*
        getPackage() method returns the package for this class. The class loader of this class is used to find the package. 
        We can invoke getName() method of Package to get the name of the package.
         */
        System.out.println(Class.forName("JournalDev.Reflection.BaseInterface").getPackage().getName());
        System.out.println(BaseInterface.class.getPackage().getName());
        System.out.println(Modifier.toString(concreteClass.getModifiers())); //prints "public"
        System.out.println("\n\n");
        //prints "public abstract interface"
        System.out.println(Modifier.toString(Class.forName("JournalDev.Reflection.BaseInterface").getModifiers()));
        //Get Type parameters (generics)
        TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
        for (TypeVariable<?> t : typeParameters) {
            System.out.print(t.getName() + ",");
        }
        System.out.println("\n\n");
        Type[] interfaces1 = Class.forName("java.util.HashMap").getGenericInterfaces();
//prints "[java.util.Map<K, V>, interface java.lang.Cloneable, interface java.io.Serializable]"
        System.out.println(Arrays.toString(interfaces1));
//prints "[interface java.util.Map, interface java.lang.Cloneable, interface java.io.Serializable]"
        System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));

        /*
        getMethods() method returns the array of public methods of the Class including public methods of it’s superclasses and 
        super interfaces.
         */
        Method[] publicMethods = Class.forName("JournalDev.Reflection.ConcreteClass").getMethods();
//prints public methods of ConcreteClass, BaseClass, Object
        System.out.println(Arrays.toString(publicMethods));

        // getConstructors() method returns the list of public constructors of the class reference of object.
//Get All public constructors
        Constructor<?>[] publicConstructors = Class.forName("JournalDev.Reflection.ConcreteClass").getConstructors();
//prints public constructors of ConcreteClass
        System.out.println(Arrays.toString(publicConstructors));

        // getFields() method returns the array of public fields of the class including public fields of it’s super 
        //classes and super interfaces.
//Get All public fields
        Field[] publicFields = Class.forName("JournalDev.Reflection.ConcreteClass").getFields();
//prints public fields of ConcreteClass, it's superclass and super interfaces
        System.out.println(Arrays.toString(publicFields));

        /*
        getAnnotations() method returns all the annotations for the element, we can use it with class, 
        fields and methods also. Note that only annotations available with reflection are with retention policy of RUNTIME, 
        check out Java Annotations Tutorial.
         */
        java.lang.annotation.Annotation[] annotations = Class.forName("JournalDev.Reflection.ConcreteClass").getAnnotations();
//prints [@java.lang.Deprecated()]
        System.out.println(Arrays.toString(annotations));

        Field field = Class.forName("JournalDev.Reflection.ConcreteClass").getField("interfaceInt");
        Class<?> fieldClass = field.getDeclaringClass();
        System.out.println(fieldClass.getCanonicalName());

        Field field2 = Class.forName("JournalDev.Reflection.ConcreteClass").getField("publicInt");
        Class<?> fieldType = field2.getType();
        System.out.println(fieldType.getCanonicalName());

        Field field3 = Class.forName("JournalDev.Reflection.ConcreteClass").getField("publicInt");
        ConcreteClass obj = new ConcreteClass(5);
        System.out.println(field3.get(obj)); //prints 5
        field3.setInt(obj, 10); //setting field value to 10 in object
        System.out.println(field3.get(obj)); //prints 10

    }

}
