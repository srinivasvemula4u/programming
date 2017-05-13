/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.ProducerAndConsumer;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author srivemul
 */
public class Consumer implements Runnable {

    BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Message msg;
        //consuming messages until exit message is received
        try {
            while ((msg = queue.take()).getMessge() != "Exit") {
                Thread.sleep(10);
                System.out.println("Consumed " + msg.getMessge());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
