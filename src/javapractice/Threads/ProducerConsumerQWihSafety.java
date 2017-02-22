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
class Q_X {

    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer_X implements Runnable {

    Q_X q;

    public Producer_X(Q_X q) {
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

class Consumer_X implements Runnable {

    Q_X q;

    public Consumer_X(Q_X q) {
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

public class ProducerConsumerQWihSafety {
public static void main(String args[]) {
        Q_X q = new Q_X();
        new Producer_X(q);
        new Consumer_X(q);
        System.out.println("Press Control-C to stop.");
    }
}
