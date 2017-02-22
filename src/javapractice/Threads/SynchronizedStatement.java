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
class callMe_X {

   synchronized public  void  call(String str) {
        System.out.print("[ " + str);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(callMe.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(" ]");
    }
}
class caller_X implements Runnable {

    private callMe_X target;
    private String msg;
    public Thread t;

    public caller_X(callMe_X target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized(target) {
        target.call(msg);
        }
    }
    
    public synchronized void test()
    {
        
    }

}
public class SynchronizedStatement {
    public static void main(String args[]) {

        callMe_X callMeObj = new callMe_X();
        caller_X ob1 = new caller_X(callMeObj, "Hello");
        caller_X ob2 = new caller_X(callMeObj, "a");
        caller_X ob3 = new caller_X(callMeObj, "World");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SynchronizeThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
