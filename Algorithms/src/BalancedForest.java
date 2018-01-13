
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.io.*;
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
public class BalancedForest {
    public static void main(String[] args) {
      //  Scanner
      Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
       
        int Q = scanner.nextInt();
        while(Q-- > 0) {
             Map<Integer, Set<Integer>> nodesMap = new HashMap<>();
            int N = scanner.nextInt();
            long[] nodeCoins = new long[N+1];
            for(int i = 1; i <= N; i++) {
                nodeCoins[i] = scanner.nextLong();
            }
            for(int i = 0; i <  N-1; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
            Set<Integer> uEdges = nodesMap.get(u);
            if(uEdges == null) {
                uEdges = new HashSet<>();
            }
            uEdges.add(v);
            nodesMap.put(u, uEdges);
            }
         /* for(Map.Entry m : nodesMap.entrySet()) {
              System.out.println(m.getKey() + " "+m.getValue());
          }
          System.out.println( "******");*/
        }
    }
}
