/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads.Concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srivemul
 */
public class MultiThreadedNetworkClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService executor = Executors.newCachedThreadPool();
        Map<RequestResponse, Future<RequestResponse>> callables = new HashMap<>();
        String host = "localhost";
        for (int port = 1000; port < 100010; port++) {
            RequestResponse lookup = new RequestResponse(host, port);
            NetworkCallable callable = new NetworkCallable(lookup);
            Future<RequestResponse> future = executor.submit(callable);
            callables.put(lookup, future);
        }
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            Logger.getLogger(MultiThreadedNetworkClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(RequestResponse lookup : callables.keySet()) {
            Future<RequestResponse> future = callables.get(lookup);
              RequestResponse response = null;
            try {
                 response = future.get();
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiThreadedNetworkClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(MultiThreadedNetworkClient.class.getName()).log(Level.SEVERE, null, ex);
            }
             System.out.println(response.host + " " + response.port + " " + response.response);
        }
                

    }
}
