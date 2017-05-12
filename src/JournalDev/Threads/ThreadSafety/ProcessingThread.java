/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.ThreadSafety;

/**
 *
 * @author srivemul
 */
public class ProcessingThread implements Runnable{
    private int count;
    
    @Override
    public void run() {
        for(int i=1; i < 5; i++){
            processSomething(i);
        	count++;
        }
    }

    public int getCount() {
        return this.count;
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
