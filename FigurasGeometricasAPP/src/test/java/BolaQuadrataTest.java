
import br.edu.fasam.figurasgeometricasapp.BolaQuadrada;
import br.edu.fasam.figurasgeometricasapp.Retangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moises
 */
public class BolaQuadrataTest extends TestCase{
    
      @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
     public void testCalcularArea()
    {
        BolaQuadrada bola = new BolaQuadrada(4);
        assertEquals(2, bola.GetArea(16));
    }
}
