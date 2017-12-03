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
public class AITest {
    
    public AITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of AIturn method, of class AI.
     */
    @Test
    public void testAIturnChipSubtraction() {
        System.out.println("AIturn");
        int difficulty = 0;
        int minimum = 2;
        Player a = new Player();
        a.subtractChips(4);
        AI instance = new AI();
        int expResult = 4;
        int result = instance.AIturn(difficulty, minimum, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testAIturnChipSubtractionHard() {
        System.out.println("AIturn");
        int difficulty = 1;
        int minimum = 2;
        Player a = new Player();
        Cards c1 = new Cards(0,0);
        
        
        a.subtractChips(4);
        AI instance = new AI();
        instance.addCard(c1);
        instance.addCard(c1);
        instance.addCard(c1);
        instance.addCard(c1);
        instance.addCard(c1);
        instance.addCard(c1);
        instance.addCard(c1);
        
        
        int expResult =4;
        int result = instance.AIturn(difficulty, minimum, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testAIturnChipSubtractionHard2() {
        System.out.println("AIturn");
        int difficulty = 1;
        int minimum = 2;
        Player a = new Player();
        a.subtractChips(4);
        AI instance = new AI();
        instance.setHandValue(15);
        int expResult = 5;
        int result = instance.AIturn(difficulty, minimum, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testAIturnDidLose() {
        System.out.println("AIturn");
        int difficulty = 1;
        int minimum = 2;
        Player a = new Player();
        a.subtractChips(4);
        AI instance = new AI();
        instance.didLose = 1;
        
        instance.setHandValue(15);
        int expResult = 0;
        int result = instance.AIturn(difficulty, minimum, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testAIturnDidFold() {
        System.out.println("AIturn");
        int difficulty = 1;
        int minimum = 2;
        Player a = new Player();
        a.subtractChips(4);
        AI instance = new AI();
        instance.didFold = 1;
        
        instance.setHandValue(15);
        int expResult = 0;
        int result = instance.AIturn(difficulty, minimum, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    

    /**
     * Test of allIn method, of class AI.
     */
    @Test
    public void testAllIn() {
        System.out.println("allIn");
        AI instance = new AI();
        int expResult = instance.getChips();
        int result = instance.allIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
