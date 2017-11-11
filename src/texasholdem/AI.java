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
    
    public int AIturn(int difficulty, int minimum, AI a)
    {               
       if (difficulty == 0)
       {    
        int choice = r.nextInt(100);
       
       if(choice < 90)
       {
           int betChips = getChips() + 1;
           int maximum = getChips();
           while (betChips > maximum)
           {    
           betChips = q.nextInt(minimum);
           }
           
           subtractChips(betChips);
           return betChips;
       }
       else
       {
           didFold = true;
           
       }
       
       }
       else
       {
           checkCards c = new checkCards();
           
           a.sortHand(a.hand); 
           int hvalue = c.checkCards(a.hand);
           if ( hvalue > 15)
           {
                int betChips = getChips() + 1;
           int maximum = getChips();
           while (betChips > maximum)
           {    
           betChips = q.nextInt(minimum);
           return betChips;
           }
           
           subtractChips(betChips);
       }
           else if ( hvalue > 19)
           {   
               subtractChips(a.getChips());
               return a.getChips();
           }
           else 
           {
               didFold = true;
           }
           
       }
       return 0;
    }

    
}
