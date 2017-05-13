/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.DaemonThread;

/**
 *
 * @author srivemul
 */
public class JavaDaemonThread {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new DaemonThreadExample(), "dt");
        dt.setDaemon(true);
        dt.start();
        //continue program
        Thread.sleep(30000);
        System.out.println("Finishing program");
    }
 
    
}
