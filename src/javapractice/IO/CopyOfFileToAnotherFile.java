/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.IO;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * 
 */
public class CopyOfFileToAnotherFile {
    public static void main(String args[]) throws IOException {
      /*  try( BufferedReader bis = new BufferedReader(new FileReader(args[0]));
                BufferedWriter bos = new BufferedWriter(new FileWriter(args[1]))) {
            String line = "";
            while((line = bis.readLine()) != null) {
                bos.write(line);
                bos.newLine();
            }
        }*/
            Console cons = System.console();
            if(cons != null) {
                boolean userValid = false;
                String userTypeId,userPwdType;
                userTypeId = cons.readLine("%s","User Name : ");
                userPwdType = new String(cons.readPassword("%s","Password : "));
                System.out.println(userTypeId + " "+userPwdType);
            }
           // ObjectInputStream ois = new ObjectInputStream
            //System.out.println(us);
      //  }
    }
}
