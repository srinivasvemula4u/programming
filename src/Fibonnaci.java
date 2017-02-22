
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author srivemul
 */
public class Fibonnaci {

    //private int N;
    public static long FibonnaciNaive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return FibonnaciNaive(n - 1) + FibonnaciNaive(n - 2);
         
    }
    }

    public static long FibonnaciFast(int n) {
        if (n <= 1) {
            return n;
        }
        int[] fiboArray = new int[n + 1];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        //int i;
        for (int i = 2; i <= n; i++) {
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }
        return fiboArray[n];
    }

    public static BigInteger FibonnaciBigNaive(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        } else {
            return FibonnaciBigNaive(n - 1).add(FibonnaciBigNaive(n - 2));
        }
    }

    public static BigInteger FibonnaciBigFast(int n) {

        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        BigInteger[] fiboArray = new BigInteger[n + 1];
        fiboArray[0] = BigInteger.valueOf(0);
        fiboArray[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
           fiboArray[i] = fiboArray[i - 1].add(fiboArray[i - 2]);
           //  fiboArray[i] = (fiboArray[i - 1].add(fiboArray[i - 2])).mod(BigInteger.TEN);
        }
        return fiboArray[n];
    }
    public static BigInteger FibonaaciBigFastLastDigit(int n) {
         if (n <= 1) {
            return BigInteger.valueOf(n);
        }
          BigInteger[] fiboArray = new BigInteger[n + 1];
           fiboArray[0] = BigInteger.valueOf(0);
           fiboArray[1] = BigInteger.valueOf(1);
           for(int i = 2; i <=n; i++) {
               fiboArray[i] = fiboArray[i-1].remainder(BigInteger.TEN).add(fiboArray[i-2].remainder(BigInteger.TEN)).remainder(BigInteger.TEN);
           }
            return fiboArray[n];
    }
    
  private static long calc_fib_lin(int n) {
      if (n <= 1)
        return n;

      int i = 1;
      long a = 0, b = 1, c = a+b;
      
      while(i < n) {
          c = ((a%10)+(b%10))%10;
          a = b;
          b = c;
          i++;
      }
      
      return c;
    }
   public static int FibonaaciBigFastLastDigitMod10WithPiasnoPeriod(int n)
   {
       String str = "011235831459437077415617853819099875279651673033695493257291";
       return Character.getNumericValue(str.charAt(n%str.length()));
   }

    public static void main(String args[]) {
        /*  Test Generator for long 
        while(true) {
        Random rGenerator = new Random();
        int randomInt = rGenerator.nextInt(40); 
         System.out.println("Number is  "+randomInt);
       // int[] numbers = new int[randomInt];
          long res1 = FibonnaciNaive(randomInt);
         long res2 = FibonnaciFast(randomInt);
         if(res1 != res2)
         {
           //System.out.println("Number is  "+randomInt);
           System.out.println("Wrong answer: " + res1 + " "+ res2);
           break;
         } 
         else
         {
            
             System.out.println("Ok");
         }
         
    }*/
        // Test Generator for big numbers
      /*  while (true) {
            Random rGenerator = new Random();
            int randomInt = rGenerator.nextInt(40);
            System.out.println("Number is  " + randomInt);
            BigInteger res1 = FibonnaciBigNaive(randomInt);
            BigInteger res2 = FibonnaciBigFast(randomInt);
            if (!res1.equals(res2)) {
                System.out.println("Wrong answer: " + res1 + " " + res2);
                break;
            } else {

                System.out.println("Ok");
            }

        }*/
                
        
        
       Scanner in = new Scanner(System.in);
     //   int num = in.nextInt();
        
       Random ran = new Random();
       int num = ran.nextInt(10000000);
      // BigInteger BI = new BigInteger(num,ran);
        System.out.println(num);
        //System.out.println(Integer.numberOfLeadingZeros(2));
        // System.out.println(Integer.numberOfTrailingZeros(2));
        System.out.println(calc_fib_lin(num) );
     //   System.out.println(FibonaaciBigFastLastDigit(num));
        System.out.println(FibonaaciBigFastLastDigitMod10WithPiasnoPeriod(num));
       //  System.out.println( FibonnaciFast(num));
      //  System.out.println(FibonnaciNaive(num));
     //System.out.println( FibonnaciNaive(10));
   //  System.out.printl3n( FibonnaciFast(3));
      
      
    }
}
