/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

/**
 *
 * @author adams_000
 */
public class Cards implements Comparable<Cards> {
    public int suit, value;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"Ace", "2", "3", "4", "5",
                                   "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Cards(int cSuit, int cValue)
    {
        suit = cSuit; 
        value = cValue;
    }
    public int getSuit()
    {
        
        return suit;
    }
    public int getValue()
    {
        return value;
    }
    public String toString()
    {
        String cardInfo = cardValue[value] + cardSuit[suit];

        return cardInfo;
}
    @Override
    public int compareTo(Cards compareCard) {
        
        int compareSuit = ((Cards)compareCard).getSuit();
        int compareValue=((Cards)compareCard).getValue();
        if(this.suit == compareSuit)
        {
            /* For Ascending order of values */
            return this.value-compareValue;
         }
        /* For Ascending order of suits */
        else return this.suit - compareSuit; 
     }



}
