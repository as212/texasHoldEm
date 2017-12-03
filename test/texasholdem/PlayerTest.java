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
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getChips method, of class Player.
     */
    @Test
    public void testGetChips() {
        System.out.println("getChips");
        Player instance = new Player();
        instance.setChips(5);
        int expResult = 5;
        int result = instance.getChips();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of subtractChips method, of class Player.
     */
    @Test
    public void testSubtractChips() {
        System.out.println("subtractChips");
        int x = 5;
        Player instance = new Player();
        instance.setChips(12);
        int expResult = 7;
        int result = instance.subtractChips(x);
        assertTrue(5==x);
        assertTrue(expResult== result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addChips method, of class Player.
     */
    @Test
    public void testAddChips() {
        System.out.println("addChips");
        int x = 2;
        Player instance = new Player();
        instance.setChips(7);
        int expResult = 9;
        int result = instance.addChips(x);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHandValue method, of class Player.
     */
    @Test
    public void testSetHandValue() {
        System.out.println("setHandValue");
        int value = 0;
        Player instance = new Player();
        instance.setHandValue(value);
        // TODO review the generated test code and remove the default call to fail.
            }

    /**
     * Test of getHandValue method, of class Player.
     */
    @Test
    public void testGetHandValue() {
        System.out.println("getHandValue");
        Player instance = new Player();
        instance.setHandValue(4);
        int expResult = 4;
        int result = instance.getHandValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNewHand method, of class Player.
     */
    @Test
    public void testGetNewHand() {
        System.out.println("getNewHand");
        Player instance = new Player();
        instance.getNewHand();
        assertEquals(0,instance.hand.size());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addCard method, of class Player.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Cards c = new Cards(0,0);
        Player instance = new Player();
        instance.addCard(c);
        assertSame(c,instance.hand.get(0));
        
    }
    @Test
    public void testAddCardLaterInArray() {
        System.out.println("addCard");
        Cards c = new Cards(0,0);
        Cards d = new Cards(0,2);
        Player instance = new Player();
        instance.addCard(c);
        instance.addCard(d);
        
        
        assertSame(d,instance.hand.get(1));
        
    }

    /**
     * Test of sortHand method, of class Player.
     */
    @Test
    public void testSortHand() {
        System.out.println("sortHand");
        
        Player instance = new Player();
        Cards c = new Cards(0,0);
        Cards d = new Cards(1,1);
        instance.addCard(d);
        instance.addCard(c);
        
        
        instance.sortHand(instance.hand);
        assertSame(c,instance.hand.get(0));
        assertSame(d,instance.hand.get(1));
        
          }

    /**
     * Test of getTotalBet method, of class Player.
     */
    @Test
    public void testGetTotalBet() {
        System.out.println("getTotalBet");
        Player instance = new Player();
        
        int expResult = 0;
        int result = instance.getTotalBet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTotalBet method, of class Player.
     */
    @Test
    public void testSetTotalBet() {
        System.out.println("setTotalBet");
        int x = 4;
        Player instance = new Player();
        instance.setTotalBet(x);
        assertEquals(4,instance.getTotalBet());
        // TODO review the generated test code and remove the default call to fail.
            }

    /**
     * Test of setChips method, of class Player.
     */
    @Test
    public void testSetChips() {
        System.out.println("setChips");
        int x = 1;
        Player instance = new Player();
        instance.setChips(x);
        assertEquals(x,instance.getChips());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of resetTotalBet method, of class Player.
     */
    @Test
    public void testResetTotalBet() {
        System.out.println("resetTotalBet");
        Player instance = new Player();
        instance.resetTotalBet();
        assertEquals(20,instance.getChips());
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of didLose method, of class Player.
     */
    @Test
    public void testDidLose() {
        System.out.println("didLose");
        Player instance = new Player();
        instance.setChips(0);
        instance.didLose();
        
        assertEquals(1,instance.didLose);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
