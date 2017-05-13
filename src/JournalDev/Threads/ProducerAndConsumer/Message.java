/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads.ProducerAndConsumer;

/**
 *
 * @author srivemul
 */
public class Message {
    String messge;

    public Message(String messge) {
        this.messge = messge;
    }

    public String getMessge() {
        return messge;
    }
    
}
