/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adams_000
 */
public class checkCardsTest {
    
    public checkCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkCards method, of class checkCards.
     */
    @Test
    public void testCheckCards() {
        System.out.println("checkCards");
        Player p = new Player();
        Cards c1 = new Cards(0,0);
        Cards c2 = new Cards(1,9);
        Cards c3 = new Cards(0,2);
        Cards c4 = new Cards(1,5) ;       
        Cards c5 = new Cards(0,4);
        Cards c6 = new Cards(0,8);
        Cards c7 = new Cards(0,6) ;       
        p.addCard(c1);
        p.addCard(c2);
        p.addCard(c3);
        p.addCard(c4);
        p.addCard(c5);
        p.addCard(c6);
        p.addCard(c7);
        p.sortHand(p.hand);
        
        
        
        
        checkCards instance = new checkCards();
        int expResult = 12;
        int result = instance.checkCards(p.hand);
        System.out.print(result);
        System.out.print(expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
