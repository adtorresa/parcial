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
    public void testMayor1() {
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
    public void testMayor2() {
        System.out.println("mayorB");
        int A = 0;
        int B = 1;
        Parcial instance = new Parcial();
        String expResult = "B es el mayor";
        String result = instance.mayor(A, B);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    
    @Test
    public void mayorABC1() {
        System.out.println("mayorABC1");
        int A = 3;
        int B = 2;
        int C = 1;
        Parcial instance = new Parcial();
        String expResult = "A es el mayor";
        String result = instance.mayor2(A, B, C);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    
    @Test
    public void mayorABC2() {
        System.out.println("mayorABC2");
        int A = 2;
        int B = 3;
        int C = 1;
        Parcial instance = new Parcial();
        String expResult = "B es el mayor";
        String result = instance.mayor2(A, B, C);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    
    @Test
    public void mayorABC3() {
        System.out.println("mayorABC3");
        int A = 2;
        int B = 1;
        int C = 3;
        Parcial instance = new Parcial();
        String expResult = "C es el mayor";
        String result = instance.mayor2(A, B, C);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    @Test
    public void suma1() {
        System.out.println("suma1");
        int N = 0;
        Parcial instance = new Parcial();
        String expResult = "suma";
        String result = instance.suma(N);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    @Test
    public void suma2() {
        System.out.println("suma2");
        int N = 11;
        Parcial instance = new Parcial();
        String expResult = "N es mayor";
        String result = instance.suma(N);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    @Test
    public void hipo() {
        System.out.println("hipo");
        int A = 2;
        int B = 2;
        Parcial instance = new Parcial();
        double expResult = 2.0;
        double result = instance.hipotenusa(A, B);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    
    
}
