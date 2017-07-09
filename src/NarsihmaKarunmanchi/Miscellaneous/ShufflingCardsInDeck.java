/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Miscellaneous;

/**
 *
 * @author sv186040
 */
public class ShufflingCardsInDeck {

    /**
     * @param args the command line arguments
     */
    public static void shufflingCardsInDeck() {
        int[] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
        }
        for (int i = 0; i < 52; i++) {
            int r = i + (int) (Math.random() * (52 - i));
            int temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i] + " ");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        shufflingCardsInDeck();
    }

}
