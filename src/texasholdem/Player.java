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
public class Player {
   private int chips = 20;
   Hand h = new Hand();
   boolean didFold = false;
   int handValue;
   
   public int getChips()
   {
       return chips;
   }
   public int subtractChips(int x)
   {
       chips = chips - x;
       return chips;
   }
   public int addChips(int x)
   {
        chips = chips + x;
        return chips;
   }   
           
   public void turn()
   {
       int count = 0;
       if(didFold = true)
       {
           count = count + 1;
       }
       while(count < 1)
       {
           
       }
        
        
           
   }
   
   public void hand()
        {
            Hand h = new Hand();
            
        }
    
}
