/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.fasam.figurasgeometricasapp.TipoTrapezio;
import br.edu.fasam.figurasgeometricasapp.Trapezio;
import br.edu.fasam.figurasgeometricasapp.TrianguloKhalil;
import junit.framework.TestCase;

/**
 *
 * @author carlos
 */
public class TrapezioTest extends TestCase {
    
    public TrapezioTest(String testName) {
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

    public void testCalcularPerimetro()
    {
        Trapezio trap = new Trapezio();
                
        assertEquals(25, trap.CalcularPerimetro(5, 6, 7));
        
    }
    
    public void testCalcularArea()
    {
        Trapezio trap = new Trapezio();
        assertEquals(4, trap.CalcularArea(2,2,2));
    }
    
    public void testVerificarTipo()
    {
        Trapezio trap = new Trapezio();
        assertEquals(TipoTrapezio.Escaleno, trap.GetTipoTrapezio(3, 7));
        assertEquals(TipoTrapezio.Isoceles, trap.GetTipoTrapezio(5, 5));
    }
}
