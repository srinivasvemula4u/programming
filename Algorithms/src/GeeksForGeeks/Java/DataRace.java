/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Java;

/**
 *
 * @author sv186040
 */
class Waiter implements Runnable {
private boolean shouldFinish;
void finish() { shouldFinish = true; }
public void run() {
long iteration = 0;
while (!shouldFinish) {
iteration++;
}
System.out.println("Finished after: " +
iteration);
}
}
public class DataRace {
public static void main(String[] args)
throws InterruptedException {
Waiter waiter = new Waiter();
Thread waiterThread = new Thread(waiter);
waiterThread.start();
waiter.finish();
waiterThread.join();
}
}
