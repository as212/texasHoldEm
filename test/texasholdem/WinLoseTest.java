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
public class WinLoseTest {
    
    public WinLoseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of winLose method, of class WinLose.
     */
    @Test
    public void testWinLose() {
        System.out.println("winLose");
        int a = 1;
        WinLose instance = new WinLose();
        instance.winLose(a);
        assertEquals("Player" + a + "wins",instance.s);
        // TODO review the generated test code and remove the default call to fail.
      
    }

   
}
