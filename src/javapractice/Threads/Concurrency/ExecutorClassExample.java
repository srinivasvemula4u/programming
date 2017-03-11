/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author srivemul
 */

class CallableInterfaceImpl implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(this.getClass().getCanonicalName());
        return new Integer(10);
    }

}

public class ExecutorClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
     //  ExecutorService es = Executors.newCachedThreadPool();
       int count = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(count);
       Callable<Integer> obj = new CallableInterfaceImpl();
       Future<Integer> future = es.submit(obj);
       System.out.println(future.get());
       
    }

}
