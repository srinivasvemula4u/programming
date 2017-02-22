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
class callMe {

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

class caller implements Runnable {

    private callMe target;
    private String msg;
    public Thread t;

    public caller(callMe target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }

}

public class SynchronizeThreadDemo {

    public static void main(String args[]) {

        callMe callMeObj = new callMe();
        caller ob1 = new caller(callMeObj, "Hello");
        caller ob2 = new caller(callMeObj, "a");
        caller ob3 = new caller(callMeObj, "World");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SynchronizeThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
