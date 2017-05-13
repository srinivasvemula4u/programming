/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author srivemul
 */
public class WorkerPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        RejectHandlerExecutionImpl rejectionHandler = new RejectHandlerExecutionImpl();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);
        MyMonitorThread monitor = new MyMonitorThread(executor, 3);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();
        //submit work to the thread pool
        for(int i=0; i<10; i++){
            executor.execute(new WorkerThread("cmd"+i));
        }
         Thread.sleep(30000);
        //shut down the pool
        executor.shutdown();
        //shut down the monitor thread
        Thread.sleep(5000);
        monitor.shutdown();
        
    }

}
