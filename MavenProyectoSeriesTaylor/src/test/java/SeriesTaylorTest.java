/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hernan Javier
 */
public class SeriesTaylorTest {
    
    public SeriesTaylorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cosinus method, of class SeriesTaylor.
     */
    @Test
    public void testCosinus() {
        System.out.println("cosinus");
        float graus = (180*(float)(Math.PI/180) );
        float expResult = (float) -1.0000001 ;
        float result = SeriesTaylor.cosinus(graus);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sinus method, of class SeriesTaylor.
     */
    @Test
    public void testSinus() {
        System.out.println("sinus");
        float graus = (180*(float)(Math.PI/180) );
        float expResult = (float) -1.083978E-8;
        float result = SeriesTaylor.sinus(graus);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class SeriesTaylor.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int graus = 5;
        float expResult = (float) 120.0;
        float result = SeriesTaylor.factorial(graus);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pow method, of class SeriesTaylor.
     */
    @Test
    public void testPow() {
        System.out.println("pow");
        float graus = (float) 2.0;
        int n = 3;
        float expResult = (float) 8.0;
        float result = SeriesTaylor.pow(graus, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
