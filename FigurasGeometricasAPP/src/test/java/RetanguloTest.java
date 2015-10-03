
import br.edu.fasam.figurasgeometricasapp.Retangulo;
import junit.framework.TestCase;

/**
 *
 * @author carlos
 */
public class RetanguloTest extends TestCase {
    
    public RetanguloTest(String testName) {
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
    
    public void testCalcularArea()
    {
        Retangulo retangulo = new Retangulo();
        assertEquals(12, retangulo.CalcularArea(2, 6));
    }
}
