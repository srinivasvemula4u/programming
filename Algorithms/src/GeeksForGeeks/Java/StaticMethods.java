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
class A {
    public void method1() {
        System.out.println("A::Method1()");
    }
    protected void method2() {
        System.out.println("A::Method2()");
    }
    private void method3() {
        System.out.println("A::Method3()");
    }
    private static void method4() {
        System.out.println("A::Method4()");
    }
    public static void method5() {
        System.out.println("A::Method5()");
    }
    protected static void method6() {
        System.out.println("A::Method6()");
    }
}
class StaticMethods extends A {
    public void method1() {
        System.out.println("StaticMethods::Method1()");
    }
    protected void method2() {
        System.out.println("StaticMethods::Method2()");
    }
    private void method3() {
        System.out.println("StaticMethods::Method3()");
    }
    private static void method4() {
        System.out.println("StaticMethods::Method4()");
    }
    public static void method5() {
        System.out.println("StaticMethods::Method5()");
    }
    protected static void method6() {
        System.out.println("StaticMethods::Method6()");
    }
    public static void main(String[] args) {
        A obj = new StaticMethods();
        obj.method1();
        obj.method2();
        obj.method6();
        obj.method5();
        //obj.method4();
    }
}

