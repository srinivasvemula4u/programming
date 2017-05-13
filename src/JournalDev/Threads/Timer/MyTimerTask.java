/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author srivemul
 */
public class MyTimerTask extends TimerTask {

    /**
     * @param args the command line arguments
     */
    @Override
    public void run() {
        System.out.println("Timer task started at:" + new Date());
        processTask();
        System.out.println("Timer task completed at:" + new Date());
    }

    private void processTask() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        MyTimerTask myTimerTask = new MyTimerTask();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTimerTask, 0, 10 * 1000);
        System.out.println("TimerTask started");
        try {
            Thread.sleep(120000);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        timer.cancel();
          System.out.println("TimerTask cancelled");
         try {
            Thread.sleep(30000);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

}
