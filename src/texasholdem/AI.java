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
    
    public void AIturn()
    {               
       int choice = r.nextInt(100);
       
       if(choice < 90)
       {
           subtractChips(q.nextInt(getChips()));
       }
       else
       {
           didFold = true;
           
       }    
    }

    
}
