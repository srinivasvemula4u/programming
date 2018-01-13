/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srivemul
 */
class A {

    public synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Entered : A");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Trying to call B.last");
        b.last();
    }

    public synchronized void last() {
        System.out.println("Inside A.last");
    }
}

class B {

    public synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "  Entered: B");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Trying to call A.last");
        a.last();
    }

    public synchronized void last() {
        System.out.println("Inside B.last");
    }
}

    public class DeadLockExample implements Runnable {

        A a = new A();
        B b = new B();

        public DeadLockExample() {
            Thread.currentThread().setName("Main Thread");
            new Thread(this, "Racing Thread").start();
            a.foo(b); //
            System.out.println("Back in main thread");
        }

        @Override
        public void run() {
            b.bar(a);
            System.out.println("Back in other thread");
        }

        public static void main(String args[]) {
            new DeadLockExample();
        }

    }
