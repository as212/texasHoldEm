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
public class Player {
   private int chips = 20;
   Hand h = new Hand();
   int didFold = 0;
   private int handValue;
   public int count;
   private int totalBet = 0;
   public int didLose = 0;
   
   public int getChips()
   {
       return chips;
   }
   public int subtractChips(int x)
   {
       chips = chips - x;
       setTotalBet(x);
       return chips;
   }
   public int addChips(int x)
   {
        chips = chips + x;
        
        return chips;
   }   
           
  
   
    public void setHandValue(int value)
    {
        handValue = value;
    }     
    public int getHandValue()
    {
        return handValue;
        
    }        
        
    public void getNewHand()
    {
       ArrayList<Cards> hand = new ArrayList<Cards>(); 
    }        
    
    ArrayList<Cards> hand = new ArrayList<Cards>();
        
        
    public void addCard(Cards c)
    {
        
       hand.add(c);
    }
    public void sortHand(ArrayList<Cards> hand)
    {
        
        Collections.sort(hand);
              
              
    }  
    public int getTotalBet() 
    {
        return totalBet;
    }
    public void setTotalBet(int x)
    {
        totalBet = totalBet + x;
    }        
    public void setChips(int x)
    {
        chips = x;
    }        
    public void resetTotalBet()
    {        
        totalBet = 0;
    }  
    public void didLose()
    {
      if(chips ==0)  
      {
          didLose = 1;
      }  
    }        
        }
    

