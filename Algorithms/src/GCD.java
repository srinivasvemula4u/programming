
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
public class GCD {

    public static BigInteger GCDNaive(BigInteger a, BigInteger b) {
        if (a.equals(BigInteger.valueOf(0)) && !b.equals(BigInteger.valueOf(0))) {
            return b;
        } else if (b.equals(BigInteger.valueOf(0)) && !a.equals(BigInteger.valueOf(0))) {
            return a;
        }
        BigInteger minimum = a.min(b);
        BigInteger gcd = BigInteger.valueOf(0);
        for (BigInteger i = BigInteger.valueOf(1); (i.compareTo(minimum) == -1 || i.compareTo(minimum) == 0); i = i.add(BigInteger.valueOf(1))) {

            if (a.remainder(i).equals(BigInteger.valueOf(0)) && b.remainder(i).equals(BigInteger.valueOf(0))) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static BigInteger GCDEculidean(BigInteger a, BigInteger b) {

        if (b.equals(BigInteger.valueOf(0))) {
            return a;
        } else {
            return GCDEculidean(b, a.remainder(b));
        }
    }
    public static long LongGCDEculidean(long a,long b) {
        if (b == 0) {
            return a;
        } else {
            return LongGCDEculidean(b, a%(b));
        }
    }
      private static long lcm(long a, long b) {
    return (((long)a)*((long)b))/LongGCDEculidean(a, b);
  }

    public static void main(String args[]) {
     /*   while (true) {
            Random rGenerator = new Random();
            BigInteger a = BigInteger.valueOf(rGenerator.nextInt(500000000));
            BigInteger b = BigInteger.valueOf(rGenerator.nextInt(10000));
            System.out.println("a =" + a + " b= " + b);
            BigInteger res1 = GCDNaive(a, b);
            BigInteger res2 = GCDEculidean(a, b);
            if (!res1.equals(res2)) {
                System.out.println("Wrong answer: " + res1 + " " + res2);
                break;
            } else {
               System.out.println("answer: " + res1 + " " + res2);
                System.out.println("Ok");
            }

        }*/
     
     //  System.out.println(GCDNaive(BigInteger.valueOf(3918848),BigInteger.valueOf(1653264)));
       //  System.out.println(GCDEculidean(BigInteger.valueOf(3918848),BigInteger.valueOf(1653264)));
        Scanner scanner = new Scanner(System.in);
             
       Random ran = new Random();
       int num1 = ran.nextInt(1000000000);
        long num2 = ran.nextInt(1000000000);
        System.out.println(num1 + " " +num2);
        System.out.println(LongGCDEculidean(num1,num2));
          System.out.println(lcm(num1,num2));
     // System.out.println(LongGCDEculidean(931307375,90861507));
    }
}
