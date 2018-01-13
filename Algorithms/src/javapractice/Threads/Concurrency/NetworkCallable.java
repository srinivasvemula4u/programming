/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Threads.Concurrency;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srivemul
 */
class NetworkCallable implements Callable<RequestResponse> {

    RequestResponse reqResp;

    NetworkCallable(RequestResponse lookup) {
        reqResp = lookup;
    }

    @Override
    public RequestResponse call() throws Exception {
        try (Socket socket = new Socket(reqResp.host, reqResp.port);
                Scanner scanner = new Scanner(socket.getInputStream());) {

            reqResp.response = scanner.next();
            //   System.out.println(reqResp.host + " " + lookup.port + " " + lookup.response);
        } catch (IOException ex) {
            Logger.getLogger(SingleThreadedNetworkClient.class.getName()).log(Level.SEVERE, null, ex);
        }
       return reqResp;
    }

}
