/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads.Concurrency;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srivemul
 */
public class SingleThreadedNetworkClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String host = "localhost";
        for(int port = 1000; port < 100010; port++) {
            RequestResponse lookup = new RequestResponse(host,port);
            try (
                Socket socket = new Socket(lookup.host,lookup.port);
                   Scanner scanner = new Scanner(socket.getInputStream()); ) {
                   lookup.response = scanner.next();
                   System.out.println(lookup.host + " " + lookup.port + " " + lookup.response);
                   }catch (IOException ex) {
                Logger.getLogger(SingleThreadedNetworkClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
