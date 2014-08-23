/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author F211
 */
public class ParcialTest {
    
    public ParcialTest() {
    }
    


    /**
     * Test of mayor method, of class Parcial.
     */
    @Test
    public void testMayorA() {
        System.out.println("mayorA");
        int A = 3;
        int B = 0;
        Parcial instance = new Parcial();
        String expResult = "A es el mayor";
        String result = instance.mayor(A, B);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
    
    @Test
    public void testMayorB() {
        System.out.println("mayorB");
        int A = 0;
        int B = 1;
        Parcial instance = new Parcial();
        String expResult = "B es el mayor";
        String result = instance.mayor(A, B);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
}
