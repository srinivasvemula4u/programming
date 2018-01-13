/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads.Concurrency;

/**
 *
 * @author srivemul
 */
public class RequestResponse {
    String host;
    int port;
    String response;
    RequestResponse(String host, int port) {
      this.host = host;
      this.port = port;
    }
    
}
