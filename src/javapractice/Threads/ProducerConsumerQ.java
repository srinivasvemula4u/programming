/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads;

/**
 *
 * @author srivemul
 */
class Q {

    int n;

    public synchronized void put(int n) {
        this.n = n;
        System.out.println("Put = " + n);
    }

    public synchronized int get() {
        System.out.println("Get = " + n);
        return n;
    }
}

class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }

}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }

}

public class ProducerConsumerQ {

    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }

}
