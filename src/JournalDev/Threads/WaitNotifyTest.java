/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads;

/**
 *
 * @author srivemul
 */
public class WaitNotifyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        Thread t1 = new Thread(waiter, "waiter");
        t1.start();

        Waiter waiter1 = new Waiter(msg);
        Thread t2 = new Thread(waiter1, "waiter1");
        t2.start();

        Notifier notifier = new Notifier(msg);
        Thread t3 = new Thread(notifier, "notifier");
        t3.start();
        System.out.println("All the threads are started");
    }

}
