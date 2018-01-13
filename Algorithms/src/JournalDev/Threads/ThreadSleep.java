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
public class ThreadSleep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));

    }
}
