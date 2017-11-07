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
public class checkCards {
    
    
    public int checkCards(Player a)
    {        
    
    // sorts hand then checks hand and returns a value    
    int handValue =0;
    Cards c0 = new Cards(0,0);
    Cards c1 = new Cards(0,0);
    Cards c2 = new Cards(0,0);
    Cards c3 = new Cards(0,0);
    Cards c4 = new Cards(0,0);
    Cards c5 = new Cards(0,0);
    Cards c6 = new Cards(0,0);
    a.sortHand(a.hand);
    c0 = a.hand.get(0);
    c1 = a.hand.get(1);
    c2 = a.hand.get(2);
    c3 = a.hand.get(3);
    c4 = a.hand.get(4);
    c5 = a.hand.get(5);
    c6 = a.hand.get(6);
    
    
    // royal flush
    if((c0.suit == c1.suit && c1.suit == c2.suit && c2.suit == c3.suit && c3.suit == c4.suit)|| (c1.suit == c2.suit && c2.suit == c3.suit && c3.suit == c4.suit && c4.suit == c5.suit)||(c2.suit == c3.suit && c3.suit == c4.suit && c4.suit == c5.suit && c5.suit == c6.suit) && (c0.value == 0 || c1.value == 0|| c2.value == 0 || c3.value == 0 || c4.value == 0 || c5.value == 0 || c6.value == 0 ) && (c0.value == 12 || c1.value == 12|| c2.value == 12 || c3.value == 12 || c4.value == 12 || c5.value == 12 || c6.value == 12 )&&(c0.value == 11 || c1.value == 11|| c2.value == 11 || c3.value == 11 || c4.value == 11 || c5.value == 11 || c6.value == 11 )&& (c0.value == 10 || c1.value == 10|| c2.value == 10 || c3.value == 10 || c4.value == 10 || c5.value == 10 || c6.value == 10 )&& (c0.value == 9 || c1.value == 9|| c2.value == 9 || c3.value == 9 || c4.value == 9 || c5.value == 9 || c6.value == 9 ))
    {
        handValue = 21;
    }    
    // straight flush
    else if((c0.value == c1.value -1 && c1.value == c2.value -1 && c2.value == c3.value -1 && c3.value == c4.value -1)|| (c1.value == c2.value -1 && c2.value == c3.value -1 && c3.value == c4.value -1 && c4.value == c5.value -1)|| (c2.value == c3.value -1 && c3.value == c4.value -1 && c4.value == c5.value -1 && c5.value == c6.value -1)&& (c0.suit == c1.suit && c1.suit == c2.suit && c2.suit == c3.suit && c3.suit == c4.suit)|| (c1.suit == c2.suit && c2.suit == c3.suit && c3.suit == c4.suit && c4.suit == c5.suit)||(c2.suit == c3.suit && c3.suit == c4.suit && c4.suit == c5.suit && c5.suit == c6.suit))
    {
        
        handValue = 20;
    }    
    // four of a kind
    else if((c0.value == c1.value && c1.value == c2.value && c2.value == c3.value) || (c1.value == c2.value && c2.value == c3.value && c3.value == c4.value) || (c2.value == c3.value && c3.value == c4.value && c4.value == c5.value) || (c3.value == c4.value && c4.value == c5.value && c5.value == c6.value))
    {    
        handValue = 19;
    }
    //full house
    else if((c1.value == c2.value && c2.value == c3.value && (c4.value == c5.value || c5.value == c6.value))||(c0.value == c1.value && c1.value == c2.value && (c3.value == c4.value || c4.value == c5.value || c5.value == c6.value))||(c2.value == c3.value && c3.value == c4.value && (c0.value == c1.value || c5.value == c6.value))||(c3.value == c4.value && c4.value == c5.value && (c0.value == c1.value || c1.value == c2.value))||(c4.value == c5.value && c5.value == c6.value && ( c0.value == c1.value || c1.value == c2.value || c2.value == c3.value)))
    {
        handValue = 18;
    }
    //flush
    else if((c0.suit == c1.suit && c1.suit == c2.suit && c2.suit == c3.suit && c3.suit == c4.suit)|| (c1.suit == c2.suit && c2.suit == c3.suit && c3.suit == c4.suit && c4.suit == c5.suit)||(c2.suit == c3.suit && c3.suit == c4.suit && c4.suit == c5.suit && c5.suit == c6.suit) )
    {    
        handValue = 17;
    }    
    
    //straight
    else if((c0.value == c1.value -1 && c1.value == c2.value -1 && c2.value == c3.value -1 && c3.value == c4.value -1)|| (c1.value == c2.value -1 && c2.value == c3.value -1 && c3.value == c4.value -1 && c4.value == c5.value -1)|| (c2.value == c3.value -1 && c3.value == c4.value -1 && c4.value == c5.value -1 && c5.value == c6.value -1))
    {
      handValue = 16;  
    }
    // three of a kind
    else if((c6.value == c5.value && c5.value == c4.value ) || (c6.value == c5.value && c5.value == c3.value )|| (c6.value == c5.value && c5.value == c2.value )|| (c6.value == c5.value && c5.value == c1.value )|| (c6.value == c5.value && c5.value == c0.value ) || (c6.value == c4.value && c4.value == c3.value )|| (c6.value == c4.value && c4.value == c2.value )|| (c6.value == c4.value && c4.value == c2.value )|| (c6.value == c4.value && c4.value == c0.value )|| (c6.value == c3.value && c3.value == c2.value )|| (c6.value == c3.value && c3.value == c1.value )|| (c6.value == c3.value && c3.value == c0.value )|| (c6.value == c2.value && c2.value == c1.value )|| (c6.value == c2.value && c2.value == c0.value )|| (c6.value == c1.value && c1.value == c0.value )|| (c5.value == c4.value && c4.value == c3.value )|| (c5.value == c4.value && c4.value == c2.value )|| (c5.value == c4.value && c4.value == c1.value )|| (c5.value == c4.value && c4.value == c0.value )|| (c5.value == c3.value && c3.value == c2.value )|| (c5.value == c3.value && c3.value == c1.value )|| (c5.value == c3.value && c3.value == c0.value )|| (c5.value == c2.value && c2.value == c1.value )|| (c5.value == c2.value && c2.value == c0.value )|| (c5.value == c1.value && c1.value == c0.value )|| (c4.value == c3.value && c3.value == c2.value )|| (c4.value == c3.value && c1.value == c0.value )|| (c4.value == c2.value && c2.value == c1.value )|| (c4.value == c2.value && c2.value == c0.value )|| (c4.value == c1.value && c1.value == c0.value )|| (c3.value == c3.value && c3.value == c1.value )|| (c3.value == c3.value && c3.value == c0.value )|| (c3.value == c1.value && c1.value == c0.value )|| (c2.value == c1.value && c1.value == c0.value ))
    {
        handValue = 15;
    }        
    // two pair
    else if( (c6.value == c5.value || (c6.value == c4.value || c6.value == c3.value|| c6.value == c2.value|| c6.value == c1.value|| c6.value == c0.value && c5.value == c4.value || c5.value == c3.value|| c5.value == c2.value|| c5.value == c1.value|| c5.value == c0.value || c4.value == c3.value|| c4.value == c2.value|| c4.value == c1.value|| c4.value == c0.value || c3.value == c2.value|| c3.value == c1.value|| c3.value == c0.value || c2.value == c1.value|| c2.value == c0.value|| c1.value == c0.value)) || ((c5.value == c3.value|| c5.value == c2.value|| c5.value == c1.value|| c5.value == c0.value && c4.value == c3.value|| c4.value == c2.value|| c4.value == c1.value|| c4.value == c0.value || c3.value == c2.value|| c3.value == c1.value|| c3.value == c0.value || c2.value == c1.value|| c2.value == c0.value|| c1.value == c0.value))||(c4.value == c3.value|| c4.value == c2.value|| c4.value == c1.value|| c4.value == c0.value && (c3.value == c2.value|| c3.value == c1.value|| c3.value == c0.value || c2.value == c1.value|| c2.value == c0.value|| c1.value == c0.value))||(c2.value == c1.value||c2.value == c0.value && (c1.value == c0.value)) || (c3.value == c2.value|| c3.value == c1.value|| (c3.value == c0.value && (c2.value == c1.value|| c2.value == c0.value|| c1.value == c0.value))))                           
    {
        handValue = 15;
    }
    //pair
    else if(c6.value == c5.value || c6.value == c4.value || c6.value == c3.value|| c6.value == c2.value|| c6.value == c1.value|| c6.value == c0.value || c5.value == c4.value || c5.value == c3.value|| c5.value == c2.value|| c5.value == c1.value|| c5.value == c0.value || c4.value == c3.value|| c4.value == c2.value|| c4.value == c1.value|| c4.value == c0.value || c3.value == c2.value|| c3.value == c1.value|| c3.value == c0.value || c2.value == c1.value|| c2.value == c0.value|| c1.value == c0.value     )    
     {
         handValue = 14;
     } 
    //high cards 
    else if(c0.value == 0   )
     {
       handValue = 13;
     }
     else if(c6.value == 12)
     {
         handValue = 12;
     }
     else if(c6.value ==11)
     {
         handValue = 11;
     }
     else if(c6.value == 10)
     {
         handValue = 10;
     }
     else if(c6.value == 9)
     {
         handValue = 9;
     }
     else if(c6.value == 8)
     {
         handValue = 8;
     }
     else if(c6.value == 7)
     {
         handValue = 7;
     }
     else if(c6.value == 6)
     {
         handValue = 6;
     }
     else if(c6.value == 5)
     {
         handValue = 5;
     }
     else if(c6.value == 4)
     {
         handValue = 4;
     }
     else if(c6.value == 3)
     {
         handValue = 3;
     }
     else if(c6.value == 2)
     {
         handValue = 2;
     }
     else if(c6.value == 1)
     {
         handValue = 1;
     }
     
     return handValue;
    }
}
