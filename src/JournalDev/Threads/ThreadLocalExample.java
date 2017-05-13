/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JournalDev.Threads;

import java.text.SimpleDateFormat;

/**
 *
 * @author srivemul
 */
public class ThreadLocalExample {

    /**
     * @param args the command line arguments
     */
    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };
    
    public ThreadLocalExample() {
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
