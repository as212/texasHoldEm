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
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of deck method, of class Deck.
     */
    @Test
    public void testDeckNumberOfCards() {
        System.out.println("deck");
        Deck instance = new Deck();
        instance.deck();
        int deckSize = instance.deck.size();
        assertEquals(52,deckSize);
        
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.deck();
        instance.shuffle();
        Cards c1 = new Cards(0,0);
         Cards c2 = new Cards(0,1);
          Cards c3 = new Cards(0,2);
           Cards c4 = new Cards(0,3);
        assertNotSame(c1,instance.deck.get(0));
        
        
    }
    
}
