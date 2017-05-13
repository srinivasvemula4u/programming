/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.ProducerAndConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author srivemul
 */
public class ProducerConsumerService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BlockingQueue<Message> blockingQueue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");

    }

}
