/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quadrado;

import br.edu.fasam.figurasgeometricasapp.Quadrado;
import junit.framework.TestCase;

/**
 *
 * @author herlan
 */
public class QuadradoTest extends TestCase {
    
    public QuadradoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
        public void testeCalcularPerimetro()
        {
            Quadrado quadrado = new Quadrado(5);
            assertEquals(20, quadrado.getPerimetro());
        }
        
        public void testCalcularArea()
        {
            Quadrado quadrado = new Quadrado(5);
            assertEquals(25.0, quadrado.getArea());
            
        }
}
