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
public class Deck {
     ArrayList<Cards> deck = new ArrayList<Cards>();  

public void deck()
{
    for (int i=0;i<=3; i++)
    {
        for(int j =0;j<=12;j++)
        {
            
            deck.add(new Cards(i,j));
            
            
            
        }
    }
   // System.out.print(deck);

            
}
   public void shuffle()
   {
       Collections.shuffle(deck); 
   }
   
    
     

}