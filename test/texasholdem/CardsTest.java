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
public class CardsTest {
    
    public CardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSuit method, of class Cards.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Cards instance = new Cards(1,1);
        int expResult = 1;
        int result = instance.getSuit();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getValue method, of class Cards.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Cards instance = new Cards(1,1);
        int expResult = 1;
        int result = instance.getValue();
        System.out.print(result);
        assertEquals(expResult, result);
       
    }
    
    
   
    /**
     * Test of compareTo method, of class Cards.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Cards compareCard = new Cards(2,2);
        Cards instance = new Cards(2,3);
        int expResult = 1;
        int result = instance.compareTo(compareCard);
        assertEquals(expResult, result);
     
     
    }
    
}
