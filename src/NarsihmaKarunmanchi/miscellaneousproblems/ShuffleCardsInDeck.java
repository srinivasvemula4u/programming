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
public class ShuffleCardsInDeck {
    public static void main(String args[]) {
        int n = 52;
        int[] cards = new int[n];
        for(int i = 0; i < n; i++)
            cards[i] = i;
        for(int i =0; i < n; i++)
            System.out.print(cards[i] + " ");
        System.out.println();
        for(int i = 0; i < n; i++) {
            int r = i+(int)(Math.random()*(n-i));
            int temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
        for(int i =0; i < n; i++)
            System.out.print(cards[i] + " ");
        System.out.println();
    }
}
