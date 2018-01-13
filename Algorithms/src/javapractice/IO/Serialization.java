/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.IO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * 
 */
public class Serialization implements Serializable{
    
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(new java.util.Date());
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
       System.out.println( (Date)ois.readObject());
    }
    public static void main(String args[]) throws IOException {
        Serialization obj = new Serialization();
       // obj.writeObject(new ObjectOutputStream());
    }
}
