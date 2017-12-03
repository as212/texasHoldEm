/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;
import java.util.Random;
/**
 *
 * @author adams_000
 */
public class AI extends Player {
    Random r = new Random();
    Random q = new Random();
     int betChips;
    
    public int AIturn(int difficulty, int minimum, Player a)
    {               
       if(didFold ==1 || didLose == 1)
       {
           return 0;
       }  
        if (difficulty == 0)
       {    
        
          
       
           
          
           
           
             
               betChips = a.getTotalBet() - getTotalBet();
             
         
                       
                      
                       
               
           
           
           subtractChips(betChips);
           
           return betChips;
       
       }

       
       
        
       if(difficulty == 1)
        {   
       {
            
           checkCards c = new checkCards();
           
           sortHand(hand); 
           System.out.print(hand);
           a.setHandValue(c.checkCards(hand))  ;
           System.out.print(getHandValue());
           if ( getHandValue() >=0)
           {
             betChips = 4;
             /*if( betChips < minimum)
             {    
                 didFold = 1;
                 return 0;
             }   
          */ subtractChips(betChips);
           
       }
          
           if ( getHandValue() > 10)
           {
             betChips = 5;
           /*  if( betChips < minimum)
             {    
                 didFold = 1;
                 return 0;
             }   
           */subtractChips(betChips);
           allIn();
       }
           
           
           
           
           if ( getHandValue() > 19)
           {   
              if(didFold == 1)
         {
                  int betChips = 0;
                   return betChips;
         }    
               subtractChips(a.getChips());
                allIn();
                   return a.getChips();
           }
           else
           {    
             int betchips = 3;
             subtractChips(betChips);
             return betChips;
           }    
           
       }
        }
        return betChips;
    }
     public int allIn()
     {
         int bet = getChips();
         if(getChips() < 0)
         {   
             
             subtractChips(getChips());
             
         }
         return bet;
     }        
             
    
}
