/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.ThreadSafety;

import java.util.Arrays;

/**
 *
 * @author srivemul
 */
public class SyncronizedMethod {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws InterruptedException {
        String[] arr = {"1","2","3","4","5","6"};
        HashMapProcessor hmp = new HashMapProcessor(arr);
        Thread t1=new Thread(hmp, "t1");
        Thread t2=new Thread(hmp, "t2");
        Thread t3=new Thread(hmp, "t3");
        long start = System.currentTimeMillis();
        //start all the threads
        t1.start();t2.start();t3.start();
        //wait for threads to finish
        t1.join();t2.join();t3.join();
        System.out.println("Time taken= "+(System.currentTimeMillis()-start));
        //check the shared variable value now
        System.out.println(Arrays.asList(hmp.getMap()));
    }
    
}
