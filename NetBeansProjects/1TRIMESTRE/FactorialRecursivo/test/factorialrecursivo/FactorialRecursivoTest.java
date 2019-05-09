/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrecursivo;

import static factorialrecursivo.FactorialRecursivo.factorial;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class FactorialRecursivoTest {
    
    public FactorialRecursivoTest() {
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
     * Test of factorial method, of class FactorialRecursivo.
     */
    



    /**
     * Test of factorial method, of class FactorialRecursivo.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int n = 0;
        int expResult = 0;
        int result = FactorialRecursivo.factorial(n);

        assertEquals (factorial(3),6);
    }
}
