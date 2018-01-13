/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.ThreadPool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * @author srivemul
 */
public class MyMonitorThread implements Runnable {

    private ThreadPoolExecutor threadPoolExecutor;
    private int delay;
    private boolean flag = true;

    public MyMonitorThread(ThreadPoolExecutor threadPoolExecutor, int delay) {
        this.threadPoolExecutor = threadPoolExecutor;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println(String.format("[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                    threadPoolExecutor.getPoolSize(), threadPoolExecutor.getCorePoolSize(), threadPoolExecutor.getActiveCount(), threadPoolExecutor.getCompletedTaskCount(), threadPoolExecutor.getTaskCount(), threadPoolExecutor.isShutdown(), threadPoolExecutor.isTerminated()));
            try {
                Thread.sleep(delay * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.flag = false;
    }

}
