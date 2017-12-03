/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adams_000
 */
public class OnePlayerTest {
    
    public OnePlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of updatePot method, of class OnePlayer.
     */
    @Test
    public void testUpdatePot() {
        
        System.out.println("updatePot");
        int x = 5;
        OnePlayer instance = new OnePlayer();
        int y = instance.updatePot(x);
        assertEquals(5,y);
        // TODO review the generated test code and remove the default call to fail.
        
    }

   

    /**
     * Test of resetPot method, of class OnePlayer.
     */
    @Test
    public void testResetPot() {
        System.out.println("resetPot");
        OnePlayer instance = new OnePlayer();
        instance.resetPot();
        assertEquals(0,instance.getPot());
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of updateChips method, of class OnePlayer.
     */
    @Test
    public void testUpdateChips() {
        System.out.println("updateChips");
        OnePlayer instance = new OnePlayer();
        
        instance.p1.getChips();
        String s = "Chips:" + instance.p1.getChips();
        instance.updateChips();
        assertTrue(s.equals("Chips:" + instance.p1.getChips()) );
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
     
    
    public void testGetWinnerdidLose() {
        System.out.println("getWinner");
        OnePlayer instance = new OnePlayer();
        
        instance.p1.setHandValue(5);
        instance.AI1.setHandValue(6);
        instance.AI2.setHandValue(7);
        instance.AI1.didFold = 1;
        instance.AI2.didLose = 1;
        instance.AI3.setHandValue(2);
        instance.setPot(5);
        instance.p1.setChips(0);
        instance.AI2.setChips(0);
        
        
       
        instance.getWinner();
        assertFalse(instance.AI2.getChips() == 5 );
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of deal method, of class OnePlayer.
     */
    
     @Test
    public void testDealCommunityCards() {
        System.out.println("deal");
        OnePlayer instance = new OnePlayer();
       
        instance.deal();
        
        assertSame(instance.cc1, instance.d.deck.get(8));
        assertSame(instance.cc2, instance.d.deck.get(9));
        assertSame(instance.cc3, instance.d.deck.get(10));
        assertSame(instance.cc4, instance.d.deck.get(11));
        assertSame(instance.cc5, instance.d.deck.get(12));
           // TODO review the generated test code and remove the default call to fail.
     
    }

    
    
    /**
     * Test of checkNegative method, of class OnePlayer.
     */
    @Test
    public void testCheckNegative() {
        System.out.println("checkNegative");
        Player p = new Player();
        OnePlayer instance = new OnePlayer();
        p.setChips(-1);
        instance.checkNegative(p);
        assertFalse(p.getChips()<0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of reset method, of class OnePlayer.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        OnePlayer instance = new OnePlayer();
        instance.reset();
        assertEquals(0,instance.p1.getTotalBet());
        assertEquals(0,instance.AI1.getTotalBet());
        assertEquals(0,instance.AI2.getTotalBet());
        assertEquals(0,instance.AI3.getTotalBet());
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

}

   