/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.CallableAndFuture;

import java.util.concurrent.Callable;

/**
 *
 * @author srivemul
 */
public class MyCallableFutureTask implements Callable<String> {

    private long waitTime;

    public MyCallableFutureTask(int timeInMillis) {
        this.waitTime = timeInMillis;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

}
