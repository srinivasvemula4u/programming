/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.miscellaneousproblems;

/**
 *
 * @author srivemul
 */
public class CountingNumberOf1s {
  public static void main(String args[]) {
      int n = 5;
      System.out.println(( n & -n)-1); // Creating mask for trailing  zero's
      System.out.println((( n & 0xAA) >> 1) | ((n & 0x55) << 1)); // swap all odd and even bits
  }
}
