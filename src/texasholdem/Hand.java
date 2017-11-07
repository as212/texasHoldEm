/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author adams_000
 */
public class Hand {
     ArrayList<Cards> hand = new ArrayList<Cards>();
        
    
    public void addCard(Cards c)
    {
        
       hand.add(c);
    }
    public void sortHand(ArrayList<Cards> hand)
    {
        
        Collections.sort(hand);
              
              
    }  
     
    
}
