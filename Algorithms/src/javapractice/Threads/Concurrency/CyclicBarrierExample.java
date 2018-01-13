/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads.Concurrency;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author srivemul
 */
/*
Different types of concurrent classes
1) semaphore : Is a classic concurrency tool
2) countdown latch
3) Cyclic Barries
4) Phaser
5) Exchanger
*/
public class CyclicBarrierExample {

    /**
     * @param args the command line arguments
     */
    
    public CyclicBarrierExample() {
    }
    final CyclicBarrier barrier = new CyclicBarrier(2,
    new Runnable() {
        @Override
        public void run() {
           System.out.println("Thread before wait");
            try {
                barrier.await();
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread after wait");
           
        }
        
    });
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
