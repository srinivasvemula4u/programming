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
class NewThread implements Runnable {

    String name;
    Thread t;
    Boolean suspendFlag;

    public NewThread(String name) {
        this.name = name;
        t = new Thread(this, this.name);
        suspendFlag = false;
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(name + " exiting.");
    }
    synchronized void suspend() {
        suspendFlag = true;
    }

    synchronized void resume() {
        suspendFlag = false;
        notify();
    }

}

public class SuspendingResumeThreadsExample {

    public static void main(String args[]) {

        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            ob1.suspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.resume();
            System.out.println("Resuming thread One");
            ob2.suspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            ob2.resume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
